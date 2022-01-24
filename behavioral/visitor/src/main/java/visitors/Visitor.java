package visitors;

import elements.JsonElement;
import elements.XmlElement;

public interface Visitor {
    void visit(XmlElement xe);

    void visit(JsonElement je);
}
