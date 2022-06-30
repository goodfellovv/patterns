package cars;

public interface Car {
    enum CarType {
        SUV,
        SEDAN
    }
    void setCarcase();
    void setEngine();
    void paint();
    void getInfo();

}
