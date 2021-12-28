package files;

public class Json implements File {
    String data;

    public Json(String data) {
        this.data = data;
        System.out.println("JSON file created");
    }

    @Override
    public String getData() {
        return data;
    }
}
