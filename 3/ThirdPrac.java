import java.util.Random;


public class ThirdPrac{
    
    static boolean checkerArray(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] < arr[i+1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    static void task1(){
        var randomVar = new Random();
        var array = new int[4];

        for (int i = 0; i < array.length; i++){ array[i] = randomVar.nextInt(10,100);}

        for(var index :array){ System.out.printf("%d ", index);}
        System.out.println(checkerArray(array) ? "Strogo vozr" : "Ne strogo vozr");

    }
    static void task2(){
        Double value1 = Double.valueOf(3);
        Double val = Double.valueOf(100213.23);
        
        var str = String.valueOf(52.34);

        double testVar = Double.parseDouble(str);
        short sh = val.shortValue();
        byte bt = val.byteValue();
        int intgr = val.intValue();
        float flt = val.floatValue();
        long lng = val.longValue();
        double dbl = val.doubleValue();
        String str1 = val.toString();

        System.out.println(val+"\n"+value1);

        String d = Double.toString(3.23);
    }

    static void task3(){
        Employee[] array = {new Employee("Valentin", 1.1f), new Employee("Person1", 5324.4324324f), new Employee("Dzerjinsky", 52000f), new Employee("Puturidze", 70000.99f)};
        Report.generateReport(array);
    }
    
    public static void main(String[] args) {
        task3();
    }
}