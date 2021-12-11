package products;

public class ProductB implements Product {
    public ProductB() {
        System.out.println("Product B created");
    }

    @Override
    public void printClassName() {
        System.out.println(this.getClass().getName());
    }
}
