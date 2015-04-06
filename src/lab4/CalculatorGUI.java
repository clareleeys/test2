package lab4;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class CalculatorGUI extends JFrame {

    public static final long serialVersionUID = 138938133;

    private JTextField answer, a, b, o;

    public CalculatorGUI() {

        super("Calculator");

        JButton l = null;

        this.setLayout(new FlowLayout());

        l = new JButton("=");

        a = new JTextField(5);

        b = new JTextField(5);

        o = new JTextField(1);

        answer = new JTextField(20);

        this.add(a);

        this.add(o);

        this.add(b);

        this.add(l);

        this.add(answer);

        l.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String operator = o.getText();

                String oa = a.getText();

                String ob = b.getText();

                double ooa = Double.parseDouble(oa);

                double oob = Double.parseDouble(ob);

                // Please add some essential codes here

                if (operator.equals("+")) {

                     answer.setText(String.valueOf(ooa + oob));

                 } else if (operator.equals("-")) {

                     answer.setText(String.valueOf(ooa - oob));

                 } else if (operator.equals("*")) {

                     answer.setText(String.valueOf(ooa * oob));

                 } else if (operator.equals("/")) {

                     answer.setText(String.valueOf(ooa / oob));

                 }
            }

        });

        this.setVisible(true);

        this.setSize(new Dimension(500, 70));

    }

    public static void main(String[] args) {

        new CalculatorGUI();

    }

}