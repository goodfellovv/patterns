package adaptee;

import java.io.File;
import java.net.URI;

public interface WebFileManager {
    File getFile(URI uri);
}
