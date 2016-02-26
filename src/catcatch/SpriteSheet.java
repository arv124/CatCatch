/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package catcatch;
import java.awt.image.BufferedImage;
/**
 *
 * @author Laura
 */
public class SpriteSheet {
    private BufferedImage sheet;
    
    public SpriteSheet(BufferedImage sheet)
    {
        this.sheet=sheet;
    }
    
    //this metod returns whatever cropped part of the spritesheet we want
    public BufferedImage crop(int col, int row, int w, int h)
    {
        return sheet.getSubimage(col*8, row*8,w,h);//"*8" bc each image is 8 pixels wide and 8 pixels tall
        //maybe in the next Iteration we make taller images?
    }
}
