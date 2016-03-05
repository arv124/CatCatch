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
        this.catSize=32;
        this.catSpeed=10;
        double f = Math.random();
        int random = (int) (panelHeight * f - 50);
        this.size = new Dimension (panelHeight, panelWidth);
        this.setBounds(random,400,catSize,catSize);
    }
    public Image getCatImage(){
        Image fireImage = new ImageIcon("res/cat.jpg").getImage();
        return fireImage;
    }
    
    public void paintComponent(Graphics g){
        move();
        //getFireImage();
        g.drawImage(catImage,this.x,this.y, 32, 32, gamePanel);
    }
    
    public int getCurrentX(){
        return x;
    }
    public int getCurrentY(){
        return y;
    }
    public void move(){
        this.y -=this.catSpeed;
    }
}
