public class Person {
    private String surname, name, fName;

    public Person(String str){
        String[] builder = str.split(" ");
        switch (builder.length) {
            case 2:
                this.surname = builder[0]; this.name = builder[1];
                break;
            case 3:
                this.surname = builder[0]; this.name = builder[1]; this.fName = builder[2];
                break;
            case 1:
                this.surname = str;
                break;
            default:
                throw new IllegalArgumentException("u need to peek 3 words");
        }
    }
    @Override
    public String toString(){
        StringBuilder tempVar = new StringBuilder(surname);
        if (this.name != null && this.fName != null){
            tempVar.append(" "); tempVar.append(Character.toUpperCase(this.name.charAt(0))); tempVar.append(". "); tempVar.append(Character.toUpperCase(this.fName.charAt(0))); tempVar.append(".");
        }
        if (this.fName == null && this.name != null){
            tempVar.append(" "); tempVar.append(Character.toUpperCase(this.name.charAt(0))); tempVar.append(".");
        }
        return tempVar.toString();
    }
}