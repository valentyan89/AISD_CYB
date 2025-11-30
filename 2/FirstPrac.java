

import java.util.Scanner;



public class FirstPrac{
    public static void task1(){
        int[] array = {12,2,7,1,9};
        int tempVar = 0;
        for (int i = 0; i < array.length; i++){
            tempVar += array[i];
        }
        float newVar = (float) tempVar/array.length;
        System.out.println(tempVar);
        System.out.println(newVar);
    }

    public static void task2(){
        System.out.println("Vvedite razmer massiva: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int len = sc.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++){
                Scanner ch = new Scanner(System.in);
                if (ch.hasNextInt()){
                    arr[i] = ch.nextInt();
                }
            }
            int ind = 0;
            int sumValues = 0;
            do{
                sumValues += arr[ind];
                ind++;
            } while(ind < len);
            System.out.println("summa blya");
            System.out.println(sumValues);
            sumValues = 0;
            ind = 0;
            while (ind < len){
                sumValues += arr[ind];
                ind++;
            }
            System.out.println("summa blya");
            System.out.println(sumValues);
            int minVal = 999999999;
            int maxVal = -999999999;
            for (int i = 0; i < len; i++){
                if (arr[i] > maxVal){
                    maxVal = arr[i];
                }
                if (arr[i] <= minVal){
                    minVal = arr[i];
                }
            }
            System.out.println("min max");
            System.out.println(minVal);
            System.out.println(maxVal);
        }
        else{
            System.out.println("durachik\t blya");
        }
    }

    public static void task3(String[] tempVar) {
        for (String str: tempVar){
            System.out.println(str);
        }
    }
    public static void task4(){
        float firstVar = 0;
        int n = 1;
        do{
            firstVar += (float) 1/n;
            n += 1;
            System.out.println(firstVar);
        } while (n < 11);
    }
    
    public static float fact(float tempVar){
        float factorial = 1;
        for (float value = 1; value <= tempVar; value++){
                factorial *= value;
        }
        return factorial;
    }

    public static void task5(){
        System.out.println("Vvedite chislo: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            float tempVar = sc.nextInt();
            if (tempVar >= 1){
                System.out.println(fact(tempVar));
            }
            else{
                System.out.println("nado bilo bolshe dvuh) ) ) )");
            }
        }
        else{
            System.out.println("razrab dalabeb1");
        }
    }

    public static void main(String[] args){
        task1();
    }
}
