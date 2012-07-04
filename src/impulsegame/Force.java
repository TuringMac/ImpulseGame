/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package impulsegame;

import java.awt.Point;

/**
 *
 * @author root
 */
public class Force {
    private Point dir;
    
    public void setPoint(Point point){
        dir=point;
    }
    
    public Point getPoint(){
        return dir;
    }
}
