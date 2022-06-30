package cars.toyota;

import cars.Car;

public abstract class Toyota implements Car {
    @Override
    public void setEngine() {
        System.out.println("Toyota engine");
    }

    @Override
    public void paint() {
        System.out.println("Toyota firm color");
    }

    @Override
    public void getInfo() {
        System.out.println("Toyota made in Japan");
    }
}

