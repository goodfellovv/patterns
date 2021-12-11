package vehicles;

public class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Launch internal combustion engine");
    }

    @Override
    public void go() {
        System.out.println("Driving out!");
    }
}
