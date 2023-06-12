import javax.swing.*;
import java.awt.event.*;

class KeyboardEventExample implements KeyListener {
    private JFrame frame;
    private JLabel label;

    public KeyboardEventExample() {
        frame = new JFrame("Keyboard Event Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Press any key");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);

        frame.addKeyListener(this);
        frame.setFocusable(true);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        label.setText("Key Typed: " + keyChar);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        label.setText("Key Pressed: " + KeyEvent.getKeyText(keyCode));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        label.setText("Key Released: " + KeyEvent.getKeyText(keyCode));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new KeyboardEventExample();
            }
        });
    }
}
