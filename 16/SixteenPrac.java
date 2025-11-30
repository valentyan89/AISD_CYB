import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SixteenPrac {
    static void task2(){
        JFrame frame = new JFrame("World on Tonks");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JComboBox<NewFont> fonts = new JComboBox<>(NewFont.values());
        JComboBox<Colorz> colors = new JComboBox<>(Colorz.values());
        JTextArea jta = new JTextArea();
        jta.setFont(new Font("Fira Code", Font.PLAIN, 16));
        JPanel controlPanel = new JPanel();
        controlPanel.add(new JLabel("Font:"));
        controlPanel.add(fonts);
        controlPanel.add(new JLabel("Color:"));
        controlPanel.add(colors);

        colors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Colorz col = (Colorz) colors.getSelectedItem();
                jta.setForeground(col.getColor());
            }
            });

        fonts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewFont font = (NewFont) fonts.getSelectedItem();
                jta.setFont(font.getFont());
            }
            });
        frame.add(controlPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(jta), BorderLayout.CENTER);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        task2();
    }
}
