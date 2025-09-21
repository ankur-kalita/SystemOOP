package iterator_and_composite_patterns.iterator.standard;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
