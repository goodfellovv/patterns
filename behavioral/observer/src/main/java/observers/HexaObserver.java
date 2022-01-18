package observers;

public class HexaObserver implements Observer {
    protected String data;

    public HexaObserver(String data) {
        System.out.println("Initial hex data: " + data);
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
