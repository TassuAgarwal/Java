import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseEventExample implements MouseListener, MouseMotionListener {
    private JFrame frame;
    private JLabel label;

    public MouseEventExample() {
        frame = new JFrame("Mouse Event Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Click and move the mouse");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);

        frame.addMouseListener(this);
        frame.addMouseMotionListener(this);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
        frame.getContentPane().setBackground(Color.RED);
        label.setForeground(Color.WHITE);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
        frame.getContentPane().setBackground(Color.GREEN);
        label.setForeground(Color.BLACK);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
        frame.getContentPane().setBackground(Color.BLUE);
        label.setForeground(Color.WHITE);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
        frame.getContentPane().setBackground(Color.YELLOW);
        label.setForeground(Color.BLACK);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
        frame.getContentPane().setBackground(Color.WHITE);
        label.setForeground(Color.BLACK);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse Dragged");
        frame.getContentPane().setBackground(Color.ORANGE);
        label.setForeground(Color.BLACK);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse Moved");
        frame.getContentPane().setBackground(Color.CYAN);
        label.setForeground(Color.BLACK);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MouseEventExample();
            }
        });
    }
}
