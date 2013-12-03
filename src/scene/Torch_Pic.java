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
public class Torch_Pic extends Scene {
    
/**
 * Creates a new Torch_Pic Object
 */
    public Torch_Pic(SceneFrame frame) {
        super("TorchPic", frame);
        sceneframe.setTextArea("First Time Viewing This\n Scene");
        
        try {

            image = (new ImageIcon(getClass().getResource("/resources/TorchPic.JPG"))).getImage();
        } catch (Exception e) {/*How to handle?*/
        }
        
        this.initControlButtons(); //Change to init
        

    }
    
    @Override
    public void initControlButtons(){
       this.setLayout(null);

       
       TorchButton = new JButton("");
       TorchButton.setBounds(165, 70, 80, 130);
       TorchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/torch.gif")));
       TorchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TorchButtonActionPerformed(evt);
            }
        });
       TorchButton.setOpaque(true);
       TorchButton.setContentAreaFilled(false);
       TorchButton.setBorderPainted(false);
       TorchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       this.add(TorchButton);
    }
    
    
    
    private void TorchButtonActionPerformed (java.awt.event.ActionEvent evt) {                                        
              System.out.println("Pick up key");
              TorchButton.setVisible(false);
              sceneframe.torchButton.setEnabled(true);
              sceneframe.torchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/torch.gif")));
              
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
        sceneframe.updateDirections(false, true, false, false);

    }
        
   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
   private javax.swing.JButton TorchButton;
}