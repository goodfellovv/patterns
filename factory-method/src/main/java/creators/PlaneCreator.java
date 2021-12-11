package creators;

import vehicles.Plane;
import vehicles.Vehicle;

public class PlaneCreator extends Creator {
    @Override
    public Vehicle createVehicle() {
        System.out.println("Create Plane");
        return new Plane();
    }
}
