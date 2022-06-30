import decorators.CompressionDecorator;
import decorators.DataSourceDecorator;
import decorators.EncryptDecorator;
import sources.FileDataSource;

public class Main {
    public static void main(String[] args) {
        String data = "data to write";
        System.out.println("***************** CompressionDecorator ******************");
        DataSourceDecorator compressionDecorator = new CompressionDecorator(new FileDataSource());
        compressionDecorator.writeData(data);
        compressionDecorator.readData();

        System.out.println("***************** EncryptDecorator ******************");
        DataSourceDecorator encryptDecorator = new EncryptDecorator(new FileDataSource());
        encryptDecorator.writeData(data);
        encryptDecorator.readData();
    }
}
