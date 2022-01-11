package factories;

import products.Product;
import products.ProductA;

public class FactoryA implements AbstractFactory {
    @Override
    public Product createProduct() {
        System.out.println("Factory A produce product A");
        return new ProductA();
    }
}
