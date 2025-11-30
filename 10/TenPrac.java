import java.util.ArrayList;
import java.util.Comparator;

public class TenPrac {
    static void task1(){
        StudentTen[] students = {
            new StudentTen("MIrea", "Kazi", "Cybernetics", 2, 21),
            new StudentTen("Miron", "Yanovich", "Daun", -1, 0),
            new StudentTen("Macan", "Macanchik", "Itu", 2, 21),
        };
        for (var student : students){
            System.out.println(student);
        }
    }

    static void task2(){
        var test = new SortingStudentByGPATen();
        test.setArray();
        test.outArray();
        //test.sortByName();
        System.out.println("After sorting");
        test.mergeSort();
        test.outArray();
    }

    static void task3(){
        ArrayList<StudentScores> group1 = new ArrayList<StudentScores>();
        ArrayList<StudentScores> group2 = new ArrayList<StudentScores>();

        group1.add(new StudentScores("Mila", 100, 1000, 213123412));
        group1.add(new StudentScores("Nasta", 12, 23, 234));
        group1.add(new StudentScores("Yura", 23, 34, 2));
        group1.add(new StudentScores("OdnonogiyJhon", 23, 34, 2));

        group2.add(new StudentScores("Fedor", 0, 0, 0));
        group2.add(new StudentScores("Kosichka", 5, 5, 5));

        ArrayList<StudentScores> twoGroups = new ArrayList<StudentScores>();
        twoGroups.addAll(group1); twoGroups.addAll(group2);


        Comparator<StudentScores> customComparator = new GPAComparator().thenComparing(new NameComaparator());

        twoGroups.sort(customComparator);

        for (var st: twoGroups){
            System.out.println(st);
        }
    }

    public static void main(String[] args) {
        task3();
    }
}
