package lab4;
import javax.swing.*;
import java.awt.event.*;


public class ButtonDemo extends JFrame {
        public static final long serialVersionUID=138938126;
        public ButtonDemo() {
        super("Button Demo");
        JButton b=new JButton("Hide");
        b.addActionListener(
        new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        JButton b=(JButton)e.getSource();
                        b.setVisible(false);
                }
        }
        );
        add(b);
        this.setSize(500, 400);
        this.setLocation(100, 100);
        this.setVisible(true);
}

public static void main(String[] args)  {
        new ButtonDemo();
        }
}