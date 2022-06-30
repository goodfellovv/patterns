import cars.Car;
import cars.Car.CarType;
import creators.CarCreator;
import creators.KiaCarCreator;
import creators.MercedesCarCreator;
import creators.ToyotaCarCreator;

public class Main {
    public static void main(String[] args) {
        createAndPrintCarInfo(new ToyotaCarCreator(), CarType.SEDAN);
        createAndPrintCarInfo(new ToyotaCarCreator(), CarType.SUV);
        createAndPrintCarInfo(new MercedesCarCreator(), CarType.SEDAN);
        createAndPrintCarInfo(new MercedesCarCreator(), CarType.SUV);
        createAndPrintCarInfo(new KiaCarCreator(), CarType.SEDAN);
        createAndPrintCarInfo(new KiaCarCreator(), CarType.SUV);
    }

    public static void createAndPrintCarInfo(CarCreator creator, CarType type){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Car car = creator.assembleCar(type);
        System.out.println("________________________________________");
        car.getInfo();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
