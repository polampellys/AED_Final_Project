/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.AmbulanceLogin;

import Ambulance.Driver;
import Ambulance.POC;
import ApplicationSystem.ApplicationSystem;
import UI.MainJFrame;
import User.UserAccount;
import javax.swing.JOptionPane;

/**
 *
 * @author suhasinipolampelly
 */
public class AmbulanceLoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AmbulanceLoginJFrame
     */
    ApplicationSystem applicationSystem;
    UserAccount userAccount;
    public AmbulanceLoginJFrame() {
        initComponents();
        this.setVisible(true);
        
        this.applicationSystem = ApplicationSystem.getInstance();
    }
    
    public AmbulanceLoginJFrame (ApplicationSystem applicationSystem, UserAccount userAccount){
        initComponents();
        this.setVisible(true);
        
        this.applicationSystem = applicationSystem;
        
        this.userAccount = userAccount;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        backBtn1 = new javax.swing.JButton();
        userComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(840, 540));

        jPanel2.setBackground(new java.awt.Color(153, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-ambulance-100 (1).png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 120, 120));

        jLabel11.setBackground(new java.awt.Color(54, 125, 118));
        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("AMBULANCE MANAGEMENT");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 320, 40));

        jLabel13.setBackground(new java.awt.Color(54, 125, 118));
        jLabel13.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(54, 125, 118));
        jLabel13.setText("BOSTONPURAM HOSPITAL");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 370, 40));

        jPanel3.setBackground(new java.awt.Color(61, 118, 125));
        jPanel3.setPreferredSize(new java.awt.Dimension(840, 540));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameField.setBackground(new java.awt.Color(61, 118, 125));
        userNameField.setForeground(new java.awt.Color(255, 255, 255));
        userNameField.setText("Username");
        userNameField.setBorder(null);
        jPanel3.add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 210, 41));

        passwordField.setBackground(new java.awt.Color(61, 118, 125));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setText("Password");
        passwordField.setBorder(null);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanel3.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 210, 41));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 230, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 313, 230, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-lock-24.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-user-24.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 30, -1));

        jButton2.setBackground(new java.awt.Color(61, 118, 125));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Log In");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 100, 30));

        backBtn1.setBackground(new java.awt.Color(61, 118, 125));
        backBtn1.setForeground(new java.awt.Color(255, 255, 255));
        backBtn1.setText("Back");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(backBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 100, 30));

        userComboBox.setBackground(new java.awt.Color(61, 118, 125));
        userComboBox.setForeground(new java.awt.Color(255, 255, 255));
        userComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Driver", "Poc" }));
        jPanel3.add(userComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 351, 100, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        // TODO add your handling code here:
        MainJFrame m1 = new MainJFrame(this.applicationSystem, this.userAccount);
        m1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Boolean foundUser = false;
        
        String userType = (String) this.userComboBox.getSelectedItem();
        
        if("admin".equalsIgnoreCase(userType) && this.applicationSystem.getAmbulanceUserAccountDirectory().authenticateUser(userNameField.getText(), passwordField.getText()) != null)
        {
            UserAccount userAccount = this.applicationSystem.getAmbulanceUserAccountDirectory().authenticateUser(userNameField.getText(), passwordField.getText()); 
            foundUser = true;
            userAccount.getRole().createWorkArea(applicationSystem, userAccount);
            this.setVisible(false);   
        }
        
        if("driver".equalsIgnoreCase(userType) && (this.applicationSystem.getAmbulanceUserAccountDirectory().getDriverUserDirectory().authenticateUser(userNameField.getText(), passwordField.getText()) != null)){ 
            
            Driver driver = this.applicationSystem.getAmbulanceUserAccountDirectory().getDriverUserDirectory().authenticateUser(userNameField.getText(), passwordField.getText()); 
            foundUser = true;
            driver.getRole().createWorkArea(applicationSystem, driver);
            this.setVisible(false); 
        }
        
        if("poc".equalsIgnoreCase(userType) && (this.applicationSystem.getAmbulanceUserAccountDirectory().getPocUserDirectory().authenticateUser(userNameField.getText(), passwordField.getText()) != null)){ 
            
            POC poc = this.applicationSystem.getAmbulanceUserAccountDirectory().getPocUserDirectory().authenticateUser(userNameField.getText(), passwordField.getText()); 
            foundUser = true;
            poc.getRole().createWorkArea(applicationSystem, poc);
            this.setVisible(false); 
        }
        
        
        if(!foundUser) {
            JOptionPane.showMessageDialog(null, "Invalid Credentials");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AmbulanceLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AmbulanceLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AmbulanceLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AmbulanceLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AmbulanceLoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JComboBox<String> userComboBox;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}