import java.util.*;
import java.util.Map;

public class RegisterTransport {
    public static void transportRegister() {
        Scanner scanner = new Scanner(System.in);
        int cityOfOrigin;
        int cityOfDestination;
        int quantityProducts;
        int productNumber;
        int quantityPerProduct;

        CheckDistances checkDistances = new CheckDistances();

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

        TypesAndWeight typesAndWeightCalculator = new TypesAndWeight();
        double totalWeight = typesAndWeightCalculator.calculateTotalWeight();


        for (int i = 0; i < quantityProducts; i++) {
            System.out.print("Digite o número do produto desejado: ");
            productNumber = scanner.nextInt();
            System.out.print("Digite a quantidade desejada: ");
            quantityPerProduct = scanner.nextInt();

            desiredProducts.put(productNumber, quantityPerProduct);
        }

        TheBestTruck[] trucks = {
                new TheBestTruck("Caminhão pequeno", 5.83, 1000.0),
                new TheBestTruck("Caminhão médio porte", 13.42, 4000.0),
                new TheBestTruck("Caminhão grande", 29.21, 10000.0)
        };


        double cityDistance = checkDistances.getDistance(cityOfOrigin - 1, cityOfDestination - 1);

        TheBestTruck mostCostEffectiveTruck = TruckCostBenefitCalculator.findMostCostEffectiveTruck(trucks, cityDistance, totalWeight);

        if (mostCostEffectiveTruck != null) {
            System.out.println("O caminhão mais econômico é: " + mostCostEffectiveTruck.getClassification());
            double totalCost = mostCostEffectiveTruck.calculateCostPerKm(cityDistance);
            System.out.println("Custo total estimado: " + totalCost);
        } else {
            System.out.println("Não há caminhões disponíveis que atendam aos requisitos de capacidade.");
        }
    }
}





