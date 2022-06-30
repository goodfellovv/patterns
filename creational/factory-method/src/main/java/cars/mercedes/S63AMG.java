package cars.mercedes;

public class S63AMG extends Mercedes {
    @Override
    public void setCarcase() {
        System.out.println("Sedan carcase");
    }

    @Override
    public void setEngine(){
        System.out.println("AMG engine");
    }

    @Override
    public void paint(){
        System.out.println("AMG color style");
    }
}
