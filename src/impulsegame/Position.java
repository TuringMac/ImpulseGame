/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package impulsegame;

import java.awt.Point;

/**
 *
 * @author Igor_Baranov
 */
public class Position extends Point{
    public double x;
    public double y;
    
    Position(){
        super();
    }
    
    Position(Position p){
        this.x=p.getX();
        this.y=p.getY();
    }
    
    Position(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public void translate(double dx, double dy){
        this.x+=dx;
        this.y+=dy;
    }
    
    @Override
    public double getX(){
        return this.x;
    }
    
    @Override
    public double getY(){
        return this.y;
    }
}
