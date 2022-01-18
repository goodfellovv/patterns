package mediator;

public class Form implements Mediator {

    public Form() {
        System.out.println("Form created");
    }

    @Override
    public void close() {
        System.out.println("Form closed");
    }

    @Override
    public void discard() {
        System.out.println("Changes discarded");
    }

    @Override
    public void save() {
        System.out.println("Changes saved");
    }
}
