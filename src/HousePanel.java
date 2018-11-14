import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Liang Lu on 10/2/17.
 */

public class HousePanel extends JPanel{

    public HousePanel(int width, int height){
        setSize(width,height);

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX() + ", " + e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }


    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(new Color(73, 184, 97));
        g2.fillRect(0, 245, getWidth(), getHeight() - 245); //GrassBase

        for (int i = 0; i < 10000; i++) {
            Grass grass = new Grass ((int)(Math.random()*getWidth()),(int)(Math.random()*getHeight() + 245));
            grass.draw(g2);
        }

        g2.setColor(Color.BLUE);
        g2.fillOval(900, 300, 600, 385); //Pond

        g2.setColor(Color.LIGHT_GRAY);
        g2.fillRect(205, 290, 27, 50);
        g2.fillRect(232, 313, 70, 27); //pathway to door

        g2.setColor(Color.DARK_GRAY);
        int[]xs = {300, 400, 425, 275};
        int[]ys = {300, 300, getHeight(), getHeight()};
        g2.fillPolygon(xs, ys, 4); //Pathway

        g2.fillRect(0, getHeight() - 100, getWidth(), getHeight() - 100);

        House myHouse = new House(300, 300);
        myHouse.draw(g2);

        Person liang = new Person(200, 300);
        liang.draw(g2);

        Person randomPerson1 = new Person ((int)(Math.random()*901), (int)(Math.random()*724 + 300));
        randomPerson1.draw(g2);

        Person randomPerson2 = new Person ((int)(Math.random()*901), (int)(Math.random()*724 + 300));
        randomPerson2.draw(g2);

        Person randomPerson3 = new Person ((int)(Math.random()*901), (int)(Math.random()*724 + 300));
        randomPerson3.draw(g2);


        for (int i = 0; i < 5; i++) {
            Clouds cloud = new Clouds ((int)(Math.random()*(getWidth() - 500) + 500), (int)(Math.random()*150));
            cloud.draw(g2);
        }

        Swing swing = new Swing(300, 600);
        swing.draw(g2);

    }

}
