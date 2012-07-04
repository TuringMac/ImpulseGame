/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package impulsegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Igor_Baranov
 */
public class Canvas extends JPanel {
    public static final int IMG_WIDTH = 400;
    public static final int IMG_HEIGHT = IMG_WIDTH;

    private BufferedImage image = new BufferedImage(IMG_WIDTH, IMG_HEIGHT,
                BufferedImage.TYPE_INT_ARGB);

    public Canvas(){
        super();
    }
    
    public Canvas(BufferedImage img) {
        image=img;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, null);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(IMG_WIDTH, IMG_HEIGHT);
    }

    public void clearScreen() {
        Graphics g = image.getGraphics();
        g.setColor(Color.black);
        g.fillRect(0, 0, image.getWidth(), image.getHeight());
        g.dispose();
        repaint();
    }
    
    public void drawLevel(Level lvl){
        Color tmp;
        image.getGraphics().drawLine(0, 0, 60, 60);
        /*
        for(int i=0; i<lvl.getHeight(); i++){
            for(int j=0; j<lvl.getWidth(); j++){
                switch(lvl.getMap()[i][j]){
                    case 0: g.setColor(Color.WHITE);
                            g.drawRect(j*25, i*25, 25, 25);
                            break;
                    case 1: g.setColor(Color.BLACK);
                            g.drawRect(j*25, i*25, 25, 25);
                            break;
                    case 2: break;
                        
                    default: break;
                }
            }
        }
        * 
        */
    }
}
