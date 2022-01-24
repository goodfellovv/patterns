import elements.Document;
import elements.JsonElement;
import elements.XmlElement;
import visitors.ElementVisitor;
import visitors.Visitor;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Visitor v = new ElementVisitor();

        Document document = new Document(generateUuid());
        document.getElements().add(new JsonElement(generateUuid()));
        document.getElements().add(new JsonElement(generateUuid()));
        document.getElements().add(new XmlElement(generateUuid()));

        document.accept(v);
    }

    private static String generateUuid() {
        return UUID.randomUUID()
                .toString();
    }
}
