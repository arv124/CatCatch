package catcatch;

/**
 *
 * @author qpm5006
 */
import javax.swing.JComponent;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Dimension;

public class StartPanel extends javax.swing.JPanel {
    private Controller theController;
    
    public StartPanel(Controller controller) {
        initComponents();
        theController= controller;
    }
    

    
    @SuppressWarnings("unchecked")
                              
    private void initComponents() {

        StartPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel("CatCatch", SwingConstants.CENTER);
        startButton = new javax.swing.JButton();
        instructionBut = new javax.swing.JButton();
        highScoreBut = new javax.swing.JButton();
        centerPanel = new javax.swing.JPanel();
        centerPanel.setLayout(new GridLayout(4,1));

        title.setFont(new java.awt.Font("Jokerman", 0, 42)); // NOI18N
        
        
        startButton.setText("Start Game");
        startButton.setPreferredSize(new Dimension(40, 40));
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               startButtonActionPerformed(evt);
            }
        });

        instructionBut.setText("Instructions");
        instructionBut.setPreferredSize(new Dimension(40, 40));
        instructionBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionButActionPerformed(evt);
            }
        });

        highScoreBut.setText("High Scores");
        highScoreBut.setPreferredSize(new Dimension(40, 40));
        highScoreBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highScoreButActionPerformed(evt);
            }
        });
        this.add(centerPanel);
        centerPanel.add(title);
        centerPanel.add(startButton);
        centerPanel.add(instructionBut);
        centerPanel.add(highScoreBut);

        
    }                        
  
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt)
    {                                            
        theController.switchToGame();
    }                                           

    private void instructionButActionPerformed(java.awt.event.ActionEvent evt) 
    {                                               
        theController.switchToInstructions();
    }                                              

    private void highScoreButActionPerformed(java.awt.event.ActionEvent evt) 
    {                                             
        theController.switchToScores();
    }                                           
    
    // Variables declaration - do not modify                     
    private javax.swing.JPanel StartPanel;
    private javax.swing.JButton highScoreBut;
    private javax.swing.JButton instructionBut;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel title;
    private javax.swing.JPanel centerPanel;
    // End of variables declaration                   
}