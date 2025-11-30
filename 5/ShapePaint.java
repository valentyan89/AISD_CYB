import java.awt.*;


public abstract class ShapePaint {
    protected int x, y; protected Color color;
    public ShapePaint(int x, int y, Color color) {
        this.x = x; this.y = y; this.color = color;
    }

    public abstract void draw(Graphics2D g);
}
