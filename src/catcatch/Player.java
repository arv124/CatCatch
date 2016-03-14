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
    private int startX = 180;
    private int startY = 300;
    private int playerHeight = 40;
    private int playerWidth = 40;
    private int lives= 3; //this give live a default start value
    private int score= 0; // same as lives, just a default
    private int increment= 50; // added becuase we might now want the score to just increase by 1
    private String name;
    private final Dimension panelDimension;
    private final int playerSize;
    private final int speed;
    private int currentX;
    private final int CURRENTY = 1;
    //SOURCE: http://orig11.deviantart.net/505b/f/2013/362/f/6/fire_fighter_cleave_by_norrec18-d6zu5dp.gif
    private final int panelWidth = 400;
    private final int panelHeight = 400;
    private Image playerImage;
    
    //Cleaned up "Magic Numbers" for player x, y, height, and width
    //Kyle Ryan
    public Player(String name, int lives, int score)
    {
        this.name = name;
        this.lives = lives;
        this.score = score;
        this.playerSize = 40;
        this.speed = 10;
        this.panelDimension = new Dimension(panelWidth, panelHeight);
        this.setBounds(startX, startY, playerHeight, playerHeight);
    }
    
    
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            this.currentX = -speed;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            this.currentX = speed;
        }
    }
    
    
    public void keyReleased(KeyEvent e)
    {
        this.currentX = 0;
    }
    
    
    public void move()
    {
        if(this.x >= panelWidth-playerSize){
            this.x -=speed;
        } else if(x<=0){
            this.x += speed;
        } else{
            this.x+= currentX;
        }
    }
    
    //Cleaned up "Magic Numbers" for player x, y, height, and width
    //Kyle Ryan
    
    public void paintComponent(Graphics g)
    {
        move();
        Image playerImage = new ImageIcon("res/fireman.png").getImage();
        g.drawImage(playerImage, startX, startY, playerWidth, playerHeight, gamePanel);
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
    public void setCurrentX(int currentX){
        this.x+=currentX;
    }
}