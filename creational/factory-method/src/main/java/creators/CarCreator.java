package creators;

import cars.Car;
import cars.Car.CarType;

public abstract class CarCreator {
    public Car assembleCar(CarType type) {
        Car car = createCar(type);
        car.setCarcase();
        car.setEngine();
        car.paint();
        return car;
    }

    protected abstract Car createCar(CarType type);
}
