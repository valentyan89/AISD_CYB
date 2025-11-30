import java.util.Iterator;
import java.util.Stack;

public class TwentySixPrac{
    static <T> void reverseArr(T[] arr){
        Stack<T> stack = new Stack<>();
        for (var i: arr){
            stack.push(i);
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = stack.pop();
        }
    } 

    static void task1(){
        Float[] arr = {1.34f,2f,-34.3f,4f,5f};
        for (var e: arr){
            System.out.print(e + "\t");
        }
        System.out.println();
        reverseArr(arr);
        for (var e: arr){
            System.out.print(e + "\t");
        }
    } 

    static void task2(){
        MyList<String> list = new MyList<>();
        {
            list.add("Mila");
            list.add("Milana");
            list.add("Valya");
            list.add("Macbook");
            list.add("onemore");
        }
        for (var item: list){
            System.out.println(item);
        }
    }


    public static void main(String[] args) {
        task2();
    }
}