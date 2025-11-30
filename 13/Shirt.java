import java.util.StringTokenizer;

public class Shirt {
    private String index, name, color, size;
    public Shirt(String str){
        var tokens = new StringTokenizer(str, ",;.");
        this.index = tokens.nextToken(); this.name = tokens.nextToken(); this.color = tokens.nextToken(); this.size = tokens.nextToken();
    }

    @Override
    public String toString(){
        return ((new StringBuilder("Index in shop: ")).append(this.index).append("\nName of the shirt: ").append(this.name).append("\nColor: ").append(this.color).append("\nSize of the shirt: ").append(this.size)).toString();
    }
}
