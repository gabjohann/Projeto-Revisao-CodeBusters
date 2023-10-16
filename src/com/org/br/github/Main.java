import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* DECLARAÇÃO DOS CAMINHÕES */

        TheBestTruck[] trucks = {
                new TheBestTruck("Caminhão pequeno", 5.83, 1000.0),
                new TheBestTruck("Dois caminhões pequenos", 11.66, 2000.0),
                new TheBestTruck("Caminhão médio porte.", 13.42, 4000.0),
                new TheBestTruck("Dois caminhões médios.", 26.84, 8000.0),
                new TheBestTruck("Caminhão grande", 29.21, 10000.0)
        };

        /* MENU DE OPÇÕES */

        Menu mainMenu = new Menu();

        mainMenu.menu();

    }
}




//import java.util.Scanner;
//
//public class Main {
//
//    //Estabelece os diferentes caminhões
//    public static void main(String[] args) {
//
//        TheBestTruck[] trucks = {
//                new TheBestTruck("Caminhão pequeno", 5.83, 1000.0),
//                new TheBestTruck("Dois caminhões pequenos", 11.66, 2000.0),
//                new TheBestTruck("Caminhão médio porte.", 13.42, 4000.0),
//                new TheBestTruck("Dois caminhões médios.", 26.84, 8000.0),
//                new TheBestTruck("Caminhão grande", 29.21, 10000.0)
//        };
//
//        //Input da distância e peso
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite a distância (em quilômetros): ");
//        double distance = scanner.nextDouble();
//
//        System.out.print("Digite o peso (em quilogramas): ");
//        double weight = scanner.nextDouble();
//
//         //Busca o caminhão mais custo benefício
//        TheBestTruck mostCostEffectiveTruck = TruckCostBenefitCalculator.findMostCostEffectiveTruck(trucks, distance, weight);
//
//         //Loop para mostrar o caminhão mais custo benefício
//        if (mostCostEffectiveTruck != null) {
//            System.out.println("O caminhão mais adequado é/são: " + mostCostEffectiveTruck.getClassification());
//        } else {
//            System.out.println("Nenhum caminhão adequado foi encontrado.");
//        }
//
//        // Fechamento do scanner.
//        scanner.close();
//    }
//}
