package products_a;

public class ProductA1 implements ProductA {
    public ProductA1() {
        System.out.println("Product A1 created");
    }

    @Override
    public void printClassName() {
        System.out.println(this.getClass().getName());
    }
}
