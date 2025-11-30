import java.util.Comparator;

public class SortingStudentByGPATen implements Comparator<StudentScores>{
    private StudentScores[] group; private char flag = 'b';

    public void setArray(){
        group = new StudentScores[]{
            new StudentScores("Milana", 100, 100, 100),
            new StudentScores("Dzerjik", 90, 7, 3),
            new StudentScores("Prokopik", 70, 40, 30),
            new StudentScores("Starostina", 60, 80, 80)};
    }
    
    public void sortByName(){
        this.flag = 'n';
    }

    public void sortByGPA(){
        this.flag = 'b';
    }

    @Override
    public int compare(StudentScores o1, StudentScores o2) {
        switch (flag) {
            case 'n':
                return o1.getName().compareTo(o2.getName());
            default:
                if (o1.getSum() < o2.getSum()){
                    return 1;
                }
                if (o1.getSum() > o2.getSum()){
                    return -1;
                }
                return 0;
        }
        
    }

    private int half(int l, int r) {
        StudentScores pivot = this.group[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (compare(this.group[j], pivot) < 0) {
                i++;
                StudentScores temp = this.group[i];
                this.group[i] = this.group[j];
                this.group[j] = temp;
            }
        }
        StudentScores temp = this.group[i + 1];
        this.group[i + 1] = this.group[r];
        this.group[r] = temp;
        return i + 1;
    }

    public void quickSort(int l, int r) {
        if (l < r) {
            int pivotIndex = half(l, r);
            quickSort(l, pivotIndex - 1);
            quickSort(pivotIndex + 1, r);
        }
    }


    public void mergeSort() {
        if (this.group == null || this.group.length <= 1){ return;}
        pomoikaSort(0, this.group.length - 1);
    }

    private void pomoikaSort(int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        pomoikaSort(left, mid);
        pomoikaSort(mid + 1, right);
        merge(left, mid, right);
    }

    private void merge(int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;

        StudentScores[] leftArr = new StudentScores[n1];
        StudentScores[] rightArr = new StudentScores[n2];

        for (int i = 0; i < n1; i++){
            leftArr[i] = this.group[left + i];
        }

        for (int j = 0; j < n2; j++){
            rightArr[j] = this.group[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (compare(leftArr[i], rightArr[j]) < 0) {
                this.group[k++] = leftArr[i++];
            }
            else {
                this.group[k++] = rightArr[j++];
            }
        }

        while (i < n1) {
            this.group[k++] = leftArr[i++];
        }

        while (j < n2) {
            this.group[k++] = rightArr[j++];
        }
    }



    public void outArray(){
        if (this.group == null || this.group.length == 0){
            return;
        }

        for (StudentScores st : this.group) {
            System.out.println(st);
        }
    }
}