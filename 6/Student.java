public class Student implements Nameable{
    private String name;
    public Student(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return this.name;
    }
}
