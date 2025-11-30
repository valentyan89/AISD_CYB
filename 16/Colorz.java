import java.awt.Color;

public enum Colorz {
    Black(Color.BLACK),
    Blue(Color.BLUE),
    Red(Color.RED);

    private final Color color;

    Colorz(Color col){
        this.color = col;
    }

    public Color getColor(){
        return this.color;
    }
}
