package factories;

import products_a.ProductA;
import products_a.ProductA1;
import products_b.ProductB;
import products_b.ProductB1;
import products_b.ProductB2;

public class Factory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        System.out.println("Factory 1 produce product A1");
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        System.out.println("Factory 1 produce product B1");
        return new ProductB1();
    }
}
