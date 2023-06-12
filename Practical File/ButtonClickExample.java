import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonClickExample {
    private JFrame frame;
    private JButton button;
    private JLabel label;

    public ButtonClickExample() {
        frame = new JFrame("Button Click Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String buttonText = button.getText();
                label.setText("Button Text: " + buttonText);
            }
        });

        label = new JLabel("Click the button");

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonClickExample();
            }
        });
    }
}
