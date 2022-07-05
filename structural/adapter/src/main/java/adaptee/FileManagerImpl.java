package adaptee;

import java.io.File;
import java.nio.file.Path;

public class FileManagerImpl implements FileManager {
    @Override
    public File getFile(Path path) {
        System.out.println("Get file from filesystem");
        return path.toFile();
    }
}
