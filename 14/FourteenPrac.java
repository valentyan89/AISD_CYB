import java.util.ArrayList;
import java.util.regex.*;

public class FourteenPrac{
    
    static void task2(){
        var reg = "^abcdefghijklmnopqrstuv18340$";
        var test = "dfabcdefghijklmnopqrstuv18f340abcdefghijklmnopqrstuv18340";
        var checkString = Pattern.matches(reg, test);
        System.out.println(checkString);
    }

    static void checkerPassword(String password){
        var reg = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])[a-zA-Z0-9_]{8,}$";
        System.out.println(Pattern.matches(reg, password) ? "Safety password" : "Unsafety password");
    }

    static void task7(){
        String[] baseWithPasswords = {"0324AsdGhj_", "123214123", "F032_Password", "TrySpy1", "smart_pass", "A007"};
        for (var password: baseWithPasswords){
            checkerPassword(password);
        }
    }

    static Object[] filter(Object[] o, Filter filt){
        ArrayList<Object> arr = new ArrayList<Object>();
        for (var obj: o){
            if (filt.apply(obj)){
                arr.add(obj);
            }
        }
        return arr.toArray();
    }

    static void task8(){
        String[] oldArray = {"milana","mihilo","___,___","dzerjinsy","onemore","daun","123123"};
        Object[] newArray;
        newArray = filter(oldArray, new Filter() {
            @Override
            public boolean apply(Object o) {
                var reg = "^[a-zA-Z]+$";
                return Pattern.matches(reg, o.toString());
            }
        });
        for (var obj: newArray){
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        task8();
    }
}
