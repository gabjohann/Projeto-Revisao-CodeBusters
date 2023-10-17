import java.util.*;

public class RegisterTransport {

    public static void transportRegister() {
        Scanner scanner = new Scanner(System.in);
        int cityOfOrigin;
        int cityOfDestination;
        int quantityProducts;
        int productNumber;
        int quantityPerProduct;

        CheckDistances checkDistances = new CheckDistances();

        List<String> ListOfTransports = new ArrayList<>(List.of("Caminhão pequeno", "Caminhão médio.", "Caminhão grande"));
        List<String> listOfCities = checkDistances.getCities();
        List<String> listOfProducts = new ArrayList<>(List.of("Celular", "Geladeira", "Air Fryer", "Cadeira", "Luminária", "Lavadora de Roupa", "PlayStation 5", "Nintendo Switch"));
        Map<Integer, Integer> desiredProducts = new HashMap<>();

        System.out.println("Seja bem vindo(a) a Amarelinha! A empresa com transporte mais rápido do planeta.");
        System.out.println("Cidades atendidas: ");

        for (int i = 0; i < listOfCities.size(); i++) {
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.print((i + 1 + ":" + listOfCities.get(i)) + "  ");
        }

        System.out.println();
        System.out.print("Digite o número da cidade de origem: ");
        cityOfOrigin = scanner.nextInt();

        if (cityOfOrigin < 1 || cityOfOrigin > listOfCities.size()) {
            scanner.nextLine();
            System.out.println("Infelizmente não atendemos esta cidade, informe outra.");
            System.out.print("Digite o número da cidade de origem: ");
            cityOfOrigin = scanner.nextInt();
        }

        System.out.print("Digite o número da cidade de destino: ");
        cityOfDestination = scanner.nextInt();

        if (cityOfDestination < 1 || cityOfDestination > listOfCities.size()) {
            scanner.nextLine();
            System.out.println("Infelizmente não atendemos esta cidade, informe outra.");
            System.out.print("Digite o número da cidade de destino: ");
            cityOfDestination = scanner.nextInt();
        }

        double cityDistance = checkDistances.getDistance(cityOfOrigin - 1, cityOfDestination - 1);

        // Produtos a partir daqui.
        System.out.println("Produtos que transportamos: ");
        for (int i = 0; i < listOfProducts.size(); i++) {
            System.out.print(listOfProducts.get(i));

            if (i < listOfProducts.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("\nQuantos produtos distintos você deseja transportar? ");
        quantityProducts = scanner.nextInt();
        System.out.println("\nMenu de produtos:");

        for (int i = 0; i < listOfProducts.size(); i++) {
            System.out.println(i + 1 + ": " + listOfProducts.get(i));
        }

        System.out.println();

        for (int i = 0; i < quantityProducts; i++) {
            System.out.print("Digite o número do produto desejado: ");
            productNumber = scanner.nextInt();
            System.out.print("Digite a quantidade desejada: ");
            quantityPerProduct = scanner.nextInt();

            desiredProducts.put(productNumber, quantityPerProduct);
        }

        // Calcula o peso total dos produtos
        int totalWeight = calculateTotalWeight(desiredProducts, listOfProducts);

        // Determina o melhor caminhão com base no peso total
        String bestTruck = determineBestTruck(totalWeight, ListOfTransports);

        System.out.println("O melhor caminhão para transportar os produtos é: " + bestTruck);

        System.out.println("Mostrar a distância das cidades e custo total estimado para o trecho");
    }

    // Calcula o peso total dos produtos
    private static int calculateTotalWeight(Map<Integer, Integer> desiredProducts, List<String> listOfProducts) {
        int totalWeight = 0;
        for (Map.Entry<Integer, Integer> entry : desiredProducts.entrySet()) {
            int productNumber = entry.getKey();
            int quantity = entry.getValue();
            if (productNumber > 0 && productNumber <= listOfProducts.size()) {
                // Supondo que cada produto tenha um peso associado a ele
                // Você pode ajustar isso com base em seus dados
                int productWeight = getProductWeight(productNumber);
                totalWeight += productWeight * quantity;
            }
        }
        return totalWeight;
    }

    // Determina o melhor caminhão com base no peso total
    private static String determineBestTruck(int totalWeight, List<String> ListOfTransports) {
        int smallTruckCapacity = 1000;
        int mediumTruckCapacity = 4000;

        if (totalWeight <= smallTruckCapacity) {
            return ListOfTransports.get(0); // Caminhão pequeno
        } else if (totalWeight <= mediumTruckCapacity) {
            return ListOfTransports.get(1); // Caminhão de médio porte
        } else {
            return ListOfTransports.get(2); // Caminhão grande
        }
    }

    // Método auxiliar para obter o peso de um produto (você deve definir isso com base em seus dados)
    private static int getProductWeight(int productNumber) {
        // Substitua isso por uma pesquisa real de peso do produto
        // Retorne o peso do produto com base no número do produto
        return 0;
    }
}
