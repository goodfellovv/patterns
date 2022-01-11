import factories.FactoryA;
import factories.FactoryB;

public class Main {
    public static void main(String[] args) {
        Application application = new Application(new FactoryA());
        application.getProduct().printClassName();
        application = new Application(new FactoryB());
        application.getProduct().printClassName();
    }
}
