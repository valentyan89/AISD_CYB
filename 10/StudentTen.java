public class StudentTen {
    private String name, surname, facult; private int course, group;

    public StudentTen(String name, String srnm, String fac, int course, int group){
        this.name = name; this.surname = srnm; this.facult = fac; this.course = course; this.group = group;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getFacult(){
        return this.facult;
    }
    public int getCourse(){
        return this.course;
    }
    public int getGroup(){
        return this.group;
    }

    public void setName(String tempVar){
        this.name = tempVar;
    }
    public void setSurname(String tempVar){
        this.surname = tempVar;
    }
    public void setFacult(String tempVar){
        this.facult = tempVar;
    }
    public void setCourse(int tempVar){
        this.course = tempVar;
    }
    public void setGroup(int tempVar){
        this.group = tempVar;
    }

    @Override
    public String toString(){
        return String.format("Student - %s %s\tfaculty - %s, course - %d, group - %d", this.getName(), this.getSurname(), this.getFacult(), this.getCourse(), this.getGroup());
    }
}
