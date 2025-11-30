public class StudentList {
    private StudentNode point;

    public StudentList(){
        this.point = null;
    }

    public void append(StudentForList n){
        StudentNode temp = new StudentNode(n, null);
        if (point == null){
            this.point = temp;
        }
        else{
            StudentNode cur = this.point;
            while(cur.getNextStudent() != null){
                cur = cur.getNextStudent();
            }
            cur.setNextStudent(temp);
        }
    }

    public void appendFirst(StudentForList n) {
        StudentNode temp = new StudentNode(n, this.point);
        this.point = temp;
    }

    public void insertAt(int i, StudentForList n) {
        StudentNode temp = new StudentNode(n, null);

        if (i <= 0 || isEmpty()) {
            temp.setNextStudent(this.point);
            this.point = temp;
            return;
        }

        StudentNode cur = this.point;
        for (int index = 0; cur != null && index < i - 1; index++) {
            cur = cur.getNextStudent();
        }

        if (cur == null) {
            System.out.println("Index out of range");
            return;
        }

        temp.setNextStudent(cur.getNextStudent());
        cur.setNextStudent(temp);
    }


    public void remove(int i){
        if (isEmpty()){
            System.out.println("Zero elements in list");
            return;
        }

        if (i == 0) {
            point = point.getNextStudent();
            return;
        }

        StudentNode cur = this.point;
        for (int index = 0; cur != null && index < i - 1; index++){
            cur = cur.getNextStudent();
        }

        if (cur == null || cur.getNextStudent() == null) {
            System.out.println("Index out of range");
            return;
        }

        cur.setNextStudent(cur.getNextStudent().getNextStudent());
    }

    public void atPos(int i){
        if (isEmpty()){
            System.out.println("Zero elements in list");
            return;
        }
        StudentNode cur = this.point;
        for (int index = 0; cur != null && index < i; index++){
            cur = cur.getNextStudent();
        }

        if (cur == null) {
            System.out.println("Index out of range");
            return;
        }

        cur.getStudent().printStudent();
    }


    public void clearList(){
        this.point = null;
    }

    public boolean isEmpty(){
        return this.point == null;
    }
}
