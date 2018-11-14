import java.awt.*;

/**
 * Created by Liang Lu on 10/18/17.
 */
public class Swing {
    private int x, y;

    public Swing(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2){

        g2.setStroke(new BasicStroke(2));
        g2.drawLine(600, 225, 590, 350);
        g2.drawLine(800, 225, 810, 350);
        g2.drawLine(600, 225, 800, 225); //structure

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(1));
        g2.drawLine(645, 225, 645, 315);
        g2.drawLine(755, 225, 755, 315);
        g2.drawLine(675, 225, 675, 315);
        g2.drawLine(725, 225, 725, 315); //string

        g2.setStroke(new BasicStroke(3));
        g2.drawLine(645, 315, 675, 315);
        g2.drawLine(725, 315, 755, 315); //seat

        g2.setStroke(new BasicStroke(1));
        g2.setColor(Color.BLACK);
    }
}
