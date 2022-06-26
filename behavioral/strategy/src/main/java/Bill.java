import strategies.Payment;

public class Bill {
    private Payment payment;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void pay(int amount) {
        System.out.println("Bill amount: " + amount);
        payment.pay();
        System.out.println("Bill has been paid");
    }
}
