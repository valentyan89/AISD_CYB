import java.util.Scanner;

public class EighteenPrac {
    static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e){
            System.err.println("Error, your numb not integer");
        }
        catch (ArithmeticException e){
            System.err.println("Error, can't div by zero");
        }
        /*
        Qwerty - java.lang.NumberFormatException
        0 - java.lang.ArithmeticException
        1.2 - java.lang.NumberFormatException
        1 - non exception
        */

    }

    static void exceptionDemoSecond() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        boolean checker = true;
        try{
            if (checker){
                throw new ClassNotFoundException("Errrorrrrrrr");
            }
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

        }
        catch (NumberFormatException e){
            System.err.println("Error, your numb not integer");
        }
        catch (ArithmeticException e){
            System.err.println("Error, can't div by zero");
        }
        catch (Exception e) {
            System.err.printf("General exception caught as %s", e.getClass().getName());
        }
    }

    static void exceptionDemoFinal() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e){
            System.err.println("Error, your numb not integer");
        }
        catch (ArithmeticException e){
            System.err.println("Error, can't div by zero");
        }
        finally{
            System.out.println("End of the method, mialana");
        }
    }

    static void task5(){
        var ex = new ThrowsDemo();
        String str = null;
        ex.getDetails(str);
    }

    static void task5Second(){
        String str = "valua";
        var Milana = new ThrowsDemoMilana();
        Milana.printMessage(str);
    }


    public static void main(String[] args) {
        task5Second();
    }
}
