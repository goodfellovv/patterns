package pages;

public class WordPage implements Page {
    String content;

    public WordPage(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WordPage{" +
                "content='" + content + '\'' +
                '}';
    }
}
