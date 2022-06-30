import factories.Factory1;
import factories.Factory2;

public class Main {
    public static void main(String[] args) {
        Application application = new Application(new Factory1());
        application.getProductA().printClassName();
        application = new Application(new Factory2());
        application.getProductA().printClassName();
    }
}
