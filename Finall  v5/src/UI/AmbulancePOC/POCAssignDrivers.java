 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AmbulancePOC;

import Ambulance.AssignedVehicles;
import Ambulance.Driver;
import Ambulance.Vehicle;
import UI.DiagnosticsSystemAdmin.*;
import UI.AmbulanceSystemAdmin.*;
import UI.SystemAdmin.*;
import ApplicationSystem.ApplicationSystem;
import UI.AmbulanceDriver.DriverVehicleRequest;
import User.UserAccount;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author suhasinipolampelly
 */
public class POCAssignDrivers extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */
    ApplicationSystem applicationSystem;
    UserAccount userAccount;
    DefaultTableModel vehicleTableModel;
    DefaultTableModel DriverTableModel;
    DefaultTableModel ADTableModel;
    public POCAssignDrivers(ApplicationSystem applicationSystem, UserAccount userAccount) {
        initComponents();
        this.setVisible(true);
        
        this.applicationSystem = applicationSystem;
        this.userAccount = userAccount;
        this.vehicleTableModel = (DefaultTableModel) jTable1.getModel();
        this.DriverTableModel = (DefaultTableModel) jTable2.getModel();
        this.ADTableModel = (DefaultTableModel) jTable3.getModel();
        populateTable();
        populateDrivers();
        jTable1.setDefaultRenderer(Object.class, new MyCellRenderer());
        jTable2.setDefaultRenderer(Object.class, new MyCellRenderer());
        jTable3.setDefaultRenderer(Object.class, new MyCellRenderer());
        
    }
    
    private class MyCellRenderer extends DefaultTableCellRenderer {
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (row % 2 == 0) {
                c.setBackground(new Color(0x99, 0xcc, 0xcc));
            } else {
                c.setBackground(new Color(0x3D, 0x76, 0x7D));
            }
            return c;
        }
    }
    
    public void populateTable(){
        vehicleTableModel.setRowCount(0);
        for(Vehicle vehicle : applicationSystem.getAmbulanceUserAccountDirectory().getVehicleDirectory().getVehicle()){
            Object rows[] = new Object[2];
            rows[0] = vehicle.getNumber();
            rows[1] = vehicle.getName();
            
            vehicleTableModel.addRow(rows);
        }
    }
    
    public void populateDrivers(){
        DriverTableModel.setRowCount(0);
        for(Driver driver: applicationSystem.getAmbulanceUserAccountDirectory().getDriverUserDirectory().getUseraccountlist()){
            Object rows[] = new Object[1];
            rows[0] = driver.getUsername();
            
            DriverTableModel.addRow(rows);
        }
    }
    
    public void populateadTable(){
        ADTableModel.setRowCount(0);
        for(AssignedVehicles av: applicationSystem.getAmbulanceUserAccountDirectory().getAssignedVehiclesDirectory().getAssignedVehicles()){
            Object rows[] = new Object[2];
            rows[0] = av.getVehicle().getName();
            rows[1] = av.getDriver().getUsername();
            
            ADTableModel.addRow(rows);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 204));

        jLabel14.setBackground(new java.awt.Color(54, 125, 118));
        jLabel14.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ASSIGN DRIVERS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(431, Short.MAX_VALUE)
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Driver"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton1.setBackground(new java.awt.Color(153, 204, 204));
        jButton1.setForeground(new java.awt.Color(61, 118, 125));
        jButton1.setText("Assign");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle", "Driver"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int row = jTable1.getSelectedRow();
        int driverrow = jTable2.getSelectedRow();
        
        if(row == -1)
        {
            JOptionPane.showMessageDialog(null,"Please select a Vehicle", "Select Warning", 2);
            
        }
        
        if(driverrow == -1){
            JOptionPane.showMessageDialog(null,"Please select a Driver", "Select Warning", 2);
        }
        
        
        ArrayList<AssignedVehicles> allAssignedVehciles = applicationSystem.getAmbulanceUserAccountDirectory().getAssignedVehiclesDirectory().getAssignedVehicles();
        Vehicle vehicle = applicationSystem.getAmbulanceUserAccountDirectory().getVehicleDirectory().getVehicle().get(row);
        Driver driver = applicationSystem.getAmbulanceUserAccountDirectory().getDriverUserDirectory().getUseraccountlist().get(driverrow);

        
        for(AssignedVehicles assignedVehicle : allAssignedVehciles)
        {
            
           if(assignedVehicle.getDriver().getUsername().equals(driver.getUsername()))
           {
                JOptionPane.showMessageDialog(null, "Driver already assigned. please select another driver.");
                return;
           }
           if(assignedVehicle.getVehicle().getNumber() == vehicle.getNumber())
           {
               JOptionPane.showMessageDialog(null, "vehicle is already assigned. please select another vehicle.");
                return;
           }
            
        }
        AssignedVehicles assignedVehicles = applicationSystem.getAmbulanceUserAccountDirectory().getAssignedVehiclesDirectory().assignedVehicle(vehicle, driver);

        JOptionPane.showMessageDialog(null, "Successfully Assigned Driver");

        
        populateadTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
