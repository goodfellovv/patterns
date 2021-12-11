package creators;

import vehicles.Car;
import vehicles.Vehicle;

public class CarCreator implements Creator {
    @Override
    public Vehicle createVehicle() {
        System.out.println("Create Car");
        return new Car();
    }
}
