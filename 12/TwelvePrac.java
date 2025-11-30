import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class TwelvePrac {
    static void task1() {
        var frame = new JFrame("World of Tonks");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(200, 200));

        ArrayList<Image> arr = new ArrayList<Image>();
        for (int i = 1; i <= 13; i++) {
            var icon = new ImageIcon(String.format("frames/%d.jpg", i));
            var imgFile = icon.getImage();
            arr.add(imgFile);
        }

        JLabel imageLabel = new JLabel(new ImageIcon(arr.get(0)));
        frame.add(imageLabel);

        Timer timer = new Timer(50, new ActionListener() {
            int numImg = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                numImg = (numImg + 1) % arr.size();
                var cur = arr.get(numImg);
                var iconchik = new ImageIcon(cur.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH));
                imageLabel.setIcon(iconchik);
            }
        });
        frame.setVisible(true);
        frame.toFront();
        frame.pack();
        timer.start();
    }

    static void task2(){
        var match = new Milan("world of tonks");
    }


    public static void main(String[] args) {
        task2();
    }
}
