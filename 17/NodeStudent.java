public class NodeStudent {
    private StudentForList student; private NodeStudent lastStudent, nextStudent;

    public NodeStudent(StudentForList student, NodeStudent nextStudent, NodeStudent lastStudent) {
        this.student = student;
        this.nextStudent = nextStudent;
        this.lastStudent = lastStudent;
    }

    public StudentForList getStudent() {
        return student;
    }

    public void setStudent(StudentForList student) {
        this.student = student;
    }

    public NodeStudent getNextStudent() {
        return nextStudent;
    }
    public NodeStudent getLastStudent() {
        return lastStudent;
    }

    public void setNextStudent(NodeStudent nextStudent) {
        this.nextStudent = nextStudent;
    }
    public void setLastStudent(NodeStudent lastStudent) {
        this.lastStudent = lastStudent;
    }
}
