import java.util.List;
import java.util.Scanner;

public class CheckRoutes {

    public static void checkRoutes() {

        TheBestTruck[] trucks = {
                new TheBestTruck("Caminhão pequeno", 5.83, 1000.0),
                new TheBestTruck("Caminhão médio porte.", 13.42, 4000.0),
                new TheBestTruck("Caminhão grande", 29.21, 10000.0)
        };

        int cityOfOrigin;
        int cityOfDestination;
        Scanner scanner = new Scanner(System.in);
        CheckDistances checkDistances = new CheckDistances();

        List<String> listOfCities = checkDistances.getCities();

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

        //Verifica se a cidade de origem existe
        if (cityOfOrigin < 1 || cityOfOrigin > listOfCities.size()) {
            scanner.nextLine();
            System.out.println("Infelizmente não atendemos esta cidade, informe outra.");
            System.out.print("Digite o número da cidade de origem: ");
            cityOfOrigin = scanner.nextInt();
        }



        System.out.print("Digite o número da cidade de destino: ");
        cityOfDestination = scanner.nextInt();

        //Verifica se a cidade de destino existe
        if (cityOfDestination < 1 || cityOfDestination > listOfCities.size()) {
            scanner.nextLine();
            System.out.println("Infelizmente não atendemos esta cidade, informe outra.");
            System.out.print("Digite o número da cidade de destino: ");
            cityOfDestination = scanner.nextInt();
        }

        double cityDistance = checkDistances.getDistance(cityOfOrigin - 1, cityOfDestination - 1);

        System.out.println("Escolha o tamanho do caminhão: ");
        for (int i = 0; i < trucks.length; i++) {
            System.out.println(i + 1 + ": " + trucks[i].getClassification());
        }

        System.out.print("Digite o tamanho do caminhão: ");
        int truckSize = scanner.nextInt();

        if (truckSize < 1 || truckSize > trucks.length) {
            scanner.nextLine();
            System.out.println("Ops, o tamanho do caminhão digitado não existe.");
            System.out.print("Digite o tamanho do caminhão: ");
            truckSize = scanner.nextInt();
        }

        TheBestTruck truck = trucks[truckSize - 1];
        double totalCost = truck.getPricePerKm() * cityDistance;

        System.out.println("O Custo total será: " + totalCost);
        System.out.println("Distancia entre as cidades: " + cityDistance);


    }

}
