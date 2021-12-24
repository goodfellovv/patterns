import engines.HybridEngine;
import engines.InternalCombustionEngine;
import vehicle.Car;
import vehicle.Track;
import vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(new InternalCombustionEngine()),
                new Car(new HybridEngine()),
                new Track(new InternalCombustionEngine()),
                new Track(new HybridEngine())
        };

        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
