package vehicles;

public class Plane implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Launch jet engine");
    }

    @Override
    public void go() {
        System.out.println("Flying out!");
    }
}
