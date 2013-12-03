package scene;


import java.awt.Graphics;
import javax.swing.ImageIcon;
import main.SceneFrame;
import scene.Scene;

/**
 *
 * @author Group 7
 */
public class  Alcove_27 extends Scene {

/**
 * Creates a new Alcove_27 Object
 */
    public Alcove_27(SceneFrame frame) {
        super("Alcove_27", frame);
        
        //Load background image for this scene
        try {
            image = (new ImageIcon(getClass().getResource("/resources/Alcove_27.jpg"))).getImage();
        } catch (Exception e) {/*How to handle?*/
        }
    
    //Override in case of buttons for this scene
    }
    @Override
    public void initControlButtons() {
        
    }
    
    //Override to update directional buttons for this scene
    @Override
    public void updateDirectionButtons(){
        sceneframe.updateDirections(false, true, false, false);

    }
    
    //Override in case of events for this scene
    @Override
    public void displayEvents() {
    }
    
    //Paint background image for this scene
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            boolean val = g.drawImage(image, 0, 0, 400, 300, this);
            } 
        else {
            // Handler in case background image is missing
            System.out.println("Image not found");
        }        
    }  
    
}