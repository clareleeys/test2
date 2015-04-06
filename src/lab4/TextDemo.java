package lab4;

import javax.swing.*;
import java.awt.*;

public class TextDemo extends JFrame {
public static final long serialVersionUID=138938122;

public TextDemo(){
        super("Text Demo");
        this.setLayout(new BorderLayout());

        JPanel panel=new JPanel(new GridLayout(1,2));
        panel.setPreferredSize(new Dimension(40,20));
        panel.add(new JLabel("Hello"));
        panel.add(new JTextField(5));

        this.add(panel, BorderLayout.PAGE_END);
        this.setSize(500, 400);
        this.setLocation(100, 100);
        this.setVisible(true);
        }

public static void main(String[] args) {
        new TextDemo();
        }
}