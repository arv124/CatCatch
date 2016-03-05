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
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Alex
 */
public class FireBlock extends Rectangle{
    private int fireY;
    private int fireSpeed;
    private int fireSize;
    private final Dimension size;
    private GamePanel gamePanel;
    private Image fireImage;
    
    public static ArrayList<String> blockImages = new ArrayList<String>();
    
    public FireBlock(int panelHeight, int panelWidth, GamePanel gamePanel){
        
        this.fireImage = this.getFireImage();
        this.gamePanel = gamePanel;
        this.fireSize=32;
        this.fireSpeed=10;
        double f = Math.random();
        int random = (int) (panelHeight * f - 50);
        this.size = new Dimension (panelHeight, panelWidth);
        this.setBounds(random,400,fireSpeed,fireSize);
    }
    public Image getFireImage(){
        Image fireImage = new ImageIcon("res/fireBall.png").getImage();
        return fireImage;
    }
    
    public void paintComponent(Graphics g){
        move();
        g.drawImage(fireImage,this.x,this.y, 32, 32, gamePanel);
    }
    
    public int getCurrentX(){
        return x;
    }
    public int getCurrentY(){
        return y;
    }
    public void move(){
        this.y +=this.fireSpeed;
    }
}
