import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by catherinehuang on 3/30/15.
 */
public class TargetObject {
    private String targetName;
    private int xPos, yPos, startP, endYPos, moveSpeed, targetScore;
    private Message message;
    private boolean isHit, isMoving;
    private BufferedImage objImage;

    public TargetObject(String name, String message, String imgName) {
        this.targetName = name;
        this.message = new Message(message);

        //access image file
        try{
            objImage = ImageIO.read(new File("./images/" + imgName));
        }catch(Exception e){
            System.out.println("Image not found.");
        }
    }

}
