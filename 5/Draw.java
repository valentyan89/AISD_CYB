import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

public class Draw extends JPanel{
    private List<ShapePaint> shapes = new ArrayList<>();

    private ShapePaint create() {
        var rn = new Random();
        var color = new Color(rn.nextInt(256), rn.nextInt(256), rn.nextInt(256));
        int x = rn.nextInt(1920);
        int y = rn.nextInt(1080);

        return switch (rn.nextInt(3)) {
            case 0 -> new CirclePaint(x, y, color, rn.nextInt(100) + 19);
            case 1 -> new RectanglePaint(x, y, color, rn.nextInt(100) + 19, rn.nextInt(100) + 19);
            default -> new SquarePaint(x, y, color, rn.nextInt(100) + 19);
        };
    }

    public Draw() {
        setPreferredSize(new Dimension(1800, 1028));
        for (int i = 0; i <= 20; i++) {
            shapes.add(create());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D grap = (Graphics2D) g;
        for (var shape: shapes){
            shape.draw(grap);
        }
    }
}

