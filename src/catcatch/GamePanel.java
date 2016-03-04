package catcatch;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private Player player = new Player("", 3, 0);
    private ArrayList<CatBlock> catBlocks;
    private ArrayList<FireBlock> fireBlocks;
    private Boolean gameStatus =false;
    private final JPanel gui = new JPanel(new GridLayout(2,1));
    private final JPanel gamePanel = new JPanel();
    private JLabel scoreLabel;
    public Controller theController;

    private final Image background = (new ImageIcon("src/res/burning_building.jpg").getImage());
    private final Image catImage = (new ImageIcon("src/res/cat.jpg").getImage());
    private final Image fireImage = (new ImageIcon("src/res/fire.jpg").getImage());
    private final Image playerImage = (new ImageIcon("src\\res\\fireman.png").getImage());
    
    public GamePanel(Controller theController){
        super();
        this.addKeyListener(this);
        this.theController = theController;
        initcomponents();
    }
    
    public void initcomponents(){
        scoreLabel = new JLabel("Your Score: "+ player.getScore());
        gamePanel.add(scoreLabel);
        gamePanel.setSize(400, 400);
        //this.setLayout(new GridLayout(1,1));
        gamePanel.setBorder(new LineBorder(Color.BLACK));
        
        
        catBlocks = new ArrayList<>();
        fireBlocks = new ArrayList<>();
        
        gameTimer = new Timer(100, this);
        blockTimer = new Timer(500, this);
        gameTimer.start();
        blockTimer.start();
        
        setFocusable(true);
        //gui.add(gamePanel);
        this.add(gamePanel);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        
        //sets the object to the source of whatever event occurs
        Object obj = event.getSource();
        
        if(obj == gameTimer)
        {
            //updates panel as per gameTimer
                this.repaint();
            
//            if(player.getLives() == 0){
//                gameTimer.stop();
//                blockTimer.stop();
//                theController.switchToScores();
//            }
        } 
        else if(obj == blockTimer)
        {
            //adds block objects to their respective arrays
            //still need images for each object
            
//            catBlocks.add(new CatBlock(400,400, catImage));
//            fireBlocks.add(new FireBlock(400,400, fireImage));
//            fireBlocks.add(new FireBlock(400,400, fireImage));
            
        }
        
    }
    
     @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.clearRect(0,0, 400, 400);
                //SOURCE: https://i.ytimg.com/vi/jcO2BD2Ma1c/maxresdefault.jpg
        //Need to figure out how to get a background on JPanel
        //Intersect methods won't take in an object that doesn't extend rectangle
        
        player.paintComponent(g);
        
        for(int i = 0; i<catBlocks.size();i++)
        {
            
            //catBlocks.get(i).paintComponent(g);
            
//            if(player.intersects(catBlocks.get(i)))
//            {
//                player.increaseScore();
//                scoreLabel.setText(("Your Score: "+player.getScore()));
//            }
            
        }
        for(int i = 0; i<fireBlocks.size(); i++)
        {
            
            fireBlocks.get(i).paintComponent(g);
                       if(player.intersects(fireBlocks.get(i)))
            {
                player.decrementLives();
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
    private class ScheduleTask extends TimerTask{
        public void run(){
            player.move();
            repaint();
        }
    }
        
    
}