package products_b;

public class ProductB2 implements ProductB {
    public ProductB2() {
        System.out.println("Product B2 created");
    }

    @Override
    public void printClassName() {
        System.out.println(this.getClass().getName());
    }
}
