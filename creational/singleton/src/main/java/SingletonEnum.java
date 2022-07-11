import java.util.Date;

public enum SingletonEnum {
    INSTANCE;

    String value = "SingletonEnum" + new Date();

    public String getValue() {
        return value;
    }
}
