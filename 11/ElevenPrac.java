import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;


public class ElevenPrac {
    static void task1(){
        String myName = "valentin";
        Calendar lastPrac = Calendar.getInstance();
        lastPrac.set(Calendar.MONTH, 8);
        lastPrac.set(Calendar.DAY_OF_MONTH, 23);
        lastPrac.set(Calendar.YEAR, 2025);
        lastPrac.set(Calendar.HOUR_OF_DAY, 16);
        lastPrac.set(Calendar.MINUTE, 31);
        lastPrac.set(Calendar.SECOND, 52);

        var nowaday = System.currentTimeMillis();
        var fmt = new SimpleDateFormat("EEEE, dd MMMM yyyy 'at' HH:mm:ss z");
        System.out.printf("Dev name - %s\nDate of giving task: %s\nDate of protecting task: %s", myName, fmt.format(lastPrac.getTime()), fmt.format(nowaday));
    }


    static Date offTime(Date d){
        var dt = Calendar.getInstance();
        dt.setTime(d);
        dt.set(Calendar.HOUR_OF_DAY, 0);
        dt.set(Calendar.MINUTE, 0);
        dt.set(Calendar.MILLISECOND, 0);
        dt.set(Calendar.SECOND, 0);
        return dt.getTime();
    }

    static void task2(){
        var scan = new Scanner(System.in);
        var fmt = new SimpleDateFormat("dd MM yyyy");
        fmt.setLenient(false);
        System.out.print("Write your date like a 'dd MM yyyy': ");
        
        try{
            Date check = fmt.parse(scan.nextLine());
            Date nowaday = offTime(new Date());
            
            if (check.before(nowaday)){
                System.out.println("Before");
            }
            else if (check.after(nowaday)){
                System.out.println("After");
            }
            else{
                System.out.println("This date");
            }
        }
        catch(ParseException e){
            System.out.println(e.getMessage());
        }
    }

    static void task3(){
        var cal = Calendar.getInstance();
        cal.set(2000, 1, 1);
        var female = new StudentEleven("Mila", cal.getTime());
        System.out.println(female.shortInfo());
    }

    static void task4(){
        var scan = new Scanner(System.in);
        System.out.println("Year, month, day of month wirte like a 'Year month day'");
        int year = scan.nextInt(), month = scan.nextInt(), day = scan.nextInt();

        System.out.println("Hours, minutes like a 'Hour minute'");
        int hour = scan.nextInt(), minute = scan.nextInt();

        var dateCal = Calendar.getInstance();
        dateCal.set(year, month - 1, day, hour, minute, 0);
        dateCal.set(Calendar.MILLISECOND, 0);
        Date date = dateCal.getTime();

        var fmt = new SimpleDateFormat("yyyy-MM-dd\nHH:mm");
        System.out.printf("Calendar:\n%s\n\n", fmt.format(dateCal.getTime()));
        System.out.printf("Date:\n%s",fmt.format(date));
    }

    static void task5(){
        LinkedList<StudentScores> test = new LinkedList<StudentScores>();
        long startTime = System.nanoTime();
        int n = 100000;
        System.out.printf("%d elements:\n", n);
        for (int i = 0; i < n; i++){
            test.add(new StudentScores("Nasta", 12, 23, 234));
            test.add(new StudentScores("Yura", 23, 34, 2));
            test.add(new StudentScores("Fedor", 0, 0, 0));
            test.add(new StudentScores("Kosichka", 5, 5, 5));
            test.addFirst(new StudentScores("Mila", 100, 1000, 213123412));
            test.add(3, new StudentScores("OdnonogiyJhon", 23, 34, 2));
            test.remove(3);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.printf("Linkedlist, time = %d\n", estimatedTime);
        ArrayList<StudentScores> test1 = new ArrayList<StudentScores>();
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++){
            test1.add(new StudentScores("Nasta", 12, 23, 234));
            test1.add(new StudentScores("Yura", 23, 34, 2));
            test1.add(new StudentScores("Fedor", 0, 0, 0));
            test1.add(new StudentScores("Kosichka", 5, 5, 5));
            test1.add(0, new StudentScores("Mila", 100, 1000, 213123412));
            test1.add(3, new StudentScores("OdnonogiyJhon", 23, 34, 2));
            test1.remove(3);
            test1.contains(new StudentScores("1", 5, 5, 5));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.printf("ArrayList, time = %d", estimatedTime);
        /*Output:
         * 1000 elements:
         * Linkedlist, time = 16028300
         * ArrayList, time = 5834600
         * 10000 elements:
         * Linkedlist, time = 19067800
         * ArrayList, time = 78975200
         * 100000 elements:
         * Linkedlist, time = 34108600
         * ArrayList, time = 6965390600
         */
    }

    public static void main(String[] args) {
        task5();
    }
}
