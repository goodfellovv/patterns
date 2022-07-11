import java.util.Date;

public class ThreadSaveSingleton {
    private static volatile ThreadSaveSingleton instance;

    public String value;

    private ThreadSaveSingleton(){
        this.value = "ThreadSaveSingleton: " + new Date();
    }

    public static ThreadSaveSingleton getInstance() {
        if (instance == null) {
            synchronized(ThreadSaveSingleton.class){
                instance = new ThreadSaveSingleton();
            }
        }
        return instance;
    }
}
