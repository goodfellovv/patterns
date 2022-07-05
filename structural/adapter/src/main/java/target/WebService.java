package target;

import adaptee.WebFileManager;

import java.io.File;
import java.net.URI;

public class WebService {
    WebFileManager webFileManager;

    public void setWebFileManager(WebFileManager webFileManager) {
        this.webFileManager = webFileManager;
    }

    public File loadFile(URI uri) {
        //....other service logic
        return webFileManager.getFile(uri);
    }
}
