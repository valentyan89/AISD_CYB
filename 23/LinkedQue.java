import java.util.NoSuchElementException;

public class LinkedQue<T> extends AbstractQue<T>{
    private QueueNode<T> head, tail; private int size;

    public LinkedQue(){
        this.size = 0; this.head = null; this.tail = null;
    }

    @Override
    public void enqueue(T e){
        if (e == null){
            throw new NullPointerException("Element can't be null");
        }
        QueueNode<T> temp = new QueueNode<>(e, null);
        if (this.isEmpty()){
            head = temp;
        }
        else{
            tail.setNext(temp);
        }
        tail = temp;
        size++;
    }

    @Override
    public T dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException("Zero elements in LinkedQueue");
        }
        T temp = head.getItem();
        head = head.getNext();
        size--;
        if (head == null){
            tail = null;
        }
        return temp;
    }

    @Override
    public T element(){
        if (isEmpty()){
            throw new NoSuchElementException("Zero elements in LinkedQueue");
        }
        T temp = head.getItem();
        return temp;
    }

    @Override
    public void clear(){
        QueueNode<T> current = head;
        while (current != null) {
            QueueNode<T> next = current.getNext();
            current = next;
        }
        head = null; tail = null; size = 0;
    }
    

    @Override
    public int size(){
        return this.size;
    }
}