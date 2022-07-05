package adapter;

import adaptee.FileManager;
import adaptee.WebFileManager;

import java.io.File;
import java.net.URI;
import java.nio.file.Paths;

public class FileManagerAdapter implements WebFileManager {
    FileManager fileManager;

    public FileManagerAdapter(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    @Override
    public File getFile(URI uri) {
        return fileManager.getFile(Paths.get(uri.toString()));
    }
}
