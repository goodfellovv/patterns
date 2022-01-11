package vehicle;

import engines.Engine;

public class Car extends Vehicle {
    public Car(Engine engine) {
        super(engine);
    }

    @Override
    public void go() {
        System.out.println("Car goes");
        super.engine.start();
    }
}
