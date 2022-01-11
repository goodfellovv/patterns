public class ThreadSaveSingleton {
    private static volatile ThreadSaveSingleton instance;

    public String value;

    private ThreadSaveSingleton(String value){
        this.value = value;
    }

    public static ThreadSaveSingleton getInstance(String value) {
        synchronized(ThreadSaveSingleton.class){
            if (instance == null) {
                instance = new ThreadSaveSingleton(value);
            }
            return instance;
        }
    }
}
