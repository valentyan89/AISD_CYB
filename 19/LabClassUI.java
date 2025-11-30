public interface LabClassUI {
    void addStudent(StudentScores student);
    void sortByGPA();
    StudentScores findStudentScores(String name) throws StudentNotFoundException, EmptyStringException;
    void printGroup();
}
