package products_b;

public class ProductB1 implements ProductB {
    public ProductB1() {
        System.out.println("Product B1 created");
    }

    @Override
    public void printClassName() {
        System.out.println(this.getClass().getName());
    }
}
