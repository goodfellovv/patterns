import decorators.CompressionDecorator;
import decorators.DataSourceDecorator;
import sources.FileDataSource;

public class Main {
    public static void main(String[] args) {
        String data = "data to write";
        DataSourceDecorator decorator = new CompressionDecorator(new FileDataSource());
        decorator.writeData(data);
        decorator.readData();
    }
}
