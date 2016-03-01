package catcatch;

/**
 *
 * @author qpm5006
 */
public class StartPanel extends javax.swing.JPanel {
    private Controller theController;
    
    public StartPanel(Controller controller) {
        initComponents();
        theController= controller;
    }
    

    
    @SuppressWarnings("unchecked")
                              
    private void initComponents() {

        StartPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        instructionBut = new javax.swing.JButton();
        highScoreBut = new javax.swing.JButton();

        

        titleLabel.setFont(new java.awt.Font("Jokerman", 0, 42)); // NOI18N
        titleLabel.setText("CatCatch");
        startButton.setText("Start Game");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               startButtonActionPerformed(evt);
            }
        });

        instructionBut.setText("Instructions");
        instructionBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionButActionPerformed(evt);
            }
        });

        highScoreBut.setText("High Scores");
        highScoreBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highScoreButActionPerformed(evt);
            }
        });
        
        this.add(titleLabel);
        this.add(startButton);
        this.add(instructionBut);
        this.add(highScoreBut);

        
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
    private javax.swing.JLabel titleLabel;
    // End of variables declaration                   
}