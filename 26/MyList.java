import java.util.Iterator;

public class MyList<E> implements nList<E>, Iterable<E>{
    private long capacity = 8; private long size = 0; private E[] elements;

    public MyList(){
        this.elements = (E[]) new Object[(int) this.capacity];
    }

    private void newCapacity(){
        E[] old = this.elements;
        this.capacity *= 2;
        this.elements = (E[]) new Object[(int) this.capacity];
        for (int i = 0; i < this.size; i++) {
            this.elements[i] = old[i];
        }
    }

    @Override
    public boolean add(E e){
        if (this.size >= capacity){
            newCapacity();
        }
        this.elements[(int) this.size] = e;
        this.size++;
        return true;
    }

    @Override
    public boolean remove(E e){
        if (!this.contains(e)){
            return false;
        }

        int index = -1;
        for (int i = 0; i < this.size; i++){
            if (this.elements[i].equals(e)){
                index = i;
                break;
            }
        }

        if (index == -1){
            return false;
        }

        for (int i = index; i < this.size - 1; i++){
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
        return true;
    }

    @Override
    public boolean contains(E e){
        for (int i = 0; i < size; i++){
            if (this.elements[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    @Override
    public long size(){
        return this.size;
    }

    @Override
    public E get(int index){
        if (index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }
        return this.elements[index];
    }

    @Override
    public void add(int index, E e){
        if (index < 0 || index > this.size){
            throw new IndexOutOfBoundsException();
        }

        if (this.size >= capacity){
            newCapacity();
        }

        for (int i = (int) this.size; i > index; i--){
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[index] = e;
        this.size++;
    }

    @Override
    public void clear(){
        this.size = 0;
        this.capacity = 8;
        this.elements = (E[]) new Object[(int) this.capacity];
    }

    @Override
    public boolean isEmpty(){
        return this.size == 0;
    }

    @Override
    public nList<E> subList(int fromIndex, int toIndex){
        if (fromIndex < 0 || toIndex > this.size || fromIndex > toIndex){
            throw new IndexOutOfBoundsException();
        }
        MyList<E> subList = new MyList<>();
        for (int i = fromIndex; i < toIndex; i++){
            subList.add(this.elements[i]);
        }
        return subList;
    }

    @Override
    public Object[] toArray(){
        Object[] array = new Object[(int) this.size];
        for (int i = 0; i < size; i++){
            array[i] = this.elements[i];
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a){
        if (a.length < this.size){
            a = (T[]) new Object[(int) this.size];
        }
        for (int i = 0; i < this.size; i++){
            a[i] = (T) this.elements[i];
        }
        if (a.length > this.size){
            a[(int) this.size] = null;
        }
        return a;
    }

    @Override
    public Iterator<E> iterator(){
        return new MyIterator();
    }

    private class MyIterator implements Iterator<E>{
        private int current = 0;

        @Override
        public boolean hasNext(){
            return current < size;
        }

        @Override
        public E next(){
            var temp = elements[current];
            current += 2;
            return temp;
        }
    }
}