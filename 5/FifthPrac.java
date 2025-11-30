import java.awt.*;

import javax.swing.*;

public class FifthPrac {
    static void task3(String[] path){
        if (path.length == 0){
             throw new IllegalArgumentException("Zero tag words in console");
        }
        var frame = new JFrame("world of tonks");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var scr = Toolkit.getDefaultToolkit();
        var screenSize = scr.getScreenSize();
        int w = screenSize.width;
        int h = screenSize.height;
        frame.setSize(new Dimension(w, h));
        //var text = new JLabel("sorry", JLabel.RIGHT);
        var picture = new ImageIcon(path[0]);
        var pic = new JLabel(picture, JLabel.LEFT);
        frame.getContentPane().add(pic);
        frame.toFront();
        frame.pack();
        frame.setVisible(true);
    }

    static void task2(){
        JFrame frame = new JFrame("world of tonks");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Draw());
        frame.toFront();
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // task3(args);
        task2();
    }
}
