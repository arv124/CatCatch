/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcatch;

/**
 *
 * @author Alex
 */
public class Player {
    
    
    private int lives= 3; //this give live a default start value
    private int score= 0; // same as lives, just a default
    private int increment= 1; // added becuase we might now want the score to just increase by 1
    private String name;
    
    public Player()
    {
        
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
    
}
