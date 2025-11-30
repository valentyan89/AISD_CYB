public class OrbicularList {
    StudentNode point;

    public OrbicularList(){
        this.point = null;
    }

    public void append(StudentForList n){
        StudentNode temp = new StudentNode(n, null);
        if (isEmpty()){
            temp.setNextStudent(temp);
            this.point = temp;
        }
        else{
            temp.setNextStudent(this.point.getNextStudent());
            point.setNextStudent(temp);
            point = temp;
        }
    }

    public void appendFirst(StudentForList n){
        StudentNode temp = new StudentNode(n, null);
        if (isEmpty()){
            temp.setNextStudent(temp);
            this.point = temp;
        }
        else{
            temp.setNextStudent(this.point.getNextStudent());
            this.point.setNextStudent(temp);
        }
    }

    public void remove(int i){
        if (isEmpty()){
            System.out.println("Zero elements in list");
            return;
        }

        var head = point.getNextStudent();
        if (i == 0){
            if (point == head){
                point = null;
            }
            else{
                point.setNextStudent(head.getNextStudent());
            }
            return;
        }

        var cur = head;
        for (int index = 0; cur.getNextStudent() != head && index < i-1; index++){
            cur = cur.getNextStudent();
        }

        if (cur.getNextStudent() == head){
            System.out.println("Index put of ranger");
            return;
        }
        cur.setNextStudent(cur.getNextStudent().getNextStudent());
        if (cur.getNextStudent() == point){
            point = cur;
        }
    }

    public void atPos(int i){
        if (isEmpty()) {
            System.out.println("Zero elements in list");
            return;
        }

        int size = 1;
        var cur = point.getNextStudent();
        var temp = cur;

        while (temp != point) {
            temp = temp.getNextStudent();
            size++;
        }

        if (i < 0 || i >= size) {
            System.out.println("Index out of range");
            return;
        }

        for (int index = 0; index < i; index++) {
            cur = cur.getNextStudent();
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
