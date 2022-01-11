package vehicles;

public class Submarine implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Launch nuclear engine");
    }

    @Override
    public void go() {
        System.out.println("Diving deep!");
    }
}
