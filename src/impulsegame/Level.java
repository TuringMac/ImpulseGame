/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package impulsegame;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author root
 */
public class Level {
    private int width = 18;
    private int height = 16;
    private JPanel terrain[][];
    private int map[][]={
                         {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                         {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                        };
    public Level(JPanel terrain[][]){
        this.terrain=terrain;
    }
    
    public Level(JPanel mainBoard){
        mainBoard.setPreferredSize(new Dimension(width*25, height*25));
        terrain = new JPanel[height][width];
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++)
            {
                terrain[i][j] = new JPanel();
                mainBoard.add(terrain[i][j]);
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(terrain[i][j]);
                terrain[i][j].setLayout(layout);
            }
        }
    }
    
    public JPanel[][] getTerrain(){
        return terrain;
    }
    /*
     * Прорисовка уровня игры
     */
    public void buildLevel(){
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                terrain[i][j].setBounds(j*25, i*25, 25, 25);
                terrain[i][j].setVisible(true);
                
                switch(map[i][j]){
                    case 0: terrain[i][j].setBackground(Color.WHITE);
                            break;
                    case 1: terrain[i][j].setBackground(Color.BLACK);
                            break;
                    case 2: break;
                        
                    default: break;
                }
            }
        }
    }
}
