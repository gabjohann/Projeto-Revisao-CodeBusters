public class Main {
    public static void main(String[] args) {
        TheBestTruck[] trucks = {
                new TheBestTruck("Small", 5.83, 1000.0),
                new TheBestTruck("Two small trucks", 11.66, 2000.0),
                new TheBestTruck("Medium", 13.42, 4000.0),
                new TheBestTruck("Two medium trucks", 26.84, 8000.0),
                new TheBestTruck("Large", 29.21, 10000.0)
        };

        double distance = 500; // Defina a distância desejada em quilômetros.
        double weight = 3000;  // Defina o peso desejado em quilogramas.

        TheBestTruck mostCostEffectiveTruck = TruckCostBenefitCalculator.findMostCostEffectiveTruck(trucks, distance, weight);

        if (mostCostEffectiveTruck != null) {
            System.out.println("O caminhão mais econômico é o: " + mostCostEffectiveTruck.getClassification());
        } else {
            System.out.println("Nenhum caminhão adequado foi encontrado.");
        }
    }
}
