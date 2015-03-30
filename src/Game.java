import javax.swing.*;
import java.awt.*;

/**
 * Created by catherinehuang on 3/30/15.
 */
public class Game extends JPanel{
    private Stage bg;

    public Game(int width, int height) {
        setSize(width,height);

        bg = new Stage("background", "background_mosaic.jpg");
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        //paint the background image
        bg.draw(g2);
    }

}
