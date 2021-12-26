package decorators;

import sources.DataSource;

public class DataSourceDecorator implements DataSource {
    private final DataSource source;

    public DataSourceDecorator(DataSource source) {
        this.source = source;
    }


    @Override
    public void writeData(String data) {
        System.out.println("Base decorator writes data: " + data);
        this.source.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("Base decorator read data");
        return this.source.readData();
    }
}
