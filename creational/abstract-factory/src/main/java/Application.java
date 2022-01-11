import factories.AbstractFactory;
import products.Product;

public class Application {
    private final Product product;

    public Application(AbstractFactory factory) {
        product = factory.createProduct();
    }

    public Product getProduct() {
        return this.product;
    }
}
