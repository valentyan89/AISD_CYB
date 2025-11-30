public class StudentScores{
    private float sum, mathScore, programmingScore, internationalLanguage; private String name;

    public StudentScores(String name, float v1, float v2, float v3){
        this.name = name; this.mathScore = v1; this.programmingScore = v2; this.internationalLanguage = v3; this.sum = v1+v2+v3;
    }
    public float getSum(){
        return this.sum;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return String.format("Student - %s, sum score of the exams = %.02f", this.getName(), this.getSum());
    }
}