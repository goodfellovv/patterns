package pages;

import iterator.Iterator;

public class ExcelPage implements Page {
    String content;

    public ExcelPage(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ExcelPage{" +
                "content='" + content + '\'' +
                '}';
    }
}
