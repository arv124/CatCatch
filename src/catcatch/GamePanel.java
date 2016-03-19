package catcatch;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjrya
 */
public class GamePanel extends JPanel implements ActionListener, KeyListener{
    
    private Timer gameTimer;
    private Timer blockTimer;
    private Player player;
    private ArrayList<CatBlock> catBlocks;
    private ArrayList<FireBlock> fireBlocks;
    private final JPanel gamePanel = new JPanel();
    private JLabel scoreLabel;
    private JLabel livesLabel;
    public Controller theController;
    private final int panelHeight = 380 ;
    private final int panelWidth =400;
    private boolean ingame;
    static int timerCount;
    // Refactor: unused variables removed by Qiu
    
    // http://stackoverflow.com/questions/14068956/placing-a-transparent-jpanel-on-top-of-another-jpanel-not-working
    //transparent panel
    
    public GamePanel(Controller theController){
        super();
        this.theController = theController;
        GamePanel.timerCount =0;
        ingame=true;
        initcomponents();
    }
    
    public void initcomponents(){
      
        //Refactor: KeyListener added by Qiu
        
        gamePanel.setSize(400, 400);
        gamePanel.setBorder(new LineBorder(Color.BLACK));
        
        player = new Player("P1",0);
        scoreLabel = new JLabel("Your Score: "+ player.getScore());
        gamePanel.add(scoreLabel);
        
        livesLabel = new JLabel("Your Lives: "+ player.getLives());
        gamePanel.add(livesLabel);
        
        this.add(gamePanel);
        this.addKeyListener(this);
        
        catBlocks = new ArrayList<>();
        fireBlocks = new ArrayList<>();
        gameTimer = new Timer(70, this);
        gameTimer.start();
        blockTimer = new Timer(1000, this);
        blockTimer.start();
        
        setFocusable(true);
        requestFocusInWindow();

        //Refactor: unsed Image removed by Qiu

    }
    
    
    @Override
    public void actionPerformed(ActionEvent event){
        
        //sets the object to the source of whatever event occurs
        Object obj = event.getSource();
        
        if(obj == gameTimer)
        {
            //updates panel as per gameTimer
                this.repaint();
                player.setLocation(player.currentX, player.getYCoord());
            
            if(player.getLives() == 0){
                gameTimer.stop();
                blockTimer.stop();
                theController.switchToScores();
            }
        } 
        else if(obj == blockTimer)
        {
            
            //Generates and adds block objects to their respective arrays  
            
            //Refactor: replace magic number with symbolic constant
            CatBlock cat = new CatBlock(panelWidth,panelHeight,this);
            FireBlock fire1 = new FireBlock(panelWidth,panelHeight,this);
            FireBlock fire2 = new FireBlock(panelWidth,panelHeight,this);
            
            catBlocks.add(cat);
            fireBlocks.add(fire1);
            fireBlocks.add(fire2);
            
            
            for(int i = 0; i<catBlocks.size(); i++){
            
                catBlocks.get(i).move();
                
            }
            
            for(int i = 0; i<fireBlocks.size(); i++){
            
                fireBlocks.get(i).move();
                
            }
            increaseChallenge();
        }
        
    }
    public void increaseChallenge(){
           
        if(player.getScore()>=100){
            this.repaint();
            CatBlock cat = new CatBlock(panelWidth,panelHeight,this);
            FireBlock fire1 = new FireBlock(panelWidth,panelHeight,this);
            FireBlock fire2 = new FireBlock(panelWidth,panelHeight,this);
            FireBlock fire3 = new FireBlock(panelWidth,panelHeight,this);
                catBlocks.add(cat);
                fireBlocks.add(fire1);
                fireBlocks.add(fire2);
                fireBlocks.add(fire3);
                for(int i = 0; i<catBlocks.size(); i++){
            
                catBlocks.get(i).move();
                
            }
            
            for(int i = 0; i<fireBlocks.size(); i++){
            
                fireBlocks.get(i).move();
                
            }
            }
    }

     @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.clearRect(0,0, panelWidth, panelHeight);
        drawBackground(g);
        player.paintComponent(g);
        drawCat(g);
        catCollison();
        drawFire(g);
        fireCollision();
        Toolkit.getDefaultToolkit().sync();
    }  
    
    //  Refactor: extract code from paintComponents -Qiu
    
    public void drawBackground(Graphics g){
        //SOURCE: http://pixeljoint.com/files/icons/full/trampolingame.gif
   
        Image background = new ImageIcon("res/BBuilding.gif").getImage();
        g.drawImage(background, 0, 0, panelWidth, panelHeight, this.gamePanel);
    }
    public void drawCat(Graphics g){
        for(int i = 0; i<catBlocks.size(); i++){
            catBlocks.get(i).paintComponent(g);
        }
    }
    public void catCollison(){
        for(int i = 0; i<catBlocks.size();i++){
            if(player.intersects(catBlocks.get(i))){
                player.increaseScore();
                scoreLabel.setText("Your Score: " + player.getScore());
                catBlocks.remove(i);
            }
        }
    }
    public void drawFire(Graphics g){
        for(int i = 0; i<fireBlocks.size(); i++){
            fireBlocks.get(i).paintComponent(g);
        }
    }
    public void fireCollision(){
        for(int i = 0; i<fireBlocks.size(); i++){
            if(player.intersects(fireBlocks.get(i)))
                {
                    player.decrementLives();
                    livesLabel.setText("Your Lives: "+ player.getLives());
                    fireBlocks.remove(i);
            }
        }
    }
        @Override
    public void keyTyped(KeyEvent event){  
            }
        
        @Override 
    public void keyPressed(KeyEvent event){
            player.keyPressed(event);
        }
        
        @Override
    public void keyReleased(KeyEvent event){
            player.keyReleased(event);
        }
    
    public Player getPlayer(){
        return this.player;
    }
    
    public void setInGame(){
        this.ingame = false;
    }
    public boolean getInGame (){
        return ingame = true;
    }
// Refactor: unused and commented methods removed by Qiu
        
    
}
