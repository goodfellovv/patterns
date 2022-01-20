import strategies.PaymentStrategy;

public class Order {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder(int amount){
        System.out.println("Order amount: " + amount);
        paymentStrategy.pay();
        System.out.println("Order has been paid");
    }

}
