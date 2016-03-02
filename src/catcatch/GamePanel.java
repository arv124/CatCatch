package catcatch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
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
public class GamePanel extends javax.swing.JPanel{
    
    private Timer time;
    private Player player;
    private ArrayList<CatBlock> catBlocks;
    private ArrayList<FireBlock> fireBlocks;
    private Boolean gameStatus;
    private int score;
    private final JPanel gui = new JPanel(new BorderLayout(3,3));
    private final JPanel gamePanel  = new JPanel(new GridLayout(5,6));
    private JLabel scoreLabel;
    
    public GamePanel(){
        initcomponents();
    }
    
    public void initcomponents(){
        scoreLabel = new JLabel("Your Score: "+score);
        gui.add(scoreLabel, BorderLayout.NORTH);
        gui.add(gamePanel, BorderLayout.CENTER);
        gamePanel.setBorder(new LineBorder(Color.BLACK));
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 6; j++){
                gamePanel.add(new JButton());
            }
        }
        this.add(gui);    
    }
    /*
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.fillRect(200, 62, 30, 10);
    }
    */
}
