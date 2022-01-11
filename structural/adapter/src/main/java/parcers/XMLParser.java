package parcers;

public class XMLParser implements Parcer{

    @Override
    public String parse() {
        System.out.println("Parse in: " + this.getClass().getName());
        return "<name> " + this.getClass().getName() + "</name>";
    }
}
