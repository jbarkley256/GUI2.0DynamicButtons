/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scene;


import main.SceneFrame;
import java.awt.Cursor;
import Animations.BoxShape;
import Animations.MoveableShape;
import Animations.ShapeIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.util.Observable;

/**
 *
 * @author Group 7
 */
public class ForestPanel extends Scene {
    
    Timer t;
    Boolean eventOn;
    int x, y;
    
    private final int DELAY = 50;
/**
 * Creates a new ForestScene Object
 */
    public ForestPanel(SceneFrame frame) {
        super("SecondPanel", frame);        
                eventOn = false; 
                          
        try {
            //BufferedImage origImage = ImageIO.read(getClass().getResource("/resources/ForestPath.jpg"));
           //int type = origImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : origImage.getType();
            //image = super.resizeImage(origImage, type);
            //ImageIO.write(resizedimage, "jpg", new File("/resources/ForestPath2.jpg"));
            image = (new ImageIcon(getClass().getResource("/resources/ForestPath.jpg"))).getImage();
        } catch (Exception e) {/*How to handle?*/
        }
        
        this.initControlButtons(); //Change to init
        
    }
    
    @Override
    public void initControlButtons(){
       this.setLayout(null);
       
       JButton doorButton = new JButton("");
       doorButton.setBounds(240, 95, 105, 105);
       doorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doorButtonActionPerformed(evt);
            }
        });
       doorButton.setOpaque(false);
       doorButton.setContentAreaFilled(false);
       doorButton.setBorderPainted(false);
       doorButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       this.add(doorButton);
       
          JButton cityButton = new JButton("");
       cityButton.setBounds(25, 95, 105, 105);
       cityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityButtonActionPerformed(evt);
            }
        });
       cityButton.setOpaque(false);
       cityButton.setContentAreaFilled(false);
       cityButton.setBorderPainted(false);
       cityButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       this.add(cityButton);
       
         keyButton = new JButton("");
       keyButton.setBounds(100, 210, 80, 50);
       keyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/key.png")));
       keyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyButtonActionPerformed(evt);
            }
        });
       keyButton.setOpaque(true);
       keyButton.setContentAreaFilled(false);
       keyButton.setBorderPainted(false);
       keyButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       this.add(keyButton);
    }
    
    
    private void doorButtonActionPerformed(java.awt.event.ActionEvent evt) {                                        
              System.out.println("Travelling to the ominous Door");
              sceneframe.displayScene(1);
    } 
    
    private void cityButtonActionPerformed(java.awt.event.ActionEvent evt) {                                        
              System.out.println("Travelling to the ominous Door");
              sceneframe.displayScene(1);
    }
    
    private void keyButtonActionPerformed (java.awt.event.ActionEvent evt) {                                        
              System.out.println("Pick up key");
              keyButton.setVisible(false);
              sceneframe.jButton3.setEnabled(true);
              
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
          if(eventOn == true){
            return;
        }
       final MoveableShape shape
       = new BoxShape(0, 0, CAR_WIDTH);
       
       //final ImageIcon star = new ImageIcon("/resources/bird.png");

       
      ShapeIcon icon = new ShapeIcon(shape,
            ICON_WIDTH, ICON_HEIGHT);
        final JLabel label = new JLabel(icon);
        label.setBounds(110, 90, 150, 200);
        this.add(label);
              final int DELAY = 100;
     
      // Milliseconds between timer ticks
       t = new Timer(DELAY, new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {               
               shape.translate(1, 0);
               label.repaint();
            }
         });
      t.start();
      eventOn = true;
    }
    

//*******Below is test code************
   
    
   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
  private javax.swing.JButton keyButton;
        
}