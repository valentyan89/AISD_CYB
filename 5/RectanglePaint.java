import java.awt.Color;
import java.awt.Graphics2D;

public class RectanglePaint extends ShapePaint{
    private int xLen, yLen;
    public RectanglePaint(int x, int y, Color color, int xLen, int yLen) {
        super(x, y, color); this.xLen = xLen; this.yLen = yLen;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(this.color); g.fillRect(this.x, this.y, this.xLen, this.yLen);
    }
    
}
