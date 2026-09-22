import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RColour {
    public static void main(String[] args) {
        JFrame f = new JFrame("RGB Color");
        f.setSize(500, 300);
        f.setLayout(null);
        JLabel l1 = new JLabel("Red");
        l1.setBounds(50, 50, 50, 30);
        f.add(l1);
        JLabel l2 = new JLabel("Green");
        l2.setBounds(150, 50, 50, 30);
        f.add(l2);

        JLabel l3 = new JLabel("Blue");
        l3.setBounds(250, 50, 50, 30);
        f.add(l3);

     
        Integer values[] = new Integer[256];
        for (int i = 0; i < 256; i++) {
            values[i] = i;
        }

      
        JComboBox<Integer> cb1 = new JComboBox<>(values);
        cb1.setBounds(50, 80, 70, 30);
        f.add(cb1);

        JComboBox<Integer> cb2 = new JComboBox<>(values);
        cb2.setBounds(150, 80, 70, 30);
        f.add(cb2);

        JComboBox<Integer> cb3 = new JComboBox<>(values);
        cb3.setBounds(250, 80, 70, 30);
        f.add(cb3);

        JButton btn = new JButton("Show Output");
        btn.setBounds(350, 80, 120, 30);
        f.add(btn);

        btn.addActionListener(e -> {
            int r = (int) cb1.getSelectedItem();
            int g = (int) cb2.getSelectedItem();
            int b = (int) cb3.getSelectedItem();

            Color color = new Color(r, g, b);
            f.getContentPane().setBackground(color);
        });

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}