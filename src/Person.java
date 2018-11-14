import java.awt.*;

/**
 * Created by Liang Lu on 10/13/17.
 */
public class Person {
    private int x, y;

    public Person(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2){
        g2.setColor(new Color(255, 245, 211));
        g2.fillOval(x,y,24,24);
        g2.setColor(Color.BLACK);
        g2.drawOval(x,y,24,24);
        g2.fillOval(x+6, y+6, 4, 4);
        g2.fillOval(x+14, y+6, 4, 4);
        g2.drawArc(x+6, y+8, 12, 12, 190, 160); //HEAD
        g2.drawLine(x+12, y+24, x+12, y+60); //BODY
        g2.drawLine(x+12, y+38, x+30, y+20);
        g2.drawLine(x+12, y+38, x-6, y+20); //ARMS (+HANDS)
        g2.drawLine(x+12, y+60, x-2, y+76);
        g2.drawLine(x+12, y+60, x+24, y+76); //LEGS (+FEET)
    }

}
