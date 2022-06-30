package decorators;

import sources.DataSource;

public class EncryptDecorator extends DataSourceDecorator {
    public EncryptDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Encrypt decorator writes data: " + data);
        super.writeData(encrypt(data));
    }

    @Override
    public String readData() {
        System.out.println("Encrypt decorator read data");
        return decrypt(super.readData());
    }

    private String encrypt(String stringData) {
        return "Encrypted data: " + stringData.hashCode();
    }

    private String decrypt(String stringData) {
        return "Decrypted data: " + stringData.hashCode();
    }
}
