public class ArrayQueueADT<T> {
    private int head, tail, size = 0, capacity = 4; private T[] que;
    

    public ArrayQueueADT(){
        que = (T[]) new Object[capacity];
    }

    static <T> T element(ArrayQueueADT<T> q){
        if (q.size == 0){
            throw new IllegalStateException("Queue is empty");
        }
        return q.que[q.head];
    }

    static <T> T dequeue(ArrayQueueADT<T> q){
        if (q.size == 0){
            throw new IllegalStateException("Queue is empty");
        }
        T temp = q.que[q.head];
        q.que[q.head] = null;
        q.head = (q.head + 1) % q.que.length;
        q.size--;
        return temp;
    }

    static <T> void enqueue(ArrayQueueADT<T> q, T element){
        if (q.size == q.capacity){
            newCapacity(q);
        }
        q.que[q.tail] = element;
        q.tail = (q.tail + 1) % q.que.length;
        q.size++;
    }

    static <T> int size(ArrayQueueADT<T> q){
        return q.size;
    }

    static <T> boolean isEmpty(ArrayQueueADT<T> q){
        return q.size == 0;
    }

    static <T> void clear(ArrayQueueADT<T> q){
        q.que = (T[]) new Object[q.capacity];
        q.head = 0; q.tail = 0; q.size = 0;
    }

    static <T> void newCapacity(ArrayQueueADT<T> q){
        int tempCapacity = q.capacity*2;
        T[] temp = (T[]) new Object[tempCapacity];
        for (int i = 0; i < q.size; i++){
            temp[i] = q.que[(q.head + i) % q.que.length];
        }
        q.capacity = tempCapacity;
        q.que = temp;
        q.head = 0;
        q.tail = q.size;
    }

    static <T> int debugCapacity(ArrayQueueADT<T> q){
        return q.capacity;
    }
}