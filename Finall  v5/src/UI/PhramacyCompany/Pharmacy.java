/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.PhramacyCompany;

import ApplicationSystem.ApplicationSystem;
import UI.PharmacyLogin.PharmacyLoginJFrame;
import User.UserAccount;

/**
 *
 * @author saketh
 */
public class Pharmacy extends javax.swing.JFrame {

    /**
     * Creates new form Pharmacy
     */
    ApplicationSystem applicationSystem;
    UserAccount userAccount;
    public Pharmacy(ApplicationSystem applicationSystem, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        
        this.applicationSystem = applicationSystem;
        this.userAccount = useraccount;
        
        this.jLabel2.setText(userAccount.getUsername());
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
        viewRequestsBtn = new javax.swing.JButton();
        createMedicinesBtn = new javax.swing.JButton();
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
        jLabel2.setText("Pharmacy Company");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-user-24.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 24, -1, 40));

        viewRequestsBtn.setBackground(new java.awt.Color(61, 118, 125));
        viewRequestsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewRequestsBtn.setText("View Requests");
        viewRequestsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewRequestsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, 43));

        createMedicinesBtn.setBackground(new java.awt.Color(61, 118, 125));
        createMedicinesBtn.setForeground(new java.awt.Color(255, 255, 255));
        createMedicinesBtn.setText("Create Medicines");
        createMedicinesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMedicinesBtnActionPerformed(evt);
            }
        });
        jPanel1.add(createMedicinesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 43));

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-pharmacy-shop-80.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jSplitPane1.setLeftComponent(jPanel1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewRequestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestsBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new PharComViewRequests(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_viewRequestsBtnActionPerformed

    private void createMedicinesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMedicinesBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new PharComCreateMedicines(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_createMedicinesBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PharmacyLoginJFrame plj = new PharmacyLoginJFrame(this.applicationSystem, this.userAccount);
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
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Pharmacy(applicationSystem, useraccount).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createMedicinesBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton viewRequestsBtn;
    // End of variables declaration//GEN-END:variables
}
