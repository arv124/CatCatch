/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcatch;

/**
 *
 * @author Alex
 */
public class Block {
    final private int HEIGHT = 0; 
    final private int WIDTH = 0;
    final private String SPRITEPATH= null;
    private int blockX;
    private int blockY;
    
    public Block(int x, int y)
        {
         this.blockX=x;
         this.blockY=y;
        }
    public void moveDown()//move the position of the block in the grid to one lower (y coordinate)
    {
        blockY-=blockY;
    }
    public boolean detectCollision()//detect when the block has collided with the person (cat=+, fire=-)
    {
        //to do: initialize int personX& int personY perhaps in a person class?
        boolean collision=false;
        if (blockX==personX&&blockY==personY)
        {
            collision=true;
        }
        
        
    }
}
