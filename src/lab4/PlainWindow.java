package lab4;
import javax.swing.JFrame;

public class PlainWindow extends JFrame {
public static final long serialVersionUID=138938123;

public PlainWindow() {
        super("Plain Window");
        this.setSize(500, 400);
        this.setLocation(100, 100);
        this.setVisible(true);
        }

public static void main(String[] args) {
        new PlainWindow();
        }
}