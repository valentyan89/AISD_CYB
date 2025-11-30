import java.awt.Color;
import java.awt.Graphics2D;

public class SquarePaint extends ShapePaint{
    private int lineLen;
    public SquarePaint(int x, int y, Color color, int lineLen) {
        super(x, y, color); this.lineLen = lineLen;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(this.color); g.fillRect(this.x, this.y, this.lineLen, this.lineLen);
    }
    
}
