import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RegistrationForm 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Registration Form");
        f.setSize(400, 500);
        f.setLayout(null);
        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50, 50, 100, 30);
        f.add(l1);
        JLabel l2 = new JLabel("Address:");
        l2.setBounds(50, 100, 100, 30);
        f.add(l2);
        JLabel l3 = new JLabel("Gender:");
        l3.setBounds(50, 200, 100, 30);
        f.add(l3);
        JLabel l4 = new JLabel("Hobbies:");
        l4.setBounds(50, 250, 100, 30);
        f.add(l4);
        JTextField t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);
        f.add(t1);
        JTextArea ta = new JTextArea();
        ta.setBounds(150, 100, 150, 60);
        f.add(ta);
        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(150, 200, 70, 30);

        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(220, 200, 80, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.add(r1);
        f.add(r2);
        JCheckBox c1 = new JCheckBox("Reading");
        c1.setBounds(150, 250, 100, 30);

        JCheckBox c2 = new JCheckBox("Music");
        c2.setBounds(250, 250, 100, 30);

        f.add(c1);
        f.add(c2);

        
        JButton b = new JButton("Submit");
        b.setBounds(150, 320, 100, 30);
        f.add(b);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}