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

/**
 *
 * @author Alex
 */
public class Block extends Rectangle {
    
    final private String SPRITEPATH= null;
    private final Dimension size;
    //private int blockX;
    private int blockY;
    private Color blockColor;
    private final int blockSpeed;
    private final int blockSize;
    public boolean dirRight;
    
    public Block(int panelWidth, int panelHeight)
        {
         size = new Dimension (panelWidth, panelHeight);
         
         blockSize = 20;
         blockSpeed = 10;
         dirRight = true;
         this.setBounds(0, size.height-blockSize, blockSize, blockSize);
         
         
         
        }
    public void updateAndDraw (Graphics g){
        this.update();
        
        g.setColor(blockColor);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
    
    public void update(){
        this.fall();
    }
    
    public void fall(){
        int blockBottom = this.y +blockSize;
        
    }
    
    public int moveDown()//move the position of the block in the grid to one lower (y coordinate)
    {
        if (blockY>=1)
        {
            blockY-=blockY;
        }
         return blockY;   
    }
    public boolean detectCollision(Player player)//detect when the block has collided with the person (cat=+, fire=-)
    {
        //to do: initialize int personX& int personY perhaps in a person class?
        boolean collision=false;
        //if (blockY==1&&blockX==player.getXCoord())
        {
            collision=true;
        }
        return collision;
        
    }
}
