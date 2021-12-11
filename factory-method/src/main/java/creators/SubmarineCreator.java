package creators;

import vehicles.Submarine;
import vehicles.Vehicle;

public class SubmarineCreator implements Creator {
    @Override
    public Vehicle createVehicle() {
        System.out.println("Create Submarine");
        return new Submarine();
    }
}
