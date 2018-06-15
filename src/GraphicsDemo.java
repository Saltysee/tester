import javax.swing.*;
import java.awt.*;

public class GraphicsDemo extends JFrame {

public GraphicsDemo() {
    setTitle("HELLO");
    setSize(800, 480);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

}

public static void main(String args[]) {
    GraphicsDemo demo = new GraphicsDemo();
}

public void paint(Graphics g) {
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, 800, 480);
    g.setColor(Color.BLUE);
    g.drawRect(60, 200, 100, 250);
    g.setColor(Color.BLACK);
    g.drawString("I did a poo", 200, 400);
}
}
