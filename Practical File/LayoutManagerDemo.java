import javax.swing.*;
import java.awt.*;

public class LayoutManagerDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Manager Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating panels
        JPanel borderLayoutPanel = new JPanel(new BorderLayout());
        JPanel flowLayoutPanel = new JPanel(new FlowLayout());
        JPanel gridLayoutPanel = new JPanel(new GridLayout(3, 3));
        JPanel boxLayoutPanel = new JPanel();
        boxLayoutPanel.setLayout(new BoxLayout(boxLayoutPanel, BoxLayout.Y_AXIS));

        // Adding components to the panels
        // BorderLayout
        borderLayoutPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderLayoutPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderLayoutPanel.add(new JButton("West"), BorderLayout.WEST);
        borderLayoutPanel.add(new JButton("East"), BorderLayout.EAST);
        borderLayoutPanel.add(new JButton("Center"), BorderLayout.CENTER);

        // FlowLayout
        flowLayoutPanel.add(new JButton("Button 1"));
        flowLayoutPanel.add(new JButton("Button 2"));
        flowLayoutPanel.add(new JButton("Button 3"));

        // GridLayout
        for (int i = 1; i <= 9; i++) {
            gridLayoutPanel.add(new JButton("Button " + i));
        }

        // BoxLayout
        boxLayoutPanel.add(new JButton("Button 1"));
        boxLayoutPanel.add(Box.createVerticalStrut(10));
        boxLayoutPanel.add(new JButton("Button 2"));
        boxLayoutPanel.add(Box.createVerticalStrut(10));
        boxLayoutPanel.add(new JButton("Button 3"));

        // Adding panels to the frame
        frame.setLayout(new GridLayout(2, 2));
        frame.add(borderLayoutPanel);
        frame.add(flowLayoutPanel);
        frame.add(gridLayoutPanel);
        frame.add(boxLayoutPanel);

        frame.pack();
        frame.setVisible(true);
    }
}
