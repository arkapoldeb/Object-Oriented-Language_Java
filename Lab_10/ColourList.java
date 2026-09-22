import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColourList {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Frame");
        f.setSize(400, 300);
        f.setLayout(null);
        String colors[] = {"White", "Red", "Blue", "Orange"};
        JList<String> list = new JList<>(colors);
        list.setBounds(50, 50, 100, 80);
        f.add(list);
        JButton btn = new JButton("Click");
        btn.setBounds(180, 70, 80, 30);
        f.add(btn);
        btn.addActionListener(e -> {
            String selected = list.getSelectedValue();

            if (selected != null) {
                switch (selected.toLowerCase()) {
                    case "white": f.getContentPane().setBackground(Color.WHITE); break;
                    case "red": f.getContentPane().setBackground(Color.RED); break;
                    case "blue": f.getContentPane().setBackground(Color.BLUE); break;
                    case "orange": f.getContentPane().setBackground(Color.ORANGE); break;
                }
            } else {
                JOptionPane.showMessageDialog(f, "Select a color!");
            }
        });

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}