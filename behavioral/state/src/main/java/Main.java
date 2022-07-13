import context.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.turnOn());
        System.out.println(phone.unlock());
        System.out.println(phone.home());
        System.out.println(phone.lock());
    }
}
