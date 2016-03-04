/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcatch;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 *
 * @author Alex
 */
public class CatBlock extends Block
{
    private int blockX;
    private int blockY;
    public Image image;
    
    public CatBlock(int x, int y, Image image)
    {
       super(x, y, image);
    }
    
    @Override
    public void drawBlock(Graphics g){
        
    }
   
}
