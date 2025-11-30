import java.util.Scanner;

public class SevenPrac {
    static void task1(){
        MovableRectangleForSeven tempVar = new MovableRectangleForSeven(0, 2, 0, 4, 2, 3);
        System.out.println(tempVar);
        tempVar.moveUp();
        System.out.println(tempVar);
    }

    static void task5(){
        TestString tempVar = new TestString();
        var scan = new Scanner(System.in);
        System.out.println(tempVar.newString(scan.nextLine()));
    }
    static void task4(){
        MathCalculable func = new MathFunc();
        MathFunc funcMath = new MathFunc(); 
        System.out.println(funcMath.distCircle(func.powIf(Math.PI, -1)));
    }
    public static void main(String[] args) {
        task1();
    }
}
