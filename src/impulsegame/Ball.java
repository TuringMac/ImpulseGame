/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package impulsegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JLabel;

/**
 *
 * @author root
 */
public class Ball {
    private Graphics g;
    private Position point;
    private int width = 25;
    private int height = 25;
    private double V = 5.0; // м/с
    private double m = 200.0; // гр.
    private Point force;
    private Arrow arrow;
    
    Ball(Graphics graph){
        g=graph;
        point = new Position();
        force = new Position();
        arrow = new Arrow(this);
    }
    Ball(Graphics graph, Position p){
        g=graph;
        point = new Position(p);
        force = new Position();
        arrow = new Arrow(this);
    }
    public void move(){
        double r = point.distance(arrow.getEnd());
        g.setColor(Color.WHITE);
        draw();
        arrow.draw();
        point.translate(arrow.getNext().getX()/10, arrow.getNext().getY()/10);
        g.setColor(Color.BLACK);
        draw();
        g.setColor(Color.BLUE);
        arrow.draw();
    }
    private void draw(){
        g.drawOval((int)point.getX()-width/2, (int)point.getY()-height/2, width, height);
    }
    public void setForce(Point dir){
        arrow.setEnd(dir);
        force.setLocation(dir);
    }
    public void getData(JLabel x, JLabel y){
        x.setText("x:"+Double.toString(point.getX())+" y:"+Double.toString(point.getY()));
        y.setText("x:"+Double.toString(force.getX())+" y:"+Double.toString(force.getY()));
    }
    public Graphics getGraphics(){
        return g;
    }
    public Point getPos(){
        return point;
    }
}
