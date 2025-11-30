import java.util.ArrayList;

public class LabClass implements LabClassUI{
    private ArrayList<StudentScores> group = new ArrayList<StudentScores>();
    
    @Override
    public void addStudent(StudentScores student){
        this.group.add(student);
    }
    
    @Override
    public void sortByGPA(){
        var sorting = new Sorting();
        sorting.quickSort(this.group, 0, this.group.size()-1);
    }

    @Override
    public StudentScores findStudentScores(String name) throws EmptyStringException, StudentNotFoundException {
        if (name == null || name.isEmpty()){
            throw new EmptyStringException("Student can't be void");
        }

        for (var st: group){
            if (st.getName().equalsIgnoreCase(name.trim())){
                return st;
            }
        }
        throw new StudentNotFoundException(String.format("Student with name %s not found in group", name));
    }

    @Override
    public void printGroup(){
        for (var st: this.group){
            System.out.println(st);
        }
    }
}
