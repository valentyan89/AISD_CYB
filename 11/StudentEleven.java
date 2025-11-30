import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentEleven {
    private String name; private Date bDay;
    public StudentEleven(String name, Date data){
        this.name = name; this.bDay = data;
    }
    @Override
    public String toString(){
        var fmt = new SimpleDateFormat("dd MMM yyyy");
        return String.format("Name - %s\t Born - %s", this.name, fmt.format(this.bDay));
    }

    public String shortInfo(){
        var fmt = new SimpleDateFormat("dd.MM.yyyy");
        return String.format("Name - %s\t Born - %s", this.name, fmt.format(this.bDay));
    }

    public String longInfo(){
        var fmt = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        return String.format("Name - %s\t Born - %s", this.name, fmt.format(this.bDay));
    }
}
