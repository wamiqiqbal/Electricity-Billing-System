/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electricitybillingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noem Ahmed Khan
 */
public class CustomerInterfaceBillingRates extends javax.swing.JFrame {

    // Creating Default Table Model To Insert & Delete Data
    DefaultTableModel model;
    
    public CustomerInterfaceBillingRates() {
        initComponents();
        
         // To Center the table header text
        ((DefaultTableCellRenderer) CustomerInterfaceBillingRates.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(javax.swing.JLabel.CENTER);
        
        // Default Table Model Initialization
        model = (DefaultTableModel) CustomerInterfaceBillingRates.getModel();

        // Set column auto resizable
        CustomerInterfaceBillingRates.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        
        
         // JDBC Connection
        
         // URL, USERNAME, PASSWORD
        String url = "jdbc:mysql://localhost:3306/electricitybillingsystem";
        String username = "root";
        String password = "noemak";
    
        // Establishing Connection
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully!");
            String query = "SELECT * FROM Billing_Rates;";
            PreparedStatement prepStm = con.prepareStatement(query);
            ResultSet res = prepStm.executeQuery();
           
            while(res.next()){
                String rateTier = res.getString("rate_tier");
                String unitsRange = res.getString("units_range");
                String costPerunit = res.getString("cost_per_unit");
                
                String data[] = {rateTier, unitsRange, costPerunit};
                model.addRow(data);
            }
            
            res.close();
            prepStm.close();
            con.close();
            
            } catch (SQLException excp) {
                System.out.println(excp.getMessage());
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sep1 = new javax.swing.JPanel();
        lblEcoPulseLimited = new javax.swing.JLabel();
        BillingRatesScrollPanel = new javax.swing.JScrollPane();
        CustomerInterfaceBillingRates = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Billing Rates");

        Sep1.setBackground(new java.awt.Color(0, 153, 153));

        lblEcoPulseLimited.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblEcoPulseLimited.setForeground(new java.awt.Color(102, 102, 102));
        lblEcoPulseLimited.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEcoPulseLimited.setText("EcoPulse Private Limited");

        CustomerInterfaceBillingRates.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CustomerInterfaceBillingRates.setForeground(new java.awt.Color(102, 102, 102));
        CustomerInterfaceBillingRates.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rate Tier", "Units Range", "Cost Per Unit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CustomerInterfaceBillingRates.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CustomerInterfaceBillingRates.setFocusable(false);
        CustomerInterfaceBillingRates.setGridColor(new java.awt.Color(204, 204, 204));
        CustomerInterfaceBillingRates.setName("Billing Rates"); // NOI18N
        CustomerInterfaceBillingRates.setRowHeight(30);
        CustomerInterfaceBillingRates.setSelectionBackground(new java.awt.Color(102, 102, 102));
        CustomerInterfaceBillingRates.setSelectionForeground(new java.awt.Color(255, 255, 255));
        CustomerInterfaceBillingRates.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        CustomerInterfaceBillingRates.getTableHeader().setReorderingAllowed(false);
        BillingRatesScrollPanel.setViewportView(CustomerInterfaceBillingRates);

        javax.swing.GroupLayout Sep1Layout = new javax.swing.GroupLayout(Sep1);
        Sep1.setLayout(Sep1Layout);
        Sep1Layout.setHorizontalGroup(
            Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(Sep1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BillingRatesScrollPanel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Sep1Layout.createSequentialGroup()
                        .addComponent(lblEcoPulseLimited, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Sep1Layout.setVerticalGroup(
            Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sep1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblEcoPulseLimited, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BillingRatesScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sep1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sep1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CustomerInterfaceBillingRates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInterfaceBillingRates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInterfaceBillingRates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInterfaceBillingRates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BillingRatesScrollPanel;
    private javax.swing.JTable CustomerInterfaceBillingRates;
    private javax.swing.JPanel Sep1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEcoPulseLimited;
    // End of variables declaration//GEN-END:variables
}
