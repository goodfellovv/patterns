public class ThreadSaveSingleton {
    private static volatile ThreadSaveSingleton instance;

    public String value;

    private ThreadSaveSingleton(String value){
        this.value = value;
    }

    public static ThreadSaveSingleton getInstance(String value) {
        if (instance == null) {
            synchronized(ThreadSaveSingleton.class){
                instance = new ThreadSaveSingleton(value);
            }
        }
        return instance;
    }
}
