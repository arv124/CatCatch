/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcatch;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

/**
 *
 * @author Alex
 */
public class Player extends Rectangle {
    
    private GamePanel gamePanel;
    private int lives= 3; //this give live a default start value
    private int score= 0; // same as lives, just a default
    private int increment= 50; // added becuase we might now want the score to just increase by 1
    private String name;
    private final Dimension panelDimension;
    private final int playerSize;
    private final int speed;
    private int currentX;
    private final int CURRENTY = 1;
    private final BufferedImage playerImage = null;
    private final int panelWidth = 400;
    private final int panelHeight = 400;
    
    public Player(String name, int lives, int score)
    {
        this.name = name;
        this.lives = lives;
        this.score = score;
        this.playerSize = 40;
        this.speed = 10;
        this.panelDimension = new Dimension(panelWidth, panelHeight);
        this.setBounds(0, 40, panelWidth, panelHeight);
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
    
    /*
    public void move(){
        if(this.x >= panelWidth-playerSize){
            this.x -=speed;
        } else if(x<=0){
            this.x += speed;
        } else{
            this.x+= currentX;
        }
    }
    */
    
    
    public void paintComponent(Graphics g)
    {
        //move();
        //g.setColor(Color.red);
        g.drawImage(playerImage, x, y, width, height, gamePanel);
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
    
}
