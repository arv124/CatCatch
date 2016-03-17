package catcatch;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Alex
 */
public class Player extends Rectangle {
    
    private GamePanel gamePanel;
    private int playerHeight = 34;
    private int playerWidth = 39;
    private int lives; //this give live a default start value
    private int score= 0; // same as lives, just a default
    private int increment= 50; // added becuase we might now want the score to just increase by 1
    private String name;
    private final Dimension panelDimension;
    private final int playerSize;
    private final int speed = 10;
    public int currentX = 180;
    private final int CURRENTY = 330;
    //SOURCE: http://orig11.deviantart.net/505b/f/2013/362/f/6/fire_fighter_cleave_by_norrec18-d6zu5dp.gif
    //Cleared background for player -Qiu
    private final int panelWidth = 400;
    private final int panelHeight = 400;
    private Image playerImage;
    
    //Cleaned up "Magic Numbers" for player x, y, height, and width
    //Kyle Ryan
    
    
    public Player(String name, int score)
    {
        this.name = name;
        this.lives = 5;
        this.score = score;
        this.playerSize = 40;
        this.panelDimension = new Dimension(panelWidth, panelHeight);
        this.setBounds(currentX, CURRENTY, playerHeight, playerHeight);
    }
    
    
    public void keyPressed(KeyEvent e)
    {
       if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            moveLeft();
        } 
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            moveRight();
        } 
    }
    
    
    public void keyReleased(KeyEvent e)
    {
        
    }
    
    public void moveLeft()
    {
        if(this.currentX != 0){
            this.currentX = this.currentX - speed;
        }  
        
    }
    
    public void moveRight()
    {
        if(this.currentX != panelWidth-playerSize){
            this.currentX = this.currentX + speed;
        }
        
        System.out.println(currentX);
        
    }
    
    //Cleaned up "Magic Numbers" for player x, y, height, and width
    //Kyle Ryan
    
    public void paintComponent(Graphics g)
    {
        Image playerImage = new ImageIcon("res/fireman.png").getImage();
        g.drawImage(playerImage, currentX, CURRENTY, playerWidth, playerHeight, gamePanel);
    }
    
    
    public void decrementLives()
        {
            lives = lives-1;
        }
    public void increaseScore()
        {
            score = score + increment;
        }
    public int getScore()
        {
            return score;
        }
    public int getLives()
        {
            return lives;
        }
    public String getName()
        {
            return name;
        }
    public int getXCoord()
        {
           return this.currentX;
        }
    public int getYCoord()
        {
            return this.CURRENTY;
        }
    public void setCurrentX(int currentX){
        this.x+=currentX;
    }
}
