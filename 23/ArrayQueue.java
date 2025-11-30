import java.util.NoSuchElementException;

public class ArrayQueue<T>{
    private int head, tail, size = 0, capacity = 4; private T[] que;
    

    public ArrayQueue(){
        this.que = (T[]) new Object[capacity];
    }

    public T element(){
        if (this.size == 0){
            throw new NoSuchElementException("Queue is empty");
        }
        return this.que[this.head];
    }

    public T dequeue(){
        if (this.size == 0){
            throw new IllegalStateException("Queue is empty");
        }
        T temp = this.que[this.head];
        this.que[this.head] = null;
        this.head = (this.head + 1) % this.que.length;
        this.size--;
        return temp;
    }

    public void enqueue(T element){
        if (this.size == this.capacity){
            this.newCapacity();
        }
        this.que[this.tail] = element;
        this.tail = (this.tail + 1) % this.que.length;
        this.size++;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void clear(){
        this.que = (T[]) new Object[this.capacity];
        this.head = 0; this.tail = 0; this.size = 0;
    }

    private void newCapacity(){
        int tempCapacity = this.capacity*2;
        T[] temp = (T[]) new Object[tempCapacity];
        for (int i = 0; i < this.size; i++){
            temp[i] = this.que[(this.head + i) % this.que.length];
        }
        this.capacity = tempCapacity;
        this.que = temp;
        this.head = 0;
        this.tail = this.size;
    }

    public int debugCapacity(){
        return this.capacity;
    }
}
