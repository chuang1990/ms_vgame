import javax.swing.*;
import java.awt.*;

/**
 * Created by catherinehuang on 3/30/15.
 */
public class GUI extends JFrame{

    private JPanel mainPanel;
    private Game gamePanel;
    private Dimension d = new Dimension(1024,600);


    public GUI() {
        setupFrame();
    }

    public void setupFrame() {
        setTitle("Virus Shooting Game");
        gamePanel = new Game(1000,500);
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setPreferredSize(d);

        mainPanel.add(gamePanel, BorderLayout.CENTER);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(mainPanel);
        this.pack();
    }

    public static void main(String[] args) {
       GUI gui = new GUI();
        gui.pack();
    }
}
