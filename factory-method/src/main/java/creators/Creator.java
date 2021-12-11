package creators;

import vehicles.Vehicle;

public abstract class Creator {
    public abstract Vehicle createVehicle();

    public void printCountrySuplier(String vehicle, String country){
        System.out.println("[" + vehicle + " made in " + country + "]");
    }
}
