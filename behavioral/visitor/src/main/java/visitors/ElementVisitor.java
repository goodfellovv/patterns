package visitors;

import elements.JsonElement;
import elements.XmlElement;

public class ElementVisitor implements Visitor {

    @Override
    public void visit(XmlElement xe) {
        System.out.println("Processing xml element with uuid: " + xe.uuid);
    }

    @Override
    public void visit(JsonElement je) {
        System.out.println("Processing json element with uuid: " + je.uuid);
    }
}
