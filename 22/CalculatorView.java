import java.util.HashMap;
import java.util.Map;
import java.awt.*;
import javax.swing.*;

public class CalculatorView extends JFrame{
    private JTextField display; private Map<String, JButton> buttons = new HashMap<>();

    private final String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "<-", "=", "+"};

    public CalculatorView() {
        setTitle("World of tonks");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Fira Code",Font.BOLD,24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        var buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));

        for (var label : buttonLabels){
            var button = new JButton(label);
            button.setFont(new Font("Fira Code", Font.BOLD, 20));
            buttons.put(label, button);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    public void setDisplayText(String text){
        this.display.setText(text);
    }

    public String getDisplayText(){
        return display.getText();
    }

    public JButton getButton(String label){
        return buttons.get(label);
    }

    public Map<String, JButton> getAllButtons(){
        return buttons;
    }
}