/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import ApplicationSystem.ApplicationSystem;
import User.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author suhasinipolampelly
 */
public class DeleteJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeleteJPanel
     */
    
    ApplicationSystem applicationSystem;
    UserAccount userAccount;
    DefaultTableModel usersTableModel;
    
    public DeleteJPanel(ApplicationSystem applicationSystem, UserAccount userAccount) {
        initComponents();
        this.applicationSystem = applicationSystem;
        this.userAccount = userAccount;
        this.usersTableModel = (DefaultTableModel) jTable2.getModel();
         PopulateTable();
    }
    
    public ArrayList<UserAccount> getUserAccount()
    {
        
        ArrayList<UserAccount> userAccounts  = null;
        
         if(jComboBox1.getSelectedItem().equals("hospital system admin")){
             
             userAccounts = applicationSystem.getHospitalUserAccountDirectory().getHospitaluseraccountlist();
             
         }
      
         else if(jComboBox1.getSelectedItem().equals("ambulance system admin")){
                  userAccounts = applicationSystem.getAmbulanceUserAccountDirectory().getAmbulanceuseraccountlist();
             }
           
         else if(jComboBox1.getSelectedItem().equals("pharmacy system admin")){
                 userAccounts = applicationSystem.getPharmacyUserAccountDirectory().getPharmacyuseraccountlist();
             }
           
           else if(jComboBox1.getSelectedItem().equals("diagnostic system admin")){
                 userAccounts = applicationSystem.getDiagnosticUserAccountDirectory().getDiagnosticuseraccountlist();
             }
         
         return userAccounts;
    }
    public void PopulateTable(){
        
        
        usersTableModel.setRowCount(0);
        ArrayList<UserAccount> userAccounts  = getUserAccount();
        System.out.println(userAccounts.size());
        System.out.println("hi");       
         for(UserAccount ua: userAccounts)
         {
             Object rows[] = new Object[2];
            rows[0] = ua.getUsername();
            rows[1] = ua.getPassword();
            
            usersTableModel.addRow(rows);
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
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        createBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 204));

        jLabel14.setBackground(new java.awt.Color(54, 125, 118));
        jLabel14.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DELETE USERS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(420, 420, 420))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "diagnostic system admin", "ambulance system admin", "pharmacy system admin", "hospital system admin" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        createBtn1.setBackground(new java.awt.Color(153, 204, 204));
        createBtn1.setForeground(new java.awt.Color(61, 118, 125));
        createBtn1.setText("Delete");
        createBtn1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        createBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(createBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(createBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        PopulateTable();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void createBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtn1ActionPerformed
        int row = jTable2.getSelectedRow();

        if(row==-1){
        JOptionPane.showMessageDialog(null, "Please Select a Row");
        return;
        }
        ArrayList<UserAccount> userAccounts  = getUserAccount();

        userAccounts.remove(row);
        PopulateTable();
       
    }//GEN-LAST:event_createBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createBtn1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}