/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.PharmacyStore;

import ApplicationSystem.ApplicationSystem;
import UI.PharmacyLogin.PharmacyLoginJFrame;
import User.UserAccount;

/**
 *
 * @author saketh
 */
public class Store extends javax.swing.JFrame {

    /**
     * Creates new form Store
     */
    ApplicationSystem applicationSystem;
    UserAccount userAccount;
    public Store(ApplicationSystem applicationSystem, UserAccount useraccount) {
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
        requestMedicineBtn = new javax.swing.JButton();
        viewPatientsBtn = new javax.swing.JButton();
        dashboardBtn = new javax.swing.JButton();
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
        jLabel2.setText("Store");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-user-24.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 24, -1, 40));

        requestMedicineBtn.setBackground(new java.awt.Color(61, 118, 125));
        requestMedicineBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestMedicineBtn.setText("Request Medicines");
        requestMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestMedicineBtnActionPerformed(evt);
            }
        });
        jPanel1.add(requestMedicineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, 43));

        viewPatientsBtn.setBackground(new java.awt.Color(61, 118, 125));
        viewPatientsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewPatientsBtn.setText("View Patients");
        viewPatientsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewPatientsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 43));

        dashboardBtn.setBackground(new java.awt.Color(61, 118, 125));
        dashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        dashboardBtn.setText("Dashboard");
        dashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnActionPerformed(evt);
            }
        });
        jPanel1.add(dashboardBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 200, 43));

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-new-store-80.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jSplitPane1.setLeftComponent(jPanel1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PharmacyLoginJFrame plj = new PharmacyLoginJFrame(this.applicationSystem, this.userAccount);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void dashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new PharStoreDashboard(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_dashboardBtnActionPerformed

    private void viewPatientsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientsBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new PharStoreViewPatients(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_viewPatientsBtnActionPerformed

    private void requestMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestMedicineBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new PharStoreRequestMedicines(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_requestMedicineBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Store(applicationSystem, useraccount).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboardBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton requestMedicineBtn;
    private javax.swing.JButton viewPatientsBtn;
    // End of variables declaration//GEN-END:variables
}
