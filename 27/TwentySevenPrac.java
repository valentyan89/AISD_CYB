import java.util.HashMap;
import java.util.Map;

public class TwentySevenPrac {
    static void task1(){
        HashTab hT = new HashTab();
        hT.hashtabInit();
        String[] keys = {"Mila", "test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8", "boolanov"};
        String[] values = {"Starosta", "123213", "0.3434f", "12312312f", "checker", "random", "value", "var", "ajajjaja", "satana"};
        for (int i = 0; i < keys.length; i++){
            hT.hashtabAdd(keys[i], values[i]);
        }
        System.out.println(hT.hashtabLookup("test4"));
        System.out.println(hT.hashtabLookup("t234234234234est4"));
        System.out.println(hT.hashtabDelete("test8"));
        System.out.println(hT.hashtabDelete("test23"));
        System.out.println(hT.hashtabLookup("test8"));
    }

    public static void main(String[] args) {
       task1(); 
    }
}
