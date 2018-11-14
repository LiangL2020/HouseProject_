import javax.swing.*;
import java.awt.*;

/**
 * Created by michael_hopps on 10/2/17.
 */
public class HouseMain {

    public static void main(String[] args) {

        JFrame frame = new JFrame("House Project - Liang Lu");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 1200;
        int height = 800;
        frame.setPreferredSize(new Dimension(width, height+24));


        JPanel panel = new HousePanel(width, height);
        panel.setFocusable(true);
        panel.grabFocus();

        int r = (int)(Math.random()*20);
        int g = (int)(Math.random()*20 + 100); //within [100, 120)
        int b = (int)(Math.random()*56 + 200); //within [200,256)
        Color randColor = new Color(r, g, b);
        frame.setBackground(randColor); //background (obviously)


        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
