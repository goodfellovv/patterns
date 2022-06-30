package cars.toyota;

public class LandCruiser extends Toyota {
    @Override
    public void setCarcase() {
        System.out.println("Suv carcase");
    }

    @Override
    public void setEngine(){
        System.out.println("Toyota V8 engine");
    }
}
