import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testProductInitialization() {
        // Test the constructor and getter methods
        Product product = new Product("TestGetProduct", 10.0);

        assertEquals("TestProduct", product.getProductName());
        assertEquals(10.0, product.getProductWeight());
        assertEquals(10.0, product.getTotalWeight());
    }

    @Test
    public void testSetters() {
        // Test the setter methods
        Product product = new Product("TestSetProduct", 10.0);

        product.setProductName("UpdatedProduct");
        product.setProductWeight(15.0);
        product.setTotalWeight(25.0);

        assertEquals("UpdatedProduct", product.getProductName());
        assertEquals(15.0, product.getProductWeight());
        assertEquals(25.0, product.getTotalWeight());
    }
}
