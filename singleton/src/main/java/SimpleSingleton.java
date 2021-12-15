public class SimpleSingleton {
    public String value;
    private static SimpleSingleton instance;

    private SimpleSingleton(String value){
        this.value = value;
    }

    public static SimpleSingleton getInstance(String value) {
        if (instance == null) {
            instance = new SimpleSingleton(value);
        }
        return instance;
    }
}
