import java.util.Comparator;

public class SortingStudentByGPA implements Comparator<StudentScores>{

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
    private int half(StudentScores[] arr, int l, int r) {
        StudentScores pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (compare(arr[j], pivot) < 0) {
                i++;
                StudentScores temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        StudentScores temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }

    public void quickSort(StudentScores[] arr, int l, int r) {
        if (l < r) {
            int pivotIndex = half(arr, l, r);
            quickSort(arr, l, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, r);
        }
    }
}