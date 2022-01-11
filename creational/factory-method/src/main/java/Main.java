import creators.CarCreator;
import creators.Creator;
import creators.PlaneCreator;
import creators.SubmarineCreator;
import vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********************************");

        Creator creator = new CarCreator();
        useVehicle(creator.createVehicle());

        System.out.println("**********************************");

        creator = new PlaneCreator();
        useVehicle(creator.createVehicle());

        System.out.println("**********************************");

        creator = new SubmarineCreator();
        useVehicle(creator.createVehicle());
    }

    private static void useVehicle(Vehicle vehicle){
        vehicle.startEngine();
        vehicle.go();
    }
}
