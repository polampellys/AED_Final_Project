/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.DiagnosticsSystemAdmin;

import ApplicationSystem.ApplicationSystem;
import UI.DiagnosticsLogin.DiagnosticsLoginJFrame;
import UI.MainJFrame;
import User.UserAccount;

/**
 *
 * @author saketh
 */
public class DiagnosticSystemAdmin extends javax.swing.JFrame {

    /**
     * Creates new form DiagnosticSystemAdmin
     */
    ApplicationSystem applicationSystem;
    UserAccount userAccount;
    public DiagnosticSystemAdmin(ApplicationSystem applicationSystem, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        viewUserBtn = new javax.swing.JButton();
        createUserBtn = new javax.swing.JButton();
        updateUserBtn = new javax.swing.JButton();
        deleteUserBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1280, 640));

        jPanel1.setBackground(new java.awt.Color(61, 118, 125));
        jPanel1.setMinimumSize(new java.awt.Dimension(240, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(240, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Diagnostics System Admin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-user-24.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        viewUserBtn.setBackground(new java.awt.Color(61, 118, 125));
        viewUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewUserBtn.setText("View Users");
        viewUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUserBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, 43));

        createUserBtn.setBackground(new java.awt.Color(61, 118, 125));
        createUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        createUserBtn.setText("Create Users");
        createUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserBtnActionPerformed(evt);
            }
        });
        jPanel1.add(createUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 43));

        updateUserBtn.setBackground(new java.awt.Color(61, 118, 125));
        updateUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateUserBtn.setText("Update Users");
        updateUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 200, 43));

        deleteUserBtn.setBackground(new java.awt.Color(61, 118, 125));
        deleteUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteUserBtn.setText("Delete Users");
        deleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 200, 43));

        logoutBtn.setBackground(new java.awt.Color(61, 118, 125));
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("LOGOUT");
        logoutBtn.setBorder(null);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 70, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-logout-25.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 29, 34));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-system-administrator-male-96.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jSplitPane1.setLeftComponent(jPanel1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUserBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new DiagView(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_viewUserBtnActionPerformed

    private void createUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new DiagCreate(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_createUserBtnActionPerformed

    private void updateUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new DiagUpdate(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_updateUserBtnActionPerformed

    private void deleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new DiagDelete(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_deleteUserBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DiagnosticsLoginJFrame dj = new DiagnosticsLoginJFrame(this.applicationSystem, this.userAccount);
    }//GEN-LAST:event_logoutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DiagnosticSystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiagnosticSystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiagnosticSystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiagnosticSystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DiagnosticSystemAdmin(applicationSystem, useraccount).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createUserBtn;
    private javax.swing.JButton deleteUserBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton updateUserBtn;
    private javax.swing.JButton viewUserBtn;
    // End of variables declaration//GEN-END:variables
}
