import strategies.CardPayment;
import strategies.CashPayment;
import strategies.OnlinePayment;

public class Main {
    public static void main(String[] args) {
        System.out.println("********** Bill part 1 [by card] **********");
        Bill order1 = new Bill();
        order1.setPayment(new CardPayment());
        order1.pay(100);
        System.out.println("********** Bill part 2 [by card] **********\n");

        System.out.println("********** Bill part 2 [online] **********");
        Bill order2 = new Bill();
        order2.setPayment(new OnlinePayment());
        order2.pay(500);
        System.out.println("********** Bill part 3 [online] **********\n");

        System.out.println("********** Bill part 3 [by cash] **********");
        Bill order3 = new Bill();
        order3.setPayment(new CashPayment());
        order3.pay(1000);
        System.out.println("********** Bill part 3 [by cash] **********\n");

    }
}
