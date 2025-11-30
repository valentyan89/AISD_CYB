public class StudentNode {
    private StudentForList student; private StudentNode nextStudent;

    public StudentNode(StudentForList student, StudentNode nextStudent) {
        this.student = student;
        this.nextStudent = nextStudent;
    }

    public StudentForList getStudent() {
        return student;
    }

    public void setStudent(StudentForList student) {
        this.student = student;
    }

    public StudentNode getNextStudent() {
        return nextStudent;
    }

    public void setNextStudent(StudentNode nextStudent) {
        this.nextStudent = nextStudent;
    }
}
