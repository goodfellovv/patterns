package cars.kia;

import cars.Car;

public abstract class Kia implements Car {
    @Override
    public void setEngine() {
        System.out.println("Kia engine");
    }

    @Override
    public void paint() {
        System.out.println("Kia firm color");
    }

    @Override
    public void getInfo() {
        System.out.println("Kia made in South Korea");
    }
}
