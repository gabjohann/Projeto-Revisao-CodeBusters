public class Product {
    private String productName;
    private double productWeight;

    public Product(String name, double weight) {
        this.productName = name;
        this.productWeight = weight;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }
}
