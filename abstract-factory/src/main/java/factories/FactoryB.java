package factories;

import products.Product;
import products.ProductB;

public class FactoryB implements AbstractFactory {
    @Override
    public Product createProduct() {
        System.out.println("Factory B produce product B");
        return new ProductB();
    }
}
