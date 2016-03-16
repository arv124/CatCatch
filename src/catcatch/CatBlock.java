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
public class CatBlock extends Rectangle
{
    private int catY;
    private int catSpeed;
    private int catSize;
    private final Dimension size;
    private GamePanel gamePanel;
    private Image catImage;
    
    public CatBlock(int panelHeight, int panelWidth, GamePanel gamePanel){
        
        this.catImage = this.getCatImage();
        this.gamePanel = gamePanel;
        this.catSize=36;
        this.catSpeed=10;
        double f = Math.random();
        int random = (int) (panelHeight * f - 50);
        this.size = new Dimension (panelHeight, panelWidth);
        this.setBounds(random,0,catSpeed,catSize);
    }
    public Image getCatImage(){
        //Source: http://png.clipart.me/graphics/thumbs/212/children-vector-illustration-of-jumping-or-flying-little-cat-or-kitten_212809108.jpg
        //Clear background for cats - Qiu
        Image fireImage = new ImageIcon("res/cat.png").getImage();
        return fireImage;
    }
    
    public void paintComponent(Graphics g){
        move();
        g.drawImage(catImage,this.x,this.y, 36, 32, gamePanel);
    }
    
    public int getCurrentX(){
        return x;
    }
    public int getCurrentY(){
        return y;
    }
    public void move(){
        this.y +=this.catSpeed;
    }
}
