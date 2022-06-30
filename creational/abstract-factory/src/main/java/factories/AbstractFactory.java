package factories;

import products_a.ProductA;
import products_b.ProductB;

public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();

}
