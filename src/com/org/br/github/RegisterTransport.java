import java.util.*;
import java.util.Scanner;

public class TransportRegister {

    public static void transportRegister() {

        Scanner scanner = new Scanner(System.in);
        String cityOfOrigin;
        String cityOfDestination;
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
        cityOfOrigin = scanner.next();

        if (Integer.parseInt(cityOfOrigin) < 1 || Integer.parseInt(cityOfOrigin) > listOfCities.size()) {
            scanner.nextLine();
            System.out.println("Infelizmente não atendemos esta cidade, informe outra.");
            System.out.print("Digite o número da cidade de origem: ");
            cityOfOrigin = scanner.next();
        }

        System.out.print("Digite o número da cidade de destino: ");
        cityOfDestination = scanner.next();

        if (Integer.parseInt(cityOfDestination) < 1 || Integer.parseInt(cityOfDestination) > listOfCities.size()) {
            scanner.nextLine();
            System.out.println("Infelizmente não atendemos esta cidade, informe outra.");
            System.out.print("Digite o número da cidade de destino: ");
            cityOfDestination = scanner.next();
        }


        System.out.println("Produtos que transportamos: ");
        for (int i = 0; i < listOfProducts.size(); i++) {
            System.out.print(listOfProducts.get(i));

            if (i < listOfProducts.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("\nQuantos produtos destintos você deseja transportar? ");
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


        System.out.println("Mostrar a distância das cidades e custo total estimado para o trecho");
    }
}