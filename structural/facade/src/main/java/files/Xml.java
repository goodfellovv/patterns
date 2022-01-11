package files;

public class Xml implements File {
    String data;

    public Xml(String data) {
        this.data = data;
        System.out.println("XML file created");
    }

    @Override
    public String getData() {
        return data;
    }
}
