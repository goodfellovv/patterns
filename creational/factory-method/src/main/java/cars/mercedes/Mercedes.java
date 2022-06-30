package cars.mercedes;

import cars.Car;

public abstract class Mercedes implements Car {
    @Override
    public void setEngine() {
        System.out.println("Mercedes engine");
    }

    @Override
    public void paint() {
        System.out.println("Mercedes firm color");
    }

    @Override
    public void getInfo() {
        System.out.println("Mercedes made in Germany");
    }
}
