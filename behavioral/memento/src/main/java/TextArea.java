import java.util.Date;

public class TextArea {
    private String text;

    public void setText(String text) {
        System.out.println("New data in TexArea: " + text);
        this.text = text;
    }

    public Snapshot getSnapshot() {
        Date date = new Date();
        System.out.println("New snapshot of TexArea: " + text + " [ " + date + " ]\n");
        return new Snapshot(this.text, date);
    }

    public void restore(Snapshot snapshot) {
        System.out.println("Restore TexArea to : " + snapshot.text + " [ " + snapshot.date + " ]");
        this.text = snapshot.text;
    }

    public static class Snapshot {
        private final String text;
        private final Date date;

        private Snapshot(String text, Date date) {
            this.text = text;
            this.date = date;
        }

        private String getSavedText() {
            return text;
        }
    }
}
