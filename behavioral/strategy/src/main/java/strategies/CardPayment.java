package strategies;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Pay by credit card");
    }
}
