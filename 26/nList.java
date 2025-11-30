import java.util.Iterator;

public interface nList<E> {
    boolean add(E e);
    boolean remove(E e);
    boolean contains(E e);
    long size();
    E get(int index);
    void add(int index, E e);
    void clear();
    boolean isEmpty();
    nList<E> subList(int fromIndex, int toIndex);
    Object[] toArray();
    <T> T[] toArray(T[] a);
    Iterator<E> iterator();
}
