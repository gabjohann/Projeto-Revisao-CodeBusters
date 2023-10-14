// Implementation class of the interface
public class TransportService implements Transport {
    private final TheBestTruck[] trucks;

    // Constructor that accepts an array of trucks
    public TransportService(TheBestTruck... trucks) {
        this.trucks = trucks;
    }

    @Override
    public TheBestTruck calculateCheapestTruck(double distance, double weight) {
        double minimumCost = Double.MAX_VALUE;
        TheBestTruck cheapestTruck = null;

        // Loop through the available trucks
        for (TheBestTruck truck : trucks) {
            // Check if the weight is within the truck's maximum capacity
            if (weight <= truck.getMaximumCapacity()) {
                // Calculate the cost based on the distance and price per kilometer
                double cost = distance * truck.getPricePerKm();
                // Update the cheapest truck if this truck is cheaper
                if (cost < minimumCost) {
                    minimumCost = cost;
                    cheapestTruck = truck;
                }
            }
        }

        // Return the cheapest truck
        return cheapestTruck;
    }
}
