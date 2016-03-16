/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcatch;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * @author Alex
 */
public class Block extends Rectangle {
  
    private final int Speed;
    private final int Size;
    private final Dimension size;
    private GamePanel gamePanel;
    //Refactor: Declared variables as final - Qiu
    
    //Refactor: Inline class. similar methods in Cat& fireblock now moved to Block. Laura L.
    //also cat& fireblock now extend Block,they did not . Laura L.
    public Block(int panelHeight, int panelWidth, GamePanel gamePanel){
        
        //this.Image = this.getImage();
        this.gamePanel = gamePanel;
        this.Size=36;
        this.Speed=10;
        double f = Math.random();
        int random = (int) (panelHeight * f - 50);
        this.size = new Dimension (panelHeight, panelWidth);
        this.setBounds(random,0,Speed,Size);
    }
    
    public int getCurrentX(){
        return x;
    }
    public int getCurrentY(){
        return y;
    }
    public void move(){
        this.y +=this.Speed;
    }
}
