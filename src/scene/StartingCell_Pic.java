package scene;

import Animations.BoxShape;
import Animations.MoveableShape;
import Animations.ShapeIcon;
import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Image;
import javax.swing.ImageIcon;
//import javax.swing.JPanel;
import javax.swing.JButton;
import main.SceneFrame;
import java.awt.Cursor;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Group 7
 */
public class StartingCell_Pic extends Scene {
    
/**
 * Creates a new StartingCell_Pic Object
 */
    public StartingCell_Pic(SceneFrame frame) {
        super("FirstPanel", frame);
        
        try {            
            image = (new ImageIcon(getClass().getResource("/resources/JailCell.JPG"))).getImage();
        } catch (Exception e) {/*How to handle?*/
        }
        
        this.initControlButtons(); //Change to init
        
        sceneframe.updateDirections(true, false, false, false);
        

    }
    
    @Override
    public void initControlButtons(){
  
    }
    
   
    
    
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Graphics2D g2 = (Graphics2D) g;
        if (image != null) {
            boolean val = g.drawImage(image, 0, 0, 400, 300, this);            
        } else {
            System.out.println("Image not found");
        }
               
    }         
    
    @Override
    public void displayEvents(){
        
        
    }
    
    @Override
    public void updateDirectionButtons(){
        sceneframe.updateDirections(true, false, false, false);
    }
        
   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}
