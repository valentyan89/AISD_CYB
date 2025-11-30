import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ThierteenPrac {
    static void task1(){
        StringBuilder str = new StringBuilder("I like Java!!!");
        int pos = str.indexOf("Java");
        System.out.println(str + "\n" + (pos+1));

        String newStr = new String(str);
        newStr = newStr.replace('a','o');
        System.out.println(newStr);
    }

    static void task2(){
        Person[] newPersons = {new Person("Dremin Valentin maksimovich"), new Person("Surname Name"), new Person("Surname")};
        for (var person: newPersons){
            System.out.println(person);
        }
    }

    static void task3(){
        var myHouse = new Adress();
        myHouse.AdressTokenizer("Russia; 77, Moscow  ,  Pervomaayskayam;1.2.20");
        myHouse.checker();
    }

    static void task4(){
        String[] shirts = new String[11];
        {
            shirts[0] = "S001,Black Polo Shirt,Black,XL";
            shirts[1] = "S002,Black Polo Shirt,Black,L";
            shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
            shirts[3] = "S004,Blue Polo Shirt,Blue,M";
            shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
            shirts[5] = "S006,Black T-Shirt,Black,XL";
            shirts[6] = "S007,White T-Shirt,White,XL";
            shirts[7] = "S008,White T-Shirt,White,L";
            shirts[8] = "S009,Green T-Shirt,Green,S";
            shirts[9] = "S010,Orange T-Shirt,Orange,S";
            shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        }
        Shirt[] clothes = new Shirt[shirts.length];
        for (int i = 0; i < clothes.length; i++){
            clothes[i] = new Shirt(shirts[i]);
        }
        for (var item: clothes){
            System.out.println("\n"+item+"\n");
        }
    }

    static void task5(){
        PhoneNumber[] dictionary = {new PhoneNumber("+79175655655"), new PhoneNumber("+104289652211"), new PhoneNumber("89175655655")};
        for (var person: dictionary){
            System.out.println(person);
        }
    }

    private static boolean checker(ArrayList<String> arr){
        for (int i = 0; i < arr.size() - 1; i++){
            if (Character.toLowerCase(arr.get(i).charAt(arr.get(i).length()-1)) != Character.toLowerCase(arr.get(i+1).charAt(0))){
                return false;
            }
        }
        return true;
    }

    private static boolean checkerInfinity(ArrayList<String> arr){
        Map<Character, Integer> firstChar = new HashMap<>(); Map<Character, Integer> lastChar = new HashMap<>();
        for (var word: arr){
            char first = Character.toLowerCase(word.charAt(0)), last = Character.toLowerCase(word.charAt(word.length()-1));
            Integer fC = firstChar.getOrDefault(first, 0), lC = lastChar.getOrDefault(last, 0);
            firstChar.put(first, ++fC); lastChar.put(last, ++lC);
        }
        int checkerDifference = 0;
        for (var ch: firstChar.keySet()){
            checkerDifference += Math.abs(firstChar.getOrDefault(ch, 0) - lastChar.getOrDefault(ch, 0));
        }
        return checkerDifference <= 2;
    }

    private static StringBuilder getLine(String[] path){
        try{
            FileReader stringFile = new FileReader(path[0]);
            BufferedReader buffBetweenZero = new BufferedReader(stringFile);
            StringTokenizer tokens = new StringTokenizer(buffBetweenZero.readLine());
            buffBetweenZero.close();
            ArrayList<String> words = new ArrayList<String>();
            while (tokens.hasMoreTokens()){
                words.add(tokens.nextToken().trim());
            }
            if (words.size() == 2){
                if (words.get(0).charAt(words.get(0).length()-1) != words.get(1).charAt(0) || words.get(1).charAt(words.get(1).length()-1) != words.get(0).charAt(0)){
                    throw new IllegalAccessError("Can't construct this");
                }
            }
            if (!checkerInfinity(words)){
                throw new IllegalAccessError("Can't construct");
            }
            while (!checker(words)){
                Collections.shuffle(words);
            }
            StringBuilder truthString = new StringBuilder();
            for (var word: words){
                truthString.append(word).append(" ");
            }
            return truthString;
        }
        catch(Exception e){
            System.out.printf("Error with file path reading probably, error: %s", e.getMessage());
        }
        return new StringBuilder("Can't construct truth string");
    }

    static void task6(String[] path){
        if (path.length != 1){
            throw new IllegalAccessError("Error with path");
        }
        var newString = getLine(path);
        System.out.println(newString);
    }

    public static void main(String[] args) {
        task2();
    }
}
