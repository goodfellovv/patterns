package vehicle;

import engines.Engine;

public class Track implements Vehicle{
    Engine engine;

    public Track(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void go() {
        engine.start();
        System.out.println("Track goes");
    }
}
