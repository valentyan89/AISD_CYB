import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Milan extends JFrame{
    private int milanScore = 0, madridScore = 0;

    private JButton milanButton = new JButton("AC Milana"), madridButton = new JButton("Rea1 Madrid");

    private JLabel resLabel = new JLabel("Result: 0 x 0", SwingConstants.CENTER), lastScorerLabel = new JLabel("Last Scorer: RTU", SwingConstants.CENTER);
    private Label winnerLabel = new Label("Winner: RTU", Label.CENTER);


    private void liveScore(String lastScorer) {
        resLabel.setText(String.format("Result: %d x %d", milanScore, madridScore));
        lastScorerLabel.setText(String.format("Last Scorer: %s", lastScorer));
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milana");
        }
        else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Rea1 Madrid");
        }
        else {
            winnerLabel.setText("Winner: RTU");
        }
    }

    public Milan(String name) {
        super(name);
        setSize(700, 400);
        setLayout(new GridLayout(2, 1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        var font = new Font("FiraCode", Font.BOLD, 30);
        resLabel.setFont(font);
        lastScorerLabel.setFont(font);
        winnerLabel.setFont(font);
        milanButton.setFont(font);
        madridButton.setFont(font);

        setLayout(new BorderLayout());
        var textPanel = new JPanel(new GridLayout(3, 1));
        textPanel.add(resLabel);
        textPanel.add(lastScorerLabel);
        textPanel.add(winnerLabel);

        var buttonsPanel = new JPanel(new BorderLayout());
        buttonsPanel.add(milanButton, BorderLayout.WEST);
        buttonsPanel.add(madridButton, BorderLayout.EAST);

        add(textPanel, BorderLayout.NORTH);
        add(buttonsPanel, BorderLayout.SOUTH);

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                liveScore("AC Milana");
            }});

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                liveScore("Rea1 Madrid");
            }});
        setVisible(true);
        toFront();
    }
}
