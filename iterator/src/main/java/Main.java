import document.Document;
import iterator.Iterator;
import pages.ExcelPage;
import pages.Page;
import pages.WordPage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Document excel = new Document(getExcelPages());
        Document word = new Document(getWordPages());
        Iterator excelIterator = excel.getIterator();
        Iterator wordIterator = word.getIterator();
        System.out.println("============Excel iterator=========");
        while (excelIterator.hasNext()){
            System.out.println(excelIterator.getNext().toString());
        }
        System.out.println("===================================");
        System.out.println("============Word iterator=========");
        while (wordIterator.hasNext()){
            System.out.println(wordIterator.getNext().toString());
        }
        System.out.println("==================================");

    }

    public static List<Page> getExcelPages() {
        List<Page> excelPages = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            excelPages.add(new ExcelPage("Excel page content " + i));
        }
        return excelPages;
    }

    public static List<Page> getWordPages() {
        List<Page> wordPages = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            wordPages.add(new WordPage("Word page content " + i));
        }
        return wordPages;
    }
}
