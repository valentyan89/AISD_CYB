package java;




public class Author {
    private String name; private String email; private char gender;

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public char getGender(){
        return this.gender;
    }
    public void setName(String tempVar){
        this.name = tempVar;
    }
    public void setEmail(String tempVar){
        this.email = tempVar;
    }
    public void setGender(char tempVar){
        this.gender = tempVar;
    }

    public Author(String var1, String var2, char var3){
        this.name = var1; this.email = var2; this.gender = var3;
    }
    @Override
    public String toString(){
        return "author(name=" +this.getName() + ", email=" + this.getEmail() + ", gender=" + this.getGender() + ')';
    }
}
