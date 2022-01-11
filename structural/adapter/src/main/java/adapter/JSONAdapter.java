package adapter;

import parcers.JSONParser;
import parcers.Parcer;

public class JSONAdapter implements Parcer {
    private final JSONParser jsonParser = new JSONParser();
    @Override
    public String parse() {
        return jsonParser.parse();
    }
}
