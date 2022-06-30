package factories;

import products_a.ProductA;
import products_a.ProductA2;
import products_b.ProductB;
import products_b.ProductB2;

public class Factory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        System.out.println("Factory 2 produce product A2");
        return new ProductA2();
    }
    @Override
    public ProductB createProductB() {
        System.out.println("Factory 2 produce product B2");
        return new ProductB2();
    }
}
