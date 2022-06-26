package strategies;

public class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Pay by credit card");
    }
}
