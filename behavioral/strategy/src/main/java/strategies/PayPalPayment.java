package strategies;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Pay by PayPal");
    }
}
