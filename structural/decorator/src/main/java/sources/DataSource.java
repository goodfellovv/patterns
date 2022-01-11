package sources;

public interface DataSource {
    void writeData(String data);

    String readData();
}
