public class ArrayQueueModule{
    private static int head, tail, size = 0, capacity = 4; private static String[] que;

    public ArrayQueueModule(){
        que = new String[capacity];
    }

    static String element(){
        if (size == 0){
            throw new IllegalStateException("Queue is empty");
        }
        return que[head];
    }

    static String dequeue(){
        if (size == 0){
            throw new IllegalStateException("Queue is empty");
        }
        var temp = que[head];
        que[head] = null;
        head = (head + 1) % que.length;
        size--;
        return temp;
    }

    static void enqueue(String element){
        if (size == capacity){
            newCapacity();
        }
        que[tail] = element;
        tail = (tail + 1) % que.length;
        size++;
    }

    static int size(){
        return size;
    }

    static boolean isEmpty(){
        return size == 0;
    }

    static void clear(){
        que = new String[capacity];
        head = 0; tail = 0; size = 0;
    }

    static void newCapacity(){
        int tempCapacity = capacity * 2;
        String[] temp = new String[tempCapacity];
        for (int i = 0; i < size; i++) {
            temp[i] = que[(head + i) % que.length];
        }
        capacity = tempCapacity;
        que = temp;
        head = 0;
        tail = size;
    }

    static int debugCapacity(){
        return capacity;
    }
}
