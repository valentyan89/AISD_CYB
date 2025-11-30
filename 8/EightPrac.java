
public class EightPrac {
    public static String aboba(String s, int i, int j){
        if (i>j){
            return "YES";
        }
        if (s.charAt(i) != s.charAt(j)){
            return "NO";
        }
        else{
            return aboba(s, i + 1, j-1);
        }
    }
    static void task8(){
        String str = "MIlan akazi";
        System.out.println(aboba(str, 0, str.length()-1));
    }

    
    public static int sumVal(int n){
        if (n <= 9){
            return n;
        }
        else{
            return n%10 + sumVal(n/10);
        }
    }
    static void task5(){
        System.out.println(sumVal(517));
    }

    public static void trixPrint(int n, int thatNum, int already) {
        if (n > 0){
            System.out.printf("%d ",thatNum);
            if (already + 1 == thatNum) {
                trixPrint(n - 1, thatNum + 1, 0);
            }
            else {
                trixPrint(n - 1, thatNum, already + 1);
            }
        }
    }
    static void task1(){
        trixPrint(10, 1, 0);
    }
    public static void main(String[] args) {
        task5();
    }
}
