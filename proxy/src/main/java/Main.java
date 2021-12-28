import lib.Configuration;
import lib.XmlConfiguration;
import proxy.ProxyConfiguration;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================Proxy configuration====================");
        Configuration configurationProxy = new ProxyConfiguration();
        configurationProxy.configure();
        System.out.println("==================Proxy configuration====================\n");

        System.out.println("==================Default configuration====================");
        Configuration configuration = new XmlConfiguration();
        configuration.configure();
        System.out.println("==================Default configuration====================\n");
    }
}
