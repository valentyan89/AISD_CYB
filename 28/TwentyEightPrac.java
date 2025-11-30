import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class TwentyEightPrac{
    static Map<String, String> createMap(){
        Map<String, String> group = new HashMap<>();
        {
            group.put("Kazi", "Mila");
            group.put("Dremin", "Valya");
            group.put("Frolof", "Max");
            group.put("Prokopovichna", "Anastasia");
            group.put("Prokopovich", "Igor");
            group.put("Dzerjinskiy", "Roma");
            group.put("Best", "Mila");
            group.put("Pirat", "Yura");
            group.put("Garibaldiev", "Yura");
            group.put("Kazieva", "Mila");
        }
        return group;
    }
    
    static int getSameFirstNameCount(Map<String, String> group){
        Map<String, Integer> lastNameCounts = new HashMap<>();
        int counter = 0;

        for (var lastName : group.values()){
            lastNameCounts.put(lastName, lastNameCounts.getOrDefault(lastName, 0) + 1);
        }
        
        for (var c : lastNameCounts.values()){
            if (c > 1){
                counter += c;
            }
        }
        return counter;
    }

    static int getSameLastNameCount(Map<String, String> group) {
        Map<String, Integer> lastNameCounts = new HashMap<>();
        int counter = 0;

        for (var lastName : group.keySet()){
            lastNameCounts.put(lastName, lastNameCounts.getOrDefault(lastName, 0) + 1);
        }
        
        for (var c : lastNameCounts.values()){
            if (c > 1){
                counter += c;
            }
        }
        return counter;
    }

    static void task2(){
        Map<String, String> test = createMap();
        System.out.println(getSameFirstNameCount(test));
        System.out.println((getSameLastNameCount(test) > 0) ? "Jajajajajaja" : "Key has once name, can't duplicate");
    }

    public static void main(String[] args){
        task2();
    }
}