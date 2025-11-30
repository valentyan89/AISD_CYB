import java.awt.Color;
import java.awt.Graphics2D;

public class CirclePaint extends ShapePaint{
    private int radius;
    public CirclePaint(int x, int y, Color color, int r) {
        super(x, y, color); this.radius = r;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(this.color); g.fillOval(this.x, this.y, this.radius*2, this.radius*2);
    }
    
}
