public class TheBestTruck {
    private String classification;
    private double pricePerKm;
    private double maximumCapacity;

    public TheBestTruck(String classification, double pricePerKm, double maximumCapacity) {
        this.classification = classification;
        this.pricePerKm = pricePerKm;
        this.maximumCapacity = maximumCapacity;
    }

    // Os getters são utilizados para obter os valores das variáveis de instância, não utilizamos setters, pois não iremos alterar os valores
    public String getClassification() {
        return classification;
    }

    public double getMaximumCapacity() {
        return maximumCapacity;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    // Calcula o custo por km pegando o preço por km * a distância fornecida
    public double calculateCostPerKm(double distance) {
        return pricePerKm * distance;
    }

}
