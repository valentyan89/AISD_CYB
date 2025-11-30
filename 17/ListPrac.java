public class ListPrac {
    static void task1(){
        StudentList arr = new StudentList();
        System.out.println(arr.isEmpty() ? "True" : "False");
        arr.append(new StudentForList("Not Milana", 19, 2));
        arr.atPos(0);
        arr.appendFirst(new StudentForList("Treshachek", 99, 1));
        arr.insertAt(1, new StudentForList("Not Mila", 19, 2));
        arr.atPos(1);
    }
    static void task2(){
        LinkedStudent arr = new LinkedStudent();
        System.out.println(arr.isEmpty() ? "True" : "False");
        arr.appendLast(new StudentForList("Not Milana", 19, 2));
        arr.atPos(0);
        arr.appendFirst(new StudentForList("Treshachek", 99, 1));
        arr.insertAt(1, new StudentForList("Not Mila", 19, 2));
        arr.atPos(1);
    }

    static void task3(){
        OrbicularList arr = new OrbicularList();
        System.out.println(arr.isEmpty() ? "True" : "False");
        arr.append(new StudentForList("Not Milana", 19, 2));
        arr.atPos(0);
        arr.appendFirst(new StudentForList("Treshachek", 99, 1));
        arr.atPos(1);
    }
    public static void main(String[] args) {
        task3();
    }
}
