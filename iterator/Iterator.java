package iterator;

/**
 * @author CJR
 * @create 2021-10-06-16:30
 */
public interface Iterator {
    boolean hasNext();
    Object next();
    void remove();
}
