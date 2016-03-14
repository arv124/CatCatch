package catcatch;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.TimerTask;
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
    static int timerCount;
    private Player player;
    private ArrayList<CatBlock> catBlocks;
    private ArrayList<FireBlock> fireBlocks;
    private final JPanel gui = new JPanel(new GridLayout(2,1));
    private final JPanel gamePanel = new JPanel();
    private JLabel scoreLabel;
    private JLabel livesLabel;
    public Controller theController;

    private final Image background = (new ImageIcon("src/res/burning_building.jpg").getImage());
    private final Image catImage = (new ImageIcon("src/res/cat.jpg").getImage());
    private final Image fireImage = (new ImageIcon("src/res/fire.jpg").getImage());
    private final Image playerImage = (new ImageIcon("src/res/fireman.png").getImage());
    
    
    public GamePanel(Controller theController){
        super();
        this.addKeyListener(this);
        this.theController = theController;
        GamePanel.timerCount=0;
        initcomponents();
    }
    
    public void initcomponents(){
        
        //
        player = new Player("P1",3,0);
        scoreLabel = new JLabel("Your Score: "+ player.getScore());
        gamePanel.add(scoreLabel);
        livesLabel = new JLabel("Your Lives: "+ player.getLives());
        gamePanel.add(livesLabel);
        gamePanel.setSize(400, 400);
        //this.setLayout(new GridLayout(1,1));
        gamePanel.setBorder(new LineBorder(Color.BLACK));
        this.add(gamePanel);
        catBlocks = new ArrayList<>();
        fireBlocks = new ArrayList<>();
        
        gameTimer = new Timer(100, this);
        gameTimer.start();
        blockTimer = new Timer(1000, this);
        blockTimer.start();
        setFocusable(true);
        requestFocusInWindow();
        //gui.add(gamePanel);
        
        
        FireBlock.blockImages.add("res/fireBall.png");
       
        
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        
        //sets the object to the source of whatever event occurs
        Object obj = event.getSource();
        this.addKeyListener(this);
        if(obj == gameTimer)
        {
            //updates panel as per gameTimer
                this.repaint();
            
            if(player.getLives() == 0){
                gameTimer.stop();
                blockTimer.stop();
                theController.switchToScores();
            }
        } 
        else if(obj == blockTimer)
        {
            
            //Generates and adds block objects to their respective arrays  
            CatBlock cat = new CatBlock(400,400,this);
            FireBlock fire1 = new FireBlock(400,400,this);
            FireBlock fire2 = new FireBlock(400,400,this);
            catBlocks.add(cat);
            fireBlocks.add(fire1);
            fireBlocks.add(fire2);
            
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
        g.clearRect(0,0, 400, 400);
        
        //SOURCE: https://i.ytimg.com/vi/jcO2BD2Ma1c/maxresdefault.jpg
        //Intersect methods won't take in an object that doesn't extend rectangle
        
        Image background = new ImageIcon("res/burningBuilding.jpg").getImage();
        g.drawImage(background, 0, 0, 400, 400, this.gamePanel);
        player.paintComponent(g);
        
        for(int i = 0; i<catBlocks.size();i++)
        {
            
            catBlocks.get(i).paintComponent(g);
            
            //THIS NEEDS WORK
            
            if(player.intersects(catBlocks.get(i)))
            {
                player.increaseScore();
                scoreLabel.setText(("Your Score: "+player.getScore()));
                catBlocks.remove(i);
            }
            
        }
        for(int i = 0; i<fireBlocks.size(); i++)
        {
            
            fireBlocks.get(i).paintComponent(g);
            
            //THIS NEEDS WORK
            
            if(player.intersects(fireBlocks.get(i)))
            {
                player.decrementLives();
                livesLabel.setText("Your Lives: "+ player.getLives());
                fireBlocks.remove(i);
            }
            
        }
        Toolkit.getDefaultToolkit().sync();
         
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
    
    public class keyListener extends KeyAdapter{
        public void KeyReleased(KeyEvent e){
            player.keyReleased(e);
        }
        
        public void KeyPressed(KeyEvent e){
            player.keyPressed(e);
        }
    }
    private class ScheduleTask extends TimerTask{
        public void run(){
            player.move();
            repaint();
        }
    }
        
    
}