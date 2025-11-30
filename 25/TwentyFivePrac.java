import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.Scanner;

public class TwentyFivePrac {
    static void taskSplit(){
        var scan = new Scanner(System.in);
        System.out.println("Write input string: ");
        var str = scan.nextLine();
        System.out.println("Write ur regex for check: ");
        var regex = scan.nextLine();
        try{
            String[] arr = str.split(regex);

            if (arr.length == 0){
                System.out.println("Zero vars outputed");
            }
            else{
                for (var i: arr){
                    System.out.println(i);
                }
            }
        }
        catch (PatternSyntaxException e){
            System.err.println("Err in ur format of regex");
        }
    }

    static void taskCost(){
        String regex = "((0|[1-9]\\d*)(\\.\\d{1,2})?)\\s(USD|RUB|EU)";
        var pattern = Pattern.compile(regex);
        var filePath = Paths.get("data.txt");
        try{
            String data = Files.readString(filePath);
            var matcher = pattern.matcher(data);

            while (matcher.find()){
                String temp = matcher.group(0); 
                System.out.println(temp);
            }
        }
        catch (IOException e){
            System.err.println("Err with reading ur file");
        }
    }

    static void taskPlusovod(){
        String notPlusRegexForAll = "\\d(?!\\s*\\+)";
        String plusInRegex = "\\+";
        var pattern = Pattern.compile(notPlusRegexForAll); var pattern2 = Pattern.compile(plusInRegex);
        ArrayList<String> flag = new ArrayList<>();
        {
            flag.add("(1 + 8) - 9 / 4");
            flag.add("6 / 5 - 2 * 9");
        }
        for (var f: flag){
            var matcher = pattern.matcher(f); var matcher2 = pattern2.matcher(f);
            System.out.println((matcher.find() && matcher2.find()) ? f + " is Truth" : f + " is False");
        }
    }

    static void taskDates(){
        ArrayList<String> dates = new ArrayList<>();
        {
            dates.add("01/01/2003");
            dates.add("30/04/2003");
            dates.add("29/02/2000");
            dates.add("30-04-2003");
            dates.add("1/1/1899");
            dates.add("29/02/2001");
        }
        String regex = "^(?:(?:(0[1-9]|1\\d|2[0-8])/(0[1-9]|1[0-2]))|((29|30)/(0[13-9]|1[0-2]))|(31/(0[13578]|1[02])))/(19[0-9]{2}|[2-9]\\d{3})$" + "|" + 
        "^29/02/((?:19|2\\d|3\\d|4\\d|5\\d|6\\d|7\\d|8\\d|9\\d)(?:0[48]|[2468][048]|[13579][26])|(?:[2468][048]|[35779][26])00)$";
        for (var y: dates){
            System.out.println((Pattern.matches(regex, y)) ? y + " is Truth" : y + " is False");
        }
    }

    static void taskEmail(){
        ArrayList<String> mails = new ArrayList<>();
        {
            mails.add("user@example.com");
            mails.add("root@localhost");
            mails.add("myhost@@@com.ru");
            mails.add("@my.ru");
            mails.add("Julia String");
        }
        String regex = "^[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*" + "@" + "(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\\.)*" + "[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?$";
        for (var e: mails){
            System.out.println((Pattern.matches(regex, e)) ? e + " is Truth" : e + " is False");
        }
    }
    public static void main(String[] args){
        taskCost();
    }
}
