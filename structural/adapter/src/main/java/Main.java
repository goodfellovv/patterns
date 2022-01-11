import adapter.JSONAdapter;
import adapter.XMLAdapter;
import parcers.JSONParser;
import parcers.Parcer;
import parcers.XMLParser;

public class Main {
    public static void main(String[] args) {
        System.out.println("***************** No adapters ******************");
        Parcer jsonParser = new JSONParser();
        System.out.println(jsonParser.parse());
        Parcer xmlParser = new XMLParser();
        System.out.println(xmlParser.parse());
        System.out.println("***************** No adapters ******************");

        System.out.println();

        System.out.println("***************** With adapters ******************");
        jsonParser = new XMLAdapter();
        System.out.println(jsonParser.parse());
        xmlParser = new JSONAdapter();
        System.out.println(xmlParser.parse());
        System.out.println("***************** With adapters ******************");
    }
}
