package document;

import iterator.Iterator;
import pages.Page;

import java.util.List;

public class Document {
    List<Page> pages;

    public Document(List<Page> pages) {
        this.pages = pages;
    }

    public Iterator getIterator() {
        return new PageIterator();
    }

    private class PageIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < pages.size();
        }

        @Override
        public Page getNext() {
            if(this.hasNext()){
                return pages.get(index++);
            }
            return null;
        }
    }
}
