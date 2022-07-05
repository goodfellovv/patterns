import adaptee.FileManagerImpl;
import adaptee.WebFileManagerImpl;
import adapter.FileManagerAdapter;
import target.WebService;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        WebService webService = new WebService();
        webService.setWebFileManager(new WebFileManagerImpl());
        webService.loadFile(new URI("http://localhost//file?filename=text.xml"));
        webService.setWebFileManager(new FileManagerAdapter(new FileManagerImpl()));
        webService.loadFile(new URI("c:/text.xml"));
    }
}
