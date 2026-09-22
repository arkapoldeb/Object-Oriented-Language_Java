import javax.swing.*;
import java.awt.event.*;

public class MouseTrack extends JFrame implements MouseMotionListener {
    JLabel label;

    MouseTrack() {
        setSize(300,200);
        label = new JLabel();
        add(label);

        addMouseMotionListener(this);
        setVisible(true);
    }

    public void mouseMoved(MouseEvent e) {
        label.setText("X: "+e.getX()+" Y: "+e.getY());
    }

    public void mouseDragged(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseTrack();
    }
}