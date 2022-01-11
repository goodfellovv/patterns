package parsers;

import files.File;
import files.Xml;

public class StringToXml implements Parser {
    @Override
    public File parse(String data) {
        System.out.println("Parse data to XML");
        return new Xml(data);
    }
}
