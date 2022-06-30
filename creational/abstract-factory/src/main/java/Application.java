import factories.AbstractFactory;
import products_a.ProductA;
import products_b.ProductB;

public class Application {
    private final ProductB productB;
    private final ProductA productA;

    public Application(AbstractFactory factory) {
        productB = factory.createProductB();
        productA = factory.createProductA();
    }

    public ProductA getProductA() {
        return this.productA;
    }
    public ProductB getProductB() {
        return this.productB;
    }
}
