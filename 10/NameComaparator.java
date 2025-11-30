import java.util.Comparator;

public class NameComaparator implements Comparator<StudentScores>{
    @Override
    public int compare(StudentScores o1, StudentScores o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
