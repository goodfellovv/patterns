package products;

public class ProductA implements Product {
    public ProductA() {
        System.out.println("Product A created");
    }

    @Override
    public void printClassName() {
        System.out.println(this.getClass().getName());
    }
}
