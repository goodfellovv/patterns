package strategies;

public class OnlinePayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Pay by PayPal or WebMoney");
    }
}
