package catcatch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
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
public class GamePanel extends javax.swing.JPanel implements ActionListener, KeyListener{
    
    private Timer gameTimer;
    private Timer blockTimer;
    private Player player = new Player("", 3, 0);
    private ArrayList<CatBlock> catBlocks;
    private ArrayList<FireBlock> fireBlocks;
    private Boolean gameStatus;
    private final JPanel gui = new JPanel(new BorderLayout(3,3));
    private final JPanel gamePanel = new JPanel();
    private JLabel scoreLabel;
    public Controller theController;
    private final Image background = (new ImageIcon("src/res/burning_building.jpg").getImage());
    
    public GamePanel(Controller theController){
        super();
        this.addKeyListener(this);
        this.theController = theController;
        initcomponents();
    }
    
    public void initcomponents(){
        scoreLabel = new JLabel("Your Score: "+player.getScore());
        gui.add(scoreLabel, BorderLayout.NORTH);
        gui.add(gamePanel, BorderLayout.CENTER);
        gamePanel.setBorder(new LineBorder(Color.BLACK));
        gameTimer = new Timer(60, this);
        blockTimer = new Timer(600, this);
        gameTimer.start();
        blockTimer.start();
        setFocusable(true);
        this.add(gui); 
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        
        //sets the object to the source of whatever event occurs
        Object obj = event.getSource();
        
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
            //adds block objects to their respective arrays
            //still need images for each object
            
            //catBlocks.add(new CatBlock(400,400, catImage));
            //fireBlocks.add(new FireBlock(400,400, fireImage));
            //fireBlocks.add(new FireBlock(400,400, fireImage));
            
        }
        
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.clearRect(0,0, this.getWidth(), this.getHeight());
        g.drawImage(background, this.getWidth(), this.getHeight(), this);
        
        //SOURCE: https://i.ytimg.com/vi/jcO2BD2Ma1c/maxresdefault.jpg
        //Need to figure out how to get a background on JPanel
        //Intersect methods won't take in an object that doesn't extend rectangle
        player.paintComponent(g);
        /*
        for(int i = 0; i<catBlocks.size();i++)
        {
            
            catBlocks.get(i).paintComponent(g);
            
            if(player.intersects(catBlocks.get(i)))
            {
                player.increaseScore();
            }
            
        }
        for(int i = 0; i<fireBlocks.size(); i++)
        {
            
            fireBlocks.get(i).paintComponent(g);
            
            if(player.intersects(fireBlocks.get(i)))
            {
                player.decrementLives();
            }
            
        }
        */
        @Override
        public void keyTyped(KeyEvent event){  
        }
        
        @Override 
        public void keyPressed(KeyEvent event){
            player.keyPressed(event);
        }
        
        @Override
        public void keyReleased(KeyEvent event){
        
        }
        
    }
    
}