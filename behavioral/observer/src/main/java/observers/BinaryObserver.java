package observers;

public class BinaryObserver implements Observer {
    private String data;

    public BinaryObserver(String data) {
        System.out.println("Initial binary data: " + data);
        this.data = data;
    }

    @Override
    public void update(String data) {
        System.out.println("Update: " + getClass().getSimpleName() + " observer");
        this.data = data;
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + " data " + this.data);
    }
}
