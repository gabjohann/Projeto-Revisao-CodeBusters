import java.util.Scanner;

public class MainTruck {
    public static void main(String[] args) {
        TheBestTruck small = new TheBestTruck("Small", 5.83, 2.0);
        TheBestTruck medium = new TheBestTruck("Medium", 13.42, 4.0);
        TheBestTruck large = new TheBestTruck("Large", 29.21, 10.0);

        Transport transport = new TransportService(small, medium, large);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance: ");
        double distance = scanner.nextDouble();
        System.out.print("Enter the weight: ");
        double weight = scanner.nextDouble();

        TheBestTruck cheapestTruck = transport.calculateCheapestTruck(distance, weight);

        System.out.println("The cheapest truck is " + cheapestTruck.getClassification());
    }
}
