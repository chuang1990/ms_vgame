import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Stage is the main panel for the game
 * It contains the background image of the game where all other element will be lay
 * on top of it.
 * Created by catherinehuang on 3/29/15.
 */
public class Stage {
    private String bgName;
    private BufferedImage bgImage;
    private int x,y;

    /**
     * Constructor of Stage
     */
    public Stage(String name, String fileName){
        this.bgName = name;
        //set the x and y coordinate at origin
        this.x = 0;
        this.y = 0;

        //locate and load the image
        try{
            bgImage = ImageIO.read(new File("./images/" + fileName));
        }catch(Exception ex){
            System.out.println("Image not found");
        }

    }//end of constructor

    //Getter and setters

    /**
     * Set the x coordinate of the image
     * @param x int
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Set the y coordinate of the background
     * @param y int
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * get the x-coordinate
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     * get the y-coordinate
     * @return
     */
    public int getY() {
        return y;
    }
    
    public String getName(){
        return bgName;
    }
    


    public void draw(Graphics2D g) {
        //draw the stage
        g.drawImage(bgImage, null, x, y);
    }





}//End of Stage class
