import java.awt.*;

/**
 * Created by Liang Lu on 10/16/17.
 */
public class Clouds {
    private int x, y;

    public Clouds(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2){
        g2.setColor(Color.WHITE);
        g2.fillOval(x, y, (int)(Math.random() * 25 + 175), (int)(Math.random() * 5 + 40));

        g2.setColor(Color.BLACK);
    }
}
