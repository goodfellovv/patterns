package vehicle;

import engines.Engine;

public class Track extends Vehicle {

    public Track(Engine engine) {
        super(engine);
    }

    @Override
    public void go() {
        System.out.println("Track goes");
        super.engine.start();
    }
}
