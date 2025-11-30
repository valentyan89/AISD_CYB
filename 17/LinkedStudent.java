public class LinkedStudent {
    private NodeStudent point, lastPoint;

    public LinkedStudent(){
        this.point = null; this.lastPoint = null;
    }

    public void appendLast(StudentForList n){
        NodeStudent temp = new NodeStudent(n, null, null);
        if (isEmpty()){
            this.point = temp;
            this.lastPoint = temp;
        }
        else{
            this.lastPoint.setNextStudent(temp);
            temp.setLastStudent(this.lastPoint);
            this.lastPoint = temp;
        }
    }

    public void appendFirst(StudentForList n){
        NodeStudent temp = new NodeStudent(n, null, null);
        if (isEmpty()){
            this.point = temp;
            this.lastPoint = temp;
        }
        else{
            temp.setNextStudent(this.point);
            this.point.setLastStudent(temp);
            this.point = temp;
        }
    }

    public void insertAt(int i, StudentForList n){
        NodeStudent temp = new NodeStudent(n, null, null);
        if (i <= 0 || isEmpty()) {
            temp.setNextStudent(this.point);
            if (this.point != null){
                this.point.setLastStudent(temp);
            }
            else{
                this.lastPoint = temp;
            }
            this.point = temp;
            return;
        }

        NodeStudent cur = this.point;
        for (int index = 0; cur.getNextStudent() != null && index < i - 1; index++){
            cur = cur.getNextStudent();
        }

        if (cur.getNextStudent() == null) {
            this.lastPoint.setNextStudent(temp);
            temp.setLastStudent(this.lastPoint);
            this.lastPoint = temp;
        }
        else{
            cur.setNextStudent(temp);
            temp.setLastStudent(cur);
            temp.setNextStudent(cur.getNextStudent());
            cur.getNextStudent().setLastStudent(temp);
        }
    }

    public void remove(int i){
        NodeStudent cur = this.point;

        if (isEmpty()){
            System.out.println("Zero elements in list");
            return;
        }

        for (int index = 0; cur != null && index < i; index++){
            cur = cur.getNextStudent();
        }

        if (cur == null) {
            System.out.println("Index out of range");
            return;
        }

        if (cur == this.point){
            this.point = cur.getNextStudent();
            if (this.point != null){
                this.point.setLastStudent(null);
            }
            else{
                this.lastPoint = null;
            }
        }
        else if(cur == this.lastPoint){
            this.lastPoint = cur.getLastStudent();
            this.lastPoint.setNextStudent(null);
        }
        else {
            cur.getLastStudent().setNextStudent(cur.getNextStudent());
            cur.getNextStudent().setLastStudent(cur.getLastStudent());
        }
    }

    public void atPos(int i){
        if (isEmpty()){
            System.out.println("Zero elements in list");
            return;
        }
        NodeStudent cur = this.point;
        for (int index = 0; cur != null && index < i; index++){
            cur = cur.getNextStudent();
        }

        if (cur == null) {
            System.out.println("Index out of range");
            return;
        }

        cur.getStudent().printStudent();
    }

    public boolean isEmpty(){
        return this.point == null;
    }


    public void clearLinkedList(){
        this.point = null; this.lastPoint = null;
    }
}
