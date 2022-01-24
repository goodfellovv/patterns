import java.util.EmptyStackException;
import java.util.Stack;

public class Editor {
    private final Stack<TextArea.Snapshot> history;
    private final TextArea textArea;

    public Editor() {
        history = new Stack<>();
        textArea = new TextArea();
    }

    public void write(String text) {
        System.out.println("Write text into Editor: " + text);
        textArea.setText(text);
        history.push(textArea.getSnapshot());
    }

    public void undo() {
        try {
            textArea.restore(history.pop());
        } catch (EmptyStackException e){
            System.out.println("No history data");
        }
    }
}
