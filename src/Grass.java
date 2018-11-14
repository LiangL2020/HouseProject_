import java.awt.*;

/**
 * Created by student on 10/16/17.
 */
public class Grass {

    private int x, y;

    public Grass(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2){

        int r = (int)(Math.random()*0);
        int g = (int)(Math.random()*42 + 144);
        int b = (int)(Math.random()*0);
        Color randColor = new Color(r, g, b);
        g2.setColor(randColor);
        g2.drawLine(x, y, x, y+10);

        g2.setColor(Color.BLACK);
    }
}
