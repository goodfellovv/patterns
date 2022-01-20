package strategies;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Pay by cash");
    }
}
