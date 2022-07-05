package adaptee;

import java.io.File;
import java.net.URI;

public class WebFileManagerImpl implements WebFileManager {
    @Override
    public File getFile(URI uri) {
        System.out.println("Request file from server");
        return new File("");
    }
}
