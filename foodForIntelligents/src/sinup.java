
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
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
public class sinup extends javax.swing.JFrame {

    /**
     * Creates new form sinup
     */
    public sinup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password1 = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        password2 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        chk = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/logo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 20, 420, 90);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(59, 76, 79, 21);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(59, 34, 44, 21);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Confirm Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(59, 162, 142, 21);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(59, 118, 73, 21);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Email");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(59, 212, 43, 21);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Phone number");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(59, 259, 116, 21);

        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(name);
        name.setBounds(274, 35, 288, 30);

        phone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(phone);
        phone.setBounds(274, 260, 193, 30);

        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(email);
        email.setBounds(274, 210, 288, 30);

        password1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(password1);
        password1.setBounds(274, 119, 203, 30);

        username.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(username);
        username.setBounds(274, 77, 213, 30);

        password2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(password2);
        password2.setBounds(274, 163, 203, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/2.jpg"))); // NOI18N
        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 610, 320);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(87, 120, 610, 320);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/ok.png"))); // NOI18N
        jButton1.setText("Submit");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 510, 160, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/back.png"))); // NOI18N
        jButton2.setText("Back to Login Page");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 510, 190, 40);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setText("Note: It is necessary to verify the phone number through OTP.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(210, 450, 400, 15);

        chk.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chk.setForeground(new java.awt.Color(153, 0, 153));
        chk.setText("I have read all the terms and conditions. ");
        getContentPane().add(chk);
        chk.setBounds(250, 470, 290, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/temp.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 800, 590);

        setSize(new java.awt.Dimension(803, 618));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

 try
 {
if(chk.isSelected())
{  //System.out.println("Hello.");
    String vname = name.getText();
    //System.out.println(vname);
    String vusername = username.getText();
    String vpassword1 = password1.getText();
    String vpassword2 = password2.getText();
    String vemail = email.getText();
    long vphone = Long.parseLong(phone.getText());
    //if(phone.getText().isEmpty())
       // System.out.println("Hello");
    if(!vname.isEmpty() && !vusername.isEmpty() && !vpassword1.isEmpty() && !vpassword2.isEmpty() && !vemail.isEmpty() && !phone.getText().isEmpty())
     { // System.out.println(vname);
         if(vpassword1.equals(vpassword2))
         {
             //////////////////////////////////////////
             
             
             try{
              Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/foodForIntelligents";
            Connection conn = DriverManager.getConnection(database, "root", "");
            Statement stmt = conn.createStatement();
            String sql = "select * from login where username = '"+vusername+"';" ;
            ResultSet rs = stmt.executeQuery(sql);
            if(!rs.next()){
                //-------------------------------
                Random rand = new Random();
            int num = rand.nextInt(900000) + 100000;
            
             try{  
             FileWriter fw=new FileWriter("D:\\Projects Extras\\foodForIntelligents.txt");  
             fw.write("1 "+num+" "+vphone);  
             fw.close();  
             }catch(Exception e){System.out.println(e);} 
             //-----------------------------------
            String OTP = JOptionPane.showInputDialog(null, "Enter the OTP **"+vphone+"**");
            
            //**************************************** Message
         
            //****************************************
            if(OTP.equals(""+num))
            {
            sql = "insert into login values ( '" + vname + "', '" + vusername + "', '" + vpassword1 + "' , '" + vemail + "' , " + vphone + " );" ;
            stmt.executeUpdate(sql);
            sql = "insert into menu values('" + vusername + "', 10.00,'No Recent Order','No Recent Order',0.00);" ;
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "SinUp successful!!\n  Congratulations!! You have got 10 trial coins\n  Click OK to Login");
            this.setVisible(false);
            login log = new login();
            log.setVisible(true);
            
            ///---------------------
             try{  
             FileWriter fw=new FileWriter("D:\\Projects Extras\\foodForIntelligents.txt");  
             fw.write("0 "+num+" "+vphone);  
             fw.close();  
             }catch(Exception e){System.out.println(e);} 
             
            }
            else
            { 
               JOptionPane.showMessageDialog(null,"Wrong OTP\n   Authentication Failed!!","",JOptionPane.WARNING_MESSAGE);
                name.setText(""); 
                username.setText(""); 
                password1.setText(""); 
                password2.setText(""); 
                email.setText("");
                phone.setText(""); 
                chk.setSelected(false);
                
            }             
            //---------------------------------------------------
            
            //---------------------------------------------------
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Username: "+vusername+" already exist.","",JOptionPane.ERROR_MESSAGE);
            }
            
            
            }
            catch(Exception e)
            {
               System.out.println("Not Connected, Error:  "+e.getMessage());
            }
                 
             //////////////////////////////////////////
         }
         else
         {
             JOptionPane.showMessageDialog(null,"Make sure that both the passwords are equal","",JOptionPane.ERROR_MESSAGE);
         }
             
         
        //System.out.println(vname);
     }
    else
    {
        JOptionPane.showMessageDialog(null,"All fields are mandatory\nCan't be left empty..","",JOptionPane.ERROR_MESSAGE);
    }
}
else
   JOptionPane.showMessageDialog(null,"Please make sure that you tick the Check Box","",JOptionPane.ERROR_MESSAGE);

 }
 catch(Exception e)
 {
     JOptionPane.showMessageDialog(null,"All fields are mandatory\nCan't be left empty.","",JOptionPane.ERROR_MESSAGE);
 }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                    this.setVisible(false);
                    login nf = new login();
                    nf.setVisible(true);  
        
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
            java.util.logging.Logger.getLogger(sinup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sinup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sinup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sinup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sinup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chk;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
