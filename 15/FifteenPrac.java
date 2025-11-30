import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FifteenPrac {
    static void task1(){
        JTextField jta1 = new JTextField(10);
        JTextField jta2 = new JTextField(10);
        JButton button = new JButton("Add them up");
        Font fnt = new Font("Fira Code",Font.BOLD,20);
        var frame = new JFrame("Workd of tonks");
        frame.setFont(fnt);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(250,150);
        frame.add(new JLabel("1st Number"));
        frame.add(jta1);
        frame.add(new JLabel("2nd Number"));
        frame.add(jta2);
        frame.add(button);

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    if (x2 == 0){
                        JOptionPane.showMessageDialog(null, "Can't div by zero","Alarm" , JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        var formatter = String.format("Sum = %f\nSub = %f\nProd = %f\nDiv = %f", x1+x2, x1-x2, x1*x2, x1/x2);
                        JOptionPane.showMessageDialog(null, formatter,"Alarm",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","Alarm" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.setVisible(true);
    }
    static void task2(){
        JFrame frame = new JFrame("World of Tonks");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLayout(new FlowLayout());
        JComboBox<Country> countries = new JComboBox<>(Country.values());
        JLabel info = new JLabel("Pls, Choose country");
        countries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Country country = (Country) countries.getSelectedItem();
                info.setText("<html><div style='width:300px'>" + country.getInfo() + "</div></html>");
            }
            });
        frame.add(info);
        frame.add(countries);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        task1();
    }    
}
