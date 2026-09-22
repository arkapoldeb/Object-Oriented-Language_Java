import javax.swing.*;
import java.awt.event.*;
public class Calculator 
{
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        f.setSize(400, 300);
        f.setLayout(null);
        JLabel l1 = new JLabel("First Number:");
        l1.setBounds(50, 30, 120, 30);
        f.add(l1);
        JLabel l2 = new JLabel("Second Number:");
        l2.setBounds(50, 70, 120, 30);
        f.add(l2);
        JLabel l3 = new JLabel("Result:");
        l3.setBounds(50, 110, 120, 30);
        f.add(l3);

        JTextField t1 = new JTextField();
        t1.setBounds(180, 30, 120, 30);
        f.add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(180, 70, 120, 30);
        f.add(t2);

        JTextField t3 = new JTextField();
        t3.setBounds(180, 110, 120, 30);
        t3.setEditable(false);
        f.add(t3);
        JButton add = new JButton("Add");
        add.setBounds(50, 160, 80, 30);

        JButton sub = new JButton("Sub");
        sub.setBounds(140, 160, 80, 30);

        JButton mul = new JButton("Multiply");
        mul.setBounds(230, 160, 100, 30);

        JButton reset = new JButton("Reset");
        reset.setBounds(140, 200, 100, 30);

        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(reset);
        add.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            t3.setText(String.valueOf(a + b));
        });

        sub.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            t3.setText(String.valueOf(a - b));
        });

        mul.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            t3.setText(String.valueOf(a * b));
        });

        reset.addActionListener(e -> {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        });

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}