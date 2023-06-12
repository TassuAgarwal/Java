import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pixel extends JFrame {
    private JPanel canvas;
    private JCheckBox redCheckBox, greenCheckBox, blueCheckBox;

    public pixel() {
        setTitle("Color Chooser");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        canvas = new JPanel();
        canvas.setPreferredSize(new Dimension(30, 30));
        add(canvas, BorderLayout.CENTER);

        redCheckBox = new JCheckBox("Red");
        greenCheckBox = new JCheckBox("Green");
        blueCheckBox = new JCheckBox("Blue");

        redCheckBox.addItemListener(new ColorChangeListener());
        greenCheckBox.addItemListener(new ColorChangeListener());
        blueCheckBox.addItemListener(new ColorChangeListener());

        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.add(redCheckBox);
        checkBoxPanel.add(greenCheckBox);
        checkBoxPanel.add(blueCheckBox);

        add(checkBoxPanel, BorderLayout.SOUTH);
    }

    private class ColorChangeListener implements ItemListener {
        public void itemStateChanged(ItemEvent event) {
            int red = redCheckBox.isSelected() ? 255 : 0;
            int green = greenCheckBox.isSelected() ? 255 : 0;
            int blue = blueCheckBox.isSelected() ? 255 : 0;
            Color color = new Color(red, green, blue);
            canvas.setBackground(color);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new pixel().setVisible(true);
            }
        });
    }
}
