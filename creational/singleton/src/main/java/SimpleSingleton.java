import java.util.Date;

public class SimpleSingleton {
    public String value;
    private static SimpleSingleton instance;

    private SimpleSingleton(){
        this.value = "SimpleSingleton: " + new Date();
    }

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
