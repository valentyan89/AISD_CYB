import java.util.ArrayList;
import java.util.Comparator;

public class Sorting implements Comparator<StudentScores> {

    @Override
    public int compare(StudentScores o1, StudentScores o2) {
        if (o1.getSum() < o2.getSum()) {
            return 1;
        }
        if (o1.getSum() > o2.getSum()) {
            return -1;
        }
        return 0;
    }

    private int half(ArrayList<StudentScores> arr, int l, int r) {
        StudentScores pivot = arr.get(r);
        int i = l - 1;

        for (int j = l; j < r; j++) {
            if (compare(arr.get(j), pivot) < 0) {
                i++;
                StudentScores temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        StudentScores temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(r));
        arr.set(r, temp);

        return i + 1;
    }

    public void quickSort(ArrayList<StudentScores> arr, int l, int r) {
        if (l < r) {
            int pivotIndex = half(arr, l, r);
            quickSort(arr, l, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, r);
        }
    }
}