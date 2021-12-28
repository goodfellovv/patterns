package lib;

public class XmlConfiguration implements Configuration {
    public XmlConfiguration() {
        System.out.println("Create XML configuration");
    }
    @Override
    public void configure() {
        System.out.println("Apply XML configuration");
    }
}
