/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.DiagnosticsVendor;

import ApplicationSystem.ApplicationSystem;
import UI.DiagnosticsLogin.DiagnosticsLoginJFrame;
import User.UserAccount;

/**
 *
 * @author saketh
 */
public class Vendor extends javax.swing.JFrame {

    /**
     * Creates new form Vendor
     */
    ApplicationSystem applicationSystem;
    UserAccount userAccount;
    public Vendor(ApplicationSystem applicationSystem, UserAccount useraccount) {
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
        approveRequestsBtn = new javax.swing.JButton();
        addMachinesBtn = new javax.swing.JButton();
        dashboardBtn = new javax.swing.JButton();
        dashboardBtnnn = new javax.swing.JButton();
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
        jLabel2.setText("Vendors");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-user-24.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 24, -1, 40));

        approveRequestsBtn.setBackground(new java.awt.Color(61, 118, 125));
        approveRequestsBtn.setForeground(new java.awt.Color(255, 255, 255));
        approveRequestsBtn.setText("Appprove Requests");
        approveRequestsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveRequestsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(approveRequestsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, 43));

        addMachinesBtn.setBackground(new java.awt.Color(61, 118, 125));
        addMachinesBtn.setForeground(new java.awt.Color(255, 255, 255));
        addMachinesBtn.setText("Add Machines");
        addMachinesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMachinesBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addMachinesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 43));

        dashboardBtn.setBackground(new java.awt.Color(61, 118, 125));
        dashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        dashboardBtn.setText("Dashboard");
        dashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnActionPerformed(evt);
            }
        });
        jPanel1.add(dashboardBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 200, 43));

        dashboardBtnnn.setBackground(new java.awt.Color(61, 118, 125));
        dashboardBtnnn.setForeground(new java.awt.Color(255, 255, 255));
        dashboardBtnnn.setText("later");
        dashboardBtnnn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnnnActionPerformed(evt);
            }
        });
        jPanel1.add(dashboardBtnnn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 200, 43));

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-head-massage-area-80.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jSplitPane1.setLeftComponent(jPanel1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void approveRequestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveRequestsBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new DiaApproveRequests(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_approveRequestsBtnActionPerformed

    private void addMachinesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMachinesBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new DiaAddMachines(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_addMachinesBtnActionPerformed

    private void dashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new DiaVendorDashboard(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_dashboardBtnActionPerformed

    private void dashboardBtnnnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnnnActionPerformed
        // TODO add your handling code here:
//        jSplitPane1.setRightComponent(new DiaDashboard(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_dashboardBtnnnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DiagnosticsLoginJFrame dlj = new DiagnosticsLoginJFrame(this.applicationSystem, this.userAccount);
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
            java.util.logging.Logger.getLogger(Vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Vendor(applicationSystem, useraccount).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMachinesBtn;
    private javax.swing.JButton approveRequestsBtn;
    private javax.swing.JButton dashboardBtn;
    private javax.swing.JButton dashboardBtnnn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
