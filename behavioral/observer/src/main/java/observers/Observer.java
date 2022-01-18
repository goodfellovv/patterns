package observers;

public interface Observer {
    void update(String info);
    String name();
    void print();
}
