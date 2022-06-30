package cars.kia;

public class Stinger extends Kia {
    @Override
    public void setCarcase() {
        System.out.println("Sedan carcase");
    }

    @Override
    public void paint(){
        System.out.println("Sport style color");
    }
}
