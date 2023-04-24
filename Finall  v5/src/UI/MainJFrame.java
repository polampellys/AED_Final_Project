/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import ApplicationSystem.ApplicationSystem;
import UI.AmbulanceLogin.AmbulanceLoginJFrame;
import UI.DiagnosticsLogin.DiagnosticsLoginJFrame;
import UI.HospitalLogin.HospitalLoginJFrame;
import UI.PharmacyLogin.PharmacyLoginJFrame;
import User.UserAccount;
import javax.swing.JOptionPane;

/**
 *
 * @author suhasinipolampelly
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    ApplicationSystem applicationSystem;
    UserAccount userAccount;
    public MainJFrame() {
        initComponents();
        this.setVisible(true);
        
        
        this.applicationSystem = ApplicationSystem.getInstance();
        //System.out.println("Main Frame"+this.applicationSystem.getHospitalUserAccountDirectory().getHospitaluseraccountlist().size());

    }
    
    public MainJFrame(ApplicationSystem applicationSystem, UserAccount userAccount){
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

        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logInBtn = new javax.swing.JButton();
        ambulanceBtn = new javax.swing.JButton();
        diagnosticsBtn = new javax.swing.JButton();
        hospitalBtn = new javax.swing.JButton();
        pharmacyBtn = new javax.swing.JButton();

        jButton8.setBackground(new java.awt.Color(61, 118, 125));
        jButton8.setFont(new java.awt.Font("Kailasa", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Hospital");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-hospital-100.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 110, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-verified-drivers-78.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 76, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-diagnostics-64.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-ambulance-60.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 80, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-down-left-arrow-48.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 70, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-left-2-48.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 42, 36));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-arrow-up-48.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jLabel11.setBackground(new java.awt.Color(54, 125, 118));
        jLabel11.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(54, 125, 118));
        jLabel11.setText("BOSTONPURAM HOSPITAL");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 370, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-pharmacy-40.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-up-arrow-30.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

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
        jPanel3.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 210, 41));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 230, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 313, 230, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-lock-24.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-user-24.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 30, -1));

        logInBtn.setBackground(new java.awt.Color(61, 118, 125));
        logInBtn.setForeground(new java.awt.Color(255, 255, 255));
        logInBtn.setText("Log In");
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });
        jPanel3.add(logInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 100, 30));

        ambulanceBtn.setBackground(new java.awt.Color(61, 118, 125));
        ambulanceBtn.setFont(new java.awt.Font("Kailasa", 1, 14)); // NOI18N
        ambulanceBtn.setForeground(new java.awt.Color(255, 255, 255));
        ambulanceBtn.setText("Ambulance");
        ambulanceBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ambulanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambulanceBtnActionPerformed(evt);
            }
        });
        jPanel3.add(ambulanceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 160, 30));

        diagnosticsBtn.setBackground(new java.awt.Color(61, 118, 125));
        diagnosticsBtn.setFont(new java.awt.Font("Kailasa", 1, 14)); // NOI18N
        diagnosticsBtn.setForeground(new java.awt.Color(255, 255, 255));
        diagnosticsBtn.setText("Diagnostics");
        diagnosticsBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        diagnosticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosticsBtnActionPerformed(evt);
            }
        });
        jPanel3.add(diagnosticsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 160, 30));

        hospitalBtn.setBackground(new java.awt.Color(61, 118, 125));
        hospitalBtn.setFont(new java.awt.Font("Kailasa", 1, 14)); // NOI18N
        hospitalBtn.setForeground(new java.awt.Color(255, 255, 255));
        hospitalBtn.setText("Hospital");
        hospitalBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalBtnActionPerformed(evt);
            }
        });
        jPanel3.add(hospitalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 160, 30));

        pharmacyBtn.setBackground(new java.awt.Color(61, 118, 125));
        pharmacyBtn.setFont(new java.awt.Font("Kailasa", 1, 14)); // NOI18N
        pharmacyBtn.setForeground(new java.awt.Color(255, 255, 255));
        pharmacyBtn.setText("Pharmacy");
        pharmacyBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pharmacyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyBtnActionPerformed(evt);
            }
        });
        jPanel3.add(pharmacyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 160, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        // TODO add your handling code here:
        Boolean foundUser = false;
        
        if(this.applicationSystem.getUseraccountDirectory().authenticateUser(userNameField.getText(), passwordField.getText()) != null){
            UserAccount userAccount = this.applicationSystem.getUseraccountDirectory().authenticateUser(userNameField.getText(), passwordField.getText()); 
            foundUser = true;
            userAccount.getRole().createWorkArea(applicationSystem, userAccount);
            this.setVisible(false);   
        }
        
        if(!foundUser) {
            JOptionPane.showMessageDialog(null, "Invalid Credentials");
        }
        
    
                                           

    }//GEN-LAST:event_logInBtnActionPerformed

    private void hospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalBtnActionPerformed
        // TODO add your handling code here:
        HospitalLoginJFrame h1 = new HospitalLoginJFrame(this.applicationSystem, this.userAccount);
        h1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_hospitalBtnActionPerformed

    private void ambulanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambulanceBtnActionPerformed
        // TODO add your handling code here:
        AmbulanceLoginJFrame a1 = new AmbulanceLoginJFrame(this.applicationSystem, this.userAccount);
        a1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ambulanceBtnActionPerformed

    private void pharmacyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyBtnActionPerformed
        // TODO add your handling code here:
        PharmacyLoginJFrame p1 = new PharmacyLoginJFrame(this.applicationSystem, this.userAccount);
        p1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pharmacyBtnActionPerformed

    private void diagnosticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosticsBtnActionPerformed
        // TODO add your handling code here:
        DiagnosticsLoginJFrame d1 = new DiagnosticsLoginJFrame(this.applicationSystem, this.userAccount);
        d1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_diagnosticsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ambulanceBtn;
    private javax.swing.JButton diagnosticsBtn;
    private javax.swing.JButton hospitalBtn;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logInBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton pharmacyBtn;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}