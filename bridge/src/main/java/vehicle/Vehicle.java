package vehicle;

import engines.Engine;

public abstract class Vehicle {

    //Bridge
    protected Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public abstract void go();
}
