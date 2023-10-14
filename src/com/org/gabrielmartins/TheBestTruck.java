public class TheBestTruck {
    private String classification;
    private double pricePerKm;
    private double maximumCapacity;

    public TheBestTruck(String classification, double pricePerKm, double maximumCapacity) {
        this.classification = classification;
        this.pricePerKm = pricePerKm;
        this.maximumCapacity = maximumCapacity;
    }

    public String getClassification() {
        return classification;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public double getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setPricePerKm(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public void setMaximumCapacity(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }


}
