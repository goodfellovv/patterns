package creators;

import vehicles.Submarine;
import vehicles.Vehicle;

public class SubmarineCreator extends Creator {
    @Override
    public Vehicle createVehicle() {
        System.out.println("Create Submarine");
        printCountrySuplier("Submarine", "Russia");
        return new Submarine();
    }
}
