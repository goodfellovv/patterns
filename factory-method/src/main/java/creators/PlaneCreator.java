package creators;

import vehicles.Plane;
import vehicles.Vehicle;

public class PlaneCreator implements Creator {
    @Override
    public Vehicle createVehicle() {
        System.out.println("Create Plane");
        return new Plane();
    }
}
