/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcatch;

import java.util.logging.Logger;
import java.io.*;
import java.util.*;
import java.nio.charset.Charset;

/**
 *
 * @author Alex
 */
public class ScorePanel extends javax.swing.JPanel {

    /**
     * Creates new form ScorePanel
     */
    private List<String> lines = new ArrayList<String>();
    private String[] players;
    final private String SCOREFILEPATH = null;
    private String newEntry = null;
    
    
    public ScorePanel() 
    {
        
        initComponents();
        
    }
public void readFile() throws IOException
    {
        BufferedReader reader = null;
        try 
            {
                reader = new BufferedReader(new InputStreamReader( new FileInputStream(SCOREFILEPATH), Charset.forName("ISO-8859-1")));
                String line;
                while ((line = reader.readLine()) != null) 
                 {
                     lines.add(line);
                 }
            }    
        catch (IOException e) 
            {
                
            } 
        finally 
            {
                if (reader != null) 
                    {
                        reader.close();
                    }   
            }
        players = new String[lines.size()];
        
        for (int i = 0; i <= lines.size(); i++)
            {
              players[i] = lines.get(i);
            }
    }   


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();

        jLabel2.setText("High Scores");

        jList1.setModel(new javax.swing.AbstractListModel() {

            public int getSize() { return players.length; }
            public Object getElementAt(int i) { return players[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(153, 153, 153))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jButton1.setText("Submit!");
        jButton1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(SCOREFILEPATH, true))))
                    {
                        out.println(newEntry);
                    }
                    catch (IOException e)
                    {

                    }
                }
            });

            jFormattedTextField2.setText("Your Name Here!");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(7, 7, 7)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(4, 4, 4))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jFormattedTextField2)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                    .addContainerGap())
            );
        }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
