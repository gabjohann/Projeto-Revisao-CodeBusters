public class Product {
    private String productName;
    private double productWeight;
    private double totalWeight;


    public Product(String name, double weight) {
        this.productName = name;
        this.productWeight = weight;
        this.totalWeight = weight;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }
}
