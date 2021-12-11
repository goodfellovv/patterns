package creators;

import vehicles.Car;
import vehicles.Vehicle;

public class CarCreator extends Creator {
    @Override
    public Vehicle createVehicle() {
        System.out.println("Create Car");
        printCountrySuplier("Car", "Germany");
        return new Car();
    }
}
