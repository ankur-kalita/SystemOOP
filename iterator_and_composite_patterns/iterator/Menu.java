package iterator_and_composite_patterns.iterator;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
