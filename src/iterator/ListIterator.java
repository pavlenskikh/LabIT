package iterator;

import java.util.Iterator;

/**
 * Created by User on 03.10.2017.
 */
public interface ListIterator extends Iterator<Object> {
    boolean hasPrevious();
    Object previous();
    void set(Object e);
    void remove();
}
