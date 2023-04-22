/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.AmbulanceSystemAdmin;

import ApplicationSystem.ApplicationSystem;
import UI.AmbulanceLogin.AmbulanceLoginJFrame;
=======
import UI.MainJFrame;
import User.UserAccount;

/**
 *
 * @author saketh
 */
public class AmbulanceSystemAdmin extends javax.swing.JFrame {

    /**
     * Creates new form AmbulanceSystemAdmin
     */
    ApplicationSystem applicationSystem;
    UserAccount userAccount;
    public AmbulanceSystemAdmin(ApplicationSystem applicationSystem, UserAccount userAccount) {
        initComponents();
        this.setVisible(true);
        this.applicationSystem = applicationSystem;
        this.userAccount = userAccount;
=======
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
        createDriverBtn = new javax.swing.JButton();
        createPOCBtn = new javax.swing.JButton();
        updateUserBtn = new javax.swing.JButton();
        deleteUserBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        viewUserBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1280, 640));

        jPanel1.setBackground(new java.awt.Color(61, 118, 125));
        jPanel1.setMinimumSize(new java.awt.Dimension(240, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(240, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ambulance System Admin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 24, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-user-24.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 24, -1, 40));

        createDriverBtn.setBackground(new java.awt.Color(61, 118, 125));
        createDriverBtn.setForeground(new java.awt.Color(255, 255, 255));
        createDriverBtn.setText("Create Drivers");
        createDriverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDriverBtnActionPerformed(evt);
            }
        });
        jPanel1.add(createDriverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, 43));

        createPOCBtn.setBackground(new java.awt.Color(61, 118, 125));
        createPOCBtn.setForeground(new java.awt.Color(255, 255, 255));
        createPOCBtn.setText("Create POCs");
        createPOCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPOCBtnActionPerformed(evt);
            }
        });
        jPanel1.add(createPOCBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 43));

        updateUserBtn.setBackground(new java.awt.Color(61, 118, 125));
        updateUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateUserBtn.setText("Update Users");
        updateUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 200, 43));

        deleteUserBtn.setBackground(new java.awt.Color(61, 118, 125));
        deleteUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteUserBtn.setText("Delete Users");
        deleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 200, 43));

        logoutBtn.setBackground(new java.awt.Color(61, 118, 125));
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("LOGOUT");
        logoutBtn.setBorder(null);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 70, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-logout-25.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 29, 34));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/icons8-system-administrator-male-96.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        viewUserBtn.setBackground(new java.awt.Color(61, 118, 125));
        viewUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewUserBtn.setText("View Users");
        viewUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUserBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 200, 43));

        jSplitPane1.setLeftComponent(jPanel1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createDriverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDriverBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new AmbCreateDriver(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_createDriverBtnActionPerformed

    private void createPOCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPOCBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new AmbCreatePOC(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_createPOCBtnActionPerformed

    private void updateUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new AmbUpdate(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_updateUserBtnActionPerformed

    private void deleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new AmbDelete(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_deleteUserBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AmbulanceLoginJFrame aj = new AmbulanceLoginJFrame(this.applicationSystem, this.userAccount);
=======
        MainJFrame mj = new MainJFrame(this.applicationSystem, this.userAccount);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void viewUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUserBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new AmbView(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_viewUserBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AmbulanceSystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AmbulanceSystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AmbulanceSystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AmbulanceSystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AmbulanceSystemAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createDriverBtn;
    private javax.swing.JButton createPOCBtn;
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
