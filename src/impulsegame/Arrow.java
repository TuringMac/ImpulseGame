/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package impulsegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author root
 */
public class Arrow {
    private Point begin;
    private Point end;
    private Point vector;
    private Graphics g;
    
    Arrow(Ball ball){
        g=ball.getGraphics();
        begin = ball.getPos();
        end = new Point(ball.getPos());
        vector = new Point();
    }
    
    public void draw(){
        g.drawLine(
                (int)begin.getX(),
                (int)begin.getY(),
                (int)(begin.getX() + vector.getX()),
                (int)(begin.getY() + vector.getY())
                );
    }
    
    public void setEnd(Point p){
        g.setColor(Color.WHITE);
        draw();
        end.setLocation(p);
        vector.setLocation(end.getX()-begin.getX(), end.getY()-begin.getY());
        g.setColor(Color.BLUE);
        draw();
    }
    
    public Point getEnd(){
        return end;
    }
    
    public Point getNext(){
        return vector;
    }
}
