import java.io.NotActiveException;
import java.util.Scanner;

import javax.naming.NameNotFoundException;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class NineteenPrac {

    static boolean isValidTIN(String TIN){
        if (TIN == null || !TIN.matches("\\d{12}")){
            return false;
        }
        return true;
    }

    static void TINTask(){
        var scan = new Scanner(System.in);
        System.out.println("Give ur Surname, name and secondname, pls like a <Dremin V. M.>");
        var fullName = scan.nextLine();
        scan.close();
        System.out.println("Give ur TIN");
        try{
            var TIN = scan.nextLine();
            if (!isValidTIN(TIN)){
                throw new TINException(String.format("invalid TIN number for %s", fullName));
            }
            System.out.printf("Valid TIN for %s", fullName);
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    static void LabClassDriver(){
        var group = new LabClass();

        {
            group.addStudent(new StudentScores("Milana", 100, 100, 100));
            group.addStudent(new StudentScores("Maximn", 20, 23, 25));
            group.addStudent(new StudentScores("OdnonogiyJhon", 34, 52, 69));
            group.addStudent(new StudentScores("Zikov", -100, 23, 1));
            group.addStudent(new StudentScores("Fedya", 1, 1, 1));
            group.addStudent(new StudentScores("Romik", 12, 12, 12));
        }

        group.printGroup(); System.out.println("errase");
        group.sortByGPA();
        group.printGroup();
        var scan = new Scanner(System.in);
        try{
            var student = group.findStudentScores(scan.nextLine());
            scan.close();
            System.out.printf("%s found in group", student);
        }
        catch (EmptyStringException e){
            System.err.println(e.getMessage());
        }
        catch (StudentNotFoundException e){
            System.err.println(e.getMessage());
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
    public static void main(String[] args) {
        LabClassDriver();
    }
}
