public class Main {
    public static void main(String[] args) {
        Thread threadSimpleSingleton_1 = new Thread(new ThreadSimpleSingleton_1());
        Thread threadSimpleSingleton_2 = new Thread(new ThreadSimpleSingleton_2());
        threadSimpleSingleton_1.start();
        threadSimpleSingleton_2.start();

        Thread threadSaveSingleton_1 = new Thread(new ThreadSaveSingleton_1());
        Thread threadSaveSingleton_2 = new Thread(new ThreadSaveSingleton_2());
        threadSaveSingleton_1.start();
        threadSaveSingleton_2.start();
    }

    static class ThreadSimpleSingleton_1 implements Runnable {
        @Override
        public void run() {
            SimpleSingleton singleton = SimpleSingleton.getInstance("SimpleSingleton_1");
            System.out.println(singleton.value);
        }
    }

    static class ThreadSimpleSingleton_2 implements Runnable {
        @Override
        public void run() {
            SimpleSingleton singleton = SimpleSingleton.getInstance("SimpleSingleton_2");
            System.out.println(singleton.value);
        }
    }

    static class ThreadSaveSingleton_1 implements Runnable {
        @Override
        public void run() {
            ThreadSaveSingleton singleton = ThreadSaveSingleton.getInstance("ThreadSaveSingleton_1");
            System.out.println(singleton.value);
        }
    }

    static class ThreadSaveSingleton_2 implements Runnable {
        @Override
        public void run() {
            ThreadSaveSingleton singleton = ThreadSaveSingleton.getInstance("ThreadSaveSingleton_2");
            System.out.println(singleton.value);
        }
    }
}
