package creators;

import cars.Car;
import cars.Car.CarType;
import cars.toyota.Camry;
import cars.toyota.LandCruiser;

public class ToyotaCarCreator extends CarCreator {
    @Override
    public Car createCar(CarType type) {
        switch (type) {
            case SUV:
                return new LandCruiser();
            case SEDAN:
                return new Camry();
            default:
                throw new IllegalArgumentException("Car type is not supported");
        }
    }

}
