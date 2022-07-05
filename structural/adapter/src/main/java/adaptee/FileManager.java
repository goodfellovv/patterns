package adaptee;

import java.io.File;
import java.nio.file.Path;

public interface FileManager {
    File getFile(Path path);
}
