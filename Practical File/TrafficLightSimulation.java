import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLightSimulation {
    private JFrame frame;
    private JPanel lightPanel;
    private JButton redButton, yellowButton, greenButton;

    public TrafficLightSimulation() {
        frame = new JFrame("Traffic Light Simulation");
        frame.setSize(200, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lightPanel = new JPanel();
        lightPanel.setBackground(Color.BLACK);
        lightPanel.setLayout(new GridLayout(3, 1));

        redButton = createButton("Red", Color.RED);
        yellowButton = createButton("Yellow", Color.YELLOW);
        greenButton = createButton("Green", Color.GREEN);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(greenButton);

        frame.add(lightPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private JButton createButton(String label, Color color) {
        JButton button = new JButton(label);
        button.setBackground(color);
        button.setOpaque(true);
        button.setBorderPainted(false);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                turnOffAllLights();
                button.setEnabled(false);
                lightPanel.setBackground(color);
            }
        });
        return button;
    }

    private void turnOffAllLights() {
        redButton.setEnabled(true);
        yellowButton.setEnabled(true);
        greenButton.setEnabled(true);
        lightPanel.setBackground(Color.BLACK);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TrafficLightSimulation();
            }
        });
    }
}
