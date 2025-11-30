public interface QueueIU<T>{
    void enqueue(T e);
    T element();
    T dequeue();
    int size();
    boolean isEmpty();
}
