package parsers;

import files.File;
import files.Json;

public class StringToJson implements Parser {
    @Override
    public File parse(String data) {
        System.out.println("Parse data to JSON");
        return new Json(data);
    }
}
