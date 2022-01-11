package iterator;

import pages.Page;

public interface Iterator {
    boolean hasNext();
    Page getNext();
}
