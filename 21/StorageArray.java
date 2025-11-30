public class StorageArray <T extends Comparable<T>>{
    private T[] arr;

    public StorageArray(T[] arr){
        this.arr = arr;
    }

    public T getItem(int i){
        return arr[i];
    }

    public void printArray(){
        for (var i: arr){
            System.out.printf("%s\t", i);
        }
    }
}
