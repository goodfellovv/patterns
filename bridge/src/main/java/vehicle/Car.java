package vehicle;

import engines.Engine;

public class Car implements Vehicle {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void go() {
        engine.start();
        System.out.println("Car goes");
    }
}
