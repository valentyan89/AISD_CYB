import java.util.Scanner;


public class HowMany {
    public static void task1(){
        var words = new Scanner(System.in);
        int countWords = 0;
        var newStr = new String();
        if (words.hasNext()){
            newStr = words.nextLine();
        }
        String[] arr = newStr.replace("\t", "").split(" ");
        for (var $ : arr){
            if ($.equals("")){
                continue;
            }
            countWords += 1;
            //System.out.println($);
        }
        System.out.println("U write " +countWords + " words");
    }
    public static void main(String[] args) {
        task1();
    }
}
