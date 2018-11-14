import java.awt.*;

/**
 * Created by Liang Lu on 10/2/17.
 */

//Put your name in this comment.

public class House {
    private int x, y;

    public House(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2){

        g2.setColor(new Color(223, 217, 194));
        g2.fillRect(125, 100, 300, 200); //base

        g2.setColor(new Color(70, 42,0));
        int[]xs = {115, 275, 435};
        int[]ys = {100, 15, 100};
        g2.fillPolygon(xs,ys,3); //roof

        g2.setColor(Color.WHITE);
        g2.fillRect(300, 225, 100, 75); //garage

        g2.setColor(Color.BLACK);
        g2.drawLine(300, 280, 400, 280);
        g2.drawLine(300, 260, 400, 260);
        g2.drawLine(300, 240, 400, 240);
        g2.drawLine(300, 225, 400, 225);
        g2.drawLine(300, 300, 300, 225);
        g2.drawLine(400, 300, 400, 225); //garage lines

        g2.setColor(new Color(152, 185, 255));
        g2.fillRect(150, 125, 70, 70);
        g2.fillRect(320, 125, 70, 70);
        g2.setColor(Color.BLACK);
        g2.drawLine(150, 160, 220, 160);
        g2.drawLine(185, 125, 185, 195);
        g2.drawLine(320, 160, 390, 160);
        g2.drawLine(355, 125, 355, 195); //window

        g2.setColor(new Color(139, 169, 233));
        g2.fillRect(245, 125, 50, 70);
        g2.setColor(Color.BLACK);
        g2.drawLine(245, 160, 295, 160); //mid window

        g2.setColor(new Color(112, 126, 117));
        g2.fillRect(205, 245, 27, 55);
        g2.setColor(Color.BLACK);
        g2.fillOval(225, 270, 3, 3); //door

        g2.setColor(new Color(82, 25, 0));
        int[]as = {140, 175, 175, 140};
        int[]bs = {10, 10, 70, 88};
        g2.fillPolygon(as,bs,4); //chimney

        g2.setColor(Color.BLACK);
    }


}
