import strategies.CardPayment;
import strategies.CashPayment;
import strategies.PayPalPayment;

public class Main {
    public static void main(String[] args) {
        System.out.println("********** Order 1 **********");
        Order order1 = new Order();
        order1.setPaymentStrategy(new CardPayment());
        order1.processOrder(100);
        System.out.println("********** Order 1 **********\n");

        System.out.println("********** Order 2 **********");
        Order order2 = new Order();
        order2.setPaymentStrategy(new PayPalPayment());
        order2.processOrder(500);
        System.out.println("********** Order 1 **********\n");

        System.out.println("********** Order 3 **********");
        Order order3 = new Order();
        order3.setPaymentStrategy(new CashPayment());
        order3.processOrder(1000);
        System.out.println("********** Order 3 **********\n");

    }
}
