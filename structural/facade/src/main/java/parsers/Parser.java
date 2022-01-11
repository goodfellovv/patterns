package parsers;

import files.File;

public interface Parser {
    File parse(String data);
}
