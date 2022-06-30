package creators;

import cars.Car;
import cars.Car.CarType;
import cars.mercedes.G63;
import cars.mercedes.S63AMG;

public class MercedesCarCreator extends CarCreator {
    @Override
    public Car createCar(CarType type) {
        switch (type) {
            case SUV:
                return new G63();
            case SEDAN:
                return new S63AMG();
            default:
                throw new IllegalArgumentException("Car type is not supported");
        }
    }
}
