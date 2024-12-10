import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainFrame extends JFrame implements ActionListener {
    int paneType = JOptionPane.PLAIN_MESSAGE;

    JButton countButton;
    JTextField textField;

    String enteredText;
    int characters;

    public MainFrame() {

        // Count button
        countButton = new JButton("Count");
        countButton.setFocusable(false);
        countButton.addActionListener(this);
        this.add(countButton);

        // Text field
        textField = new JTextField();
        textField.setFont(new Font("Century", Font.PLAIN, 14));
        textField.setPreferredSize(new Dimension(230, 26));
        textField.addActionListener(this);
        this.add(textField);

        // Window set up
        this.setTitle("String character counter");
        this.setSize(330, 74);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countButton || e.getSource() == textField) {
            enteredText = textField.getText();
            characters = enteredText.length();

            if (characters == 1) {
                JOptionPane.showMessageDialog(null, "1 character", enteredText, paneType);
            } else {
                JOptionPane.showMessageDialog(null, String.format("%s characters", characters), enteredText, paneType);
            }
        }
    }
}
