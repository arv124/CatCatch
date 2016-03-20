/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcatch;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Alex
 */
public class CatBlock extends Block
{
    private GamePanel gamePanel;
    private final Image catImage;
    private String catImagePath="res/cat.png";
    //Source: http://png.clipart.me/graphics/thumbs/212/children-vector-illustration-of-jumping-or-flying-little-cat-or-kitten_212809108.jpg
    
    //Refactor: Declared variables as final - Qiu
    
    public CatBlock(int panelHeight, int panelWidth, GamePanel gamePanel){
        super(panelHeight, panelWidth, gamePanel);
        catImage=new ImageIcon(catImagePath).getImage();
    }
    public Image getCatImage(){
        //Clear background for cats - Qiu
        return catImage;
    }
    public void paintComponent(Graphics g){
        move();
        g.drawImage(catImage,this.x,this.y, 36, 32, gamePanel);
    }
    
}
