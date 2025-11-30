import java.util.Comparator;

public class GPAComparator implements Comparator<StudentScores>{
    @Override
    public int compare(StudentScores o1, StudentScores o2) {
        if (o1.getSum() < o2.getSum()){
            return 1;
        }
        if (o1.getSum() > o2.getSum()){
            return -1;
        }
        return 0;
    }
        

}
