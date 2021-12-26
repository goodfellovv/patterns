package decorators;

import sources.DataSource;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Compression decorator writes data: " + data);
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        System.out.println("Compression decorator read data");
        return decompress(super.readData());
    }

    private String compress(String stringData) {
        return "Compressed data: " + stringData;
    }

    private String decompress(String stringData) {
        return "Decompressed data: " + stringData;
    }
}
