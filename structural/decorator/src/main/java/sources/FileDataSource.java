package sources;


public class FileDataSource implements DataSource {
    private String data;

    @Override
    public void writeData(String data) {
        System.out.println("Write to file: " + data);
        this.data = data;
    }

    @Override
    public String readData() {
        System.out.println("Read data from file");
        return this.data;
    }
}
