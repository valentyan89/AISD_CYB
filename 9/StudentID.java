public class StudentID implements Comparable<StudentID>{
    private String name; private int iDStudent;
    public StudentID(String name, int iD){
        this.name = name; this.iDStudent = iD;
    }
    public int compareTo(StudentID next) {
        return Integer.compare(this.getID(), next.getID());
    }
    public String getName(){
        return this.name;
    }
    public int getID(){
        return this.iDStudent;
    }
    @Override
    public String toString(){
        return String.format("Name - %s, ID = %d", this.getName(),this.getID());
    }
}
