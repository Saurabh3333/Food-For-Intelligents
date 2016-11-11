
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saurabh Shubham
 */
public class question extends javax.swing.JFrame {
  
    /**
     * Creates new form question
     */
    public question() {
        initComponents();
    }
    int correct=0, wrong=0, attempted=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ques = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        response = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        quesno = new javax.swing.JLabel();
        warn = new javax.swing.JLabel();
        usernamequestions = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/logo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 30, 410, 90);

        ques.setEditable(false);
        ques.setColumns(20);
        ques.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ques.setRows(5);
        jScrollPane1.setViewportView(ques);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 150, 680, 130);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Your Response");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 310, 116, 30);

        response.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        getContentPane().add(response);
        response.setBounds(340, 310, 372, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Rules for writing answers:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setText("-> It should be in single word containg only lowercases and numbers.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 0));
        jLabel5.setText("-> It should not have any unused spaces.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 51, 0));
        jLabel6.setText("-> Just press next to submit and move to the next question.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(110, 420, 690, 107);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/next.png"))); // NOI18N
        jButton1.setText("Next");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setEnabled(false);
        jButton1.setRolloverEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 360, 110, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/ok.png"))); // NOI18N
        jButton2.setText("SUBMIT");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setEnabled(false);
        jButton2.setRolloverEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 540, 130, 50);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/start.png"))); // NOI18N
        jButton3.setText("Start");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(411, 360, 110, 40);

        quesno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(quesno);
        quesno.setBounds(70, 150, 26, 30);

        warn.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(warn);
        warn.setBounds(337, 293, 262, 0);

        usernamequestions.setBackground(new java.awt.Color(51, 255, 0));
        usernamequestions.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        usernamequestions.setForeground(new java.awt.Color(255, 0, 51));
        usernamequestions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernamequestions.setText("Guest");
        usernamequestions.setToolTipText("");
        getContentPane().add(usernamequestions);
        usernamequestions.setBounds(650, 30, 184, 26);

        jLabel7.setText("Correct answer:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(670, 70, 93, 16);

        jLabel17.setBackground(new java.awt.Color(51, 255, 0));
        jLabel17.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 0));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Coin-icon.png"))); // NOI18N
        jLabel17.setText("+10");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(780, 70, 48, 23);

        jLabel8.setText("Wrong answer:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(670, 100, 89, 16);

        jLabel18.setBackground(new java.awt.Color(51, 255, 0));
        jLabel18.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 0, 0));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Coin-icon.png"))); // NOI18N
        jLabel18.setText("-5");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(780, 100, 36, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/2.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 890, 620);

        setSize(new java.awt.Dimension(889, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try{
             Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/foodforintelligents";
            Connection conn = DriverManager.getConnection(database, "root","");
            Statement stmt = conn.createStatement();
             String sql = "select * from questions where no = 1;" ;
             ResultSet rs = stmt.executeQuery(sql);
             while(rs.next())
             {
                 String s;
                 s = rs.getString("no");
                 quesno.setText(""+s); 
                 s = rs.getString("question");
                 ques.setText(""+s); 
             }
              jButton3.setEnabled(false);
              jButton1.setEnabled(true);
              jButton2.setEnabled(true);
            }
            catch(Exception e)
            {
               System.out.println("Not Connected, Error:  "+e.getMessage());
            }        
   
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    int i=1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
      try{
             
            
             Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/foodforintelligents";
            Connection conn = DriverManager.getConnection(database, "root","");
            Statement stmt = conn.createStatement();
            //---------------------------------------
             String sql1 = "select * from questions where no = " +i +";";
             ResultSet rs1 = stmt.executeQuery(sql1);
              if(rs1.next())
             {
                 String database_ans;
                 database_ans = rs1.getString("answer");
                 if(database_ans.equals(response.getText()))
                 {
                     correct++;
                     attempted++;
                     JOptionPane.showMessageDialog(null,"Right answer.");
                 }
                 else
                 {
                     wrong--;
                     attempted++;
                     JOptionPane.showMessageDialog(null,"Wrong answer.");
                 }
                 response.setText("");
             }
                     
             
            //------------------------------------------
             i++;
             String sql = "select * from questions where no = " +i +";";
             ResultSet rs = stmt.executeQuery(sql);
             if(rs.next())
             {
                 String s;
                 s = rs.getString("no");
                 quesno.setText(""+s); 
                 s = rs.getString("question");
                 ques.setText(""+s); 
             }
             else
             { jButton1.setEnabled(false);
                 warn.setText("Qustions Ended, Click Submit to Continue.");
                 response.setEditable(false);
             }
            }
            catch(Exception e)
            {
               System.out.println("Not Connected, Error:  "+e.getMessage());
            }      
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu m = new menu();
        String s="";
      int selection = JOptionPane.showConfirmDialog (null, "Are you sure?","WARNING", JOptionPane.YES_NO_OPTION);
      if(selection == 0)
      {
          double coins = correct*10+wrong*5;
          //----------------------
             try{
               Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/foodforintelligents";
            Connection conn = DriverManager.getConnection(database, "root","");
            Statement stmt = conn.createStatement();
             String sql = "select balance from menu where username = '" + usernamequestions.getText() + "';" ;
             ResultSet rs = stmt.executeQuery(sql);
             if(rs.next())
             {
                 
                   s = rs.getString("balance"); 
                   double retrivedBalance = Double.parseDouble(s);
                   double finalBalance = retrivedBalance + coins;
                   sql = "update menu set balance = " + finalBalance + "where username = '" + usernamequestions.getText() + "';";
                   stmt.executeUpdate(sql);
                   m.balance.setText(""+finalBalance);
                   m.usernamemenu.setText(usernamequestions.getText());
                  // System.out.println("Hey");
             }
              
            }
            catch(Exception e)
            {
               System.out.println("Not Connected, Error:  "+e.getMessage());
            }  
           
             
          //-------------------------
          JOptionPane.showMessageDialog(null, "Question attempted: "+attempted+"\nCorrect answers: "+correct+"\nWrong answers: "+-1*wrong+"\n   CONGRULATIONS, You Have Earned "+coins+"Coins!!!");
          this.setVisible(false);
          
          
          m.setVisible(true);
      }
      else if(selection == 1)
      {
          
      }
      else
      {
          JOptionPane.showMessageDialog(null, "Perform again \n  Database Failure!!");
      }
       
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new question().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ques;
    private javax.swing.JLabel quesno;
    private javax.swing.JTextField response;
    public static javax.swing.JLabel usernamequestions;
    private javax.swing.JLabel warn;
    // End of variables declaration//GEN-END:variables
}
