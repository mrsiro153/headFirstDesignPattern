package siro.revision.iterator;

public interface IIterator {
    boolean hasNext();
    Object next();
    void remove();
}
