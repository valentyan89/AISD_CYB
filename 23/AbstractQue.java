import java.util.NoSuchElementException;

public abstract class AbstractQue<T> implements QueueIU<T>{

    @Override
    public abstract void enqueue(T e);
    
    @Override
    public abstract T dequeue() throws NoSuchElementException;

    @Override
    public abstract T element() throws NoSuchElementException;

    @Override
    public abstract int size();

    @Override
    public boolean isEmpty(){
        return size() == 0;
    }

    public abstract void clear();
}
