public class NinePrac {

    public static void insertionSort(Comparable<StudentID>[] list){
        for (int i = 1; i < list.length; i++){
            Comparable<StudentID> num = list[i]; 
            int ind1 = i - 1;
            while (ind1 >= 0 && list[ind1].compareTo((StudentID) num) > 0){
                list[ind1 + 1] = list[ind1];
                ind1--;
            }
            if (i != ind1){
                list[ind1 + 1] = num;
            }
        }
    }

    static void task1(){
        StudentID[] group = {
            new StudentID("Zikov", 3),
            new StudentID("Milana", 1),
            new StudentID("Nasta", 23),
            new StudentID("yura", 0)};
        insertionSort(group);
        for(var st : group){
            System.out.println(st);
        }
    }

    static void task2(){
        StudentScores[] kvbo = {
            new StudentScores("Milana", 100, 100, 100),
            new StudentScores("Dzerjik", 90, 7, 3),
            new StudentScores("Prokopik", 70, 40, 30),
            new StudentScores("Starostina", 60, 80, 80)};
        var variable = new SortingStudentByGPA();
        for (var student : kvbo){
            System.out.println(student);
        }
        System.out.println("===change===");
        variable.quickSort(kvbo, 0, kvbo.length-1);
        for (var student : kvbo){
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        task1();
    }

}