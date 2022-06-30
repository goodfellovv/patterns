package creators;

import cars.Car;
import cars.Car.CarType;
import cars.kia.Sorento;
import cars.kia.Stinger;

public class KiaCarCreator extends CarCreator {
    @Override
    public Car createCar(CarType type) {
        switch (type){
            case SUV:
                return new Sorento();
            case SEDAN:
                return new Stinger();
            default:
                throw new IllegalArgumentException("Car type is not supported");
        }
    }
}
