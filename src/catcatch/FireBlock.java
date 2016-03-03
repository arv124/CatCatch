/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcatch;
import java.awt.image.BufferedImage;

/**
 *
 * @author Alex
 */
public class FireBlock extends Block
{
    private int blockX;
    private int blockY;
    
    public FireBlock(int x, int y, BufferedImage image )
    {
       super(x, y, image);
    }
}
