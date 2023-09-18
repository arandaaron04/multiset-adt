public interface MultiSet<T> {
    boolean add(T item);
    boolean remove(T item);
    boolean contains(T item);
    boolean is_empty(T item);
    int count(T item);
    int size(T item);
}
