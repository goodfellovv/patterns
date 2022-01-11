package proxy;

import lib.Configuration;
import lib.XmlConfiguration;

public class ProxyConfiguration implements Configuration {
    Configuration configuration;

    public ProxyConfiguration() {
        this.configuration = new XmlConfiguration();
    }

    @Override
    public void configure() {
        System.out.println("Do something before configure");
        configuration.configure();
    }
}
