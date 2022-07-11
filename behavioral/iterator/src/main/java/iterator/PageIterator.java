package iterator;

import iterator.Iterator;
import pages.Page;

import java.util.List;

public class PageIterator implements Iterator {
    List<Page> pages;
    int index = 0;

    public PageIterator(List<Page> pages) {
        this.pages = pages;
    }

    @Override
    public boolean hasNext() {
        return index < pages.size();
    }

    @Override
    public Page getNext() {
        if (this.hasNext()) {
            return pages.get(index++);
        }
        return null;
    }
}
