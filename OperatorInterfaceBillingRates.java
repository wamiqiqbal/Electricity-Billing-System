/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electricitybillingsystem;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noem Ahmed Khan
 */
public class OperatorInterfaceBillingRates extends javax.swing.JFrame {

    // Creating Default Table Model To Insert & Delete Data
    DefaultTableModel model;

    public OperatorInterfaceBillingRates() {
        initComponents();
        
         // To Center the table header text
        ((DefaultTableCellRenderer) OperatorInterfaceBillingRates.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(javax.swing.JLabel.CENTER);
        
        // Default Table Model Initialization
        model = (DefaultTableModel) OperatorInterfaceBillingRates.getModel();

        // Set column auto resizable
        OperatorInterfaceBillingRates.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        
        
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sep1 = new javax.swing.JPanel();
        lblEcoPulseLimited = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        BillingRatesScrollPanel = new javax.swing.JScrollPane();
        OperatorInterfaceBillingRates = new javax.swing.JTable();
        lblRateTier = new javax.swing.JLabel();
        lblCostPerUnit = new javax.swing.JLabel();
        lblUnitsRange = new javax.swing.JLabel();
        txtCostPerUnit = new javax.swing.JTextField();
        txtRateTier = new javax.swing.JTextField();
        txtUnitsRange = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Sep2 = new javax.swing.JSeparator();
        Sep3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Billing Rates");

        Sep1.setBackground(new java.awt.Color(0, 153, 153));

        lblEcoPulseLimited.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblEcoPulseLimited.setForeground(new java.awt.Color(102, 102, 102));
        lblEcoPulseLimited.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEcoPulseLimited.setText("EcoPulse Private Limited");

        btnAdd.setBackground(new java.awt.Color(102, 102, 102));
        btnAdd.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 102, 102));
        btnDelete.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        OperatorInterfaceBillingRates.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OperatorInterfaceBillingRates.setForeground(new java.awt.Color(102, 102, 102));
        OperatorInterfaceBillingRates.setModel(new javax.swing.table.DefaultTableModel(
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
        OperatorInterfaceBillingRates.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OperatorInterfaceBillingRates.setFocusable(false);
        OperatorInterfaceBillingRates.setGridColor(new java.awt.Color(204, 204, 204));
        OperatorInterfaceBillingRates.setName("Billing Rates"); // NOI18N
        OperatorInterfaceBillingRates.setRowHeight(30);
        OperatorInterfaceBillingRates.setSelectionBackground(new java.awt.Color(102, 102, 102));
        OperatorInterfaceBillingRates.setSelectionForeground(new java.awt.Color(255, 255, 255));
        OperatorInterfaceBillingRates.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        OperatorInterfaceBillingRates.getTableHeader().setReorderingAllowed(false);
        BillingRatesScrollPanel.setViewportView(OperatorInterfaceBillingRates);

        lblRateTier.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRateTier.setForeground(new java.awt.Color(102, 102, 102));
        lblRateTier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRateTier.setText("Rate Tier");

        lblCostPerUnit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCostPerUnit.setForeground(new java.awt.Color(102, 102, 102));
        lblCostPerUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCostPerUnit.setText("Cost Per Unit");

        lblUnitsRange.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUnitsRange.setForeground(new java.awt.Color(102, 102, 102));
        lblUnitsRange.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUnitsRange.setText("Units Range");

        txtCostPerUnit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCostPerUnit.setForeground(new java.awt.Color(102, 102, 102));
        txtCostPerUnit.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));

        txtRateTier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtRateTier.setForeground(new java.awt.Color(102, 102, 102));
        txtRateTier.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));

        txtUnitsRange.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUnitsRange.setForeground(new java.awt.Color(102, 102, 102));
        txtUnitsRange.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout Sep1Layout = new javax.swing.GroupLayout(Sep1);
        Sep1.setLayout(Sep1Layout);
        Sep1Layout.setHorizontalGroup(
            Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(Sep2)
            .addGroup(Sep1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sep1Layout.createSequentialGroup()
                        .addGroup(Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BillingRatesScrollPanel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Sep3)
                            .addGroup(Sep1Layout.createSequentialGroup()
                                .addGroup(Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEcoPulseLimited, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Sep1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtRateTier)
                                            .addComponent(lblRateTier, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                                        .addGap(38, 38, 38)
                                        .addGroup(Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUnitsRange, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblUnitsRange, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37)
                                        .addGroup(Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCostPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCostPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sep1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
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
                .addGap(31, 31, 31)
                .addComponent(Sep2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCostPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnitsRange, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRateTier, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnitsRange, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRateTier, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Sep3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        // TODO add your handling code here:
        btnAdd.setBackground(new Color(255, 255, 255));
        btnAdd.setForeground(new Color(102, 102, 102));
        btnAdd.setBorder(new MatteBorder(4, 4, 4, 4, new Color(102, 102, 102)));
        btnAdd.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        // TODO add your handling code here:
        btnAdd.setBackground(new Color(102, 102, 102));
        btnAdd.setForeground(new Color(255, 255, 255));
        btnAdd.setBorder(new MatteBorder(4, 4, 4, 4, new Color(255, 255, 255)));
        btnAdd.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnAddMouseExited

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String rateTier, unitsRange, costPerUnit;
        rateTier = txtRateTier.getText();
        unitsRange = txtUnitsRange.getText();
        costPerUnit = txtCostPerUnit.getText();
        String[] data = {rateTier, unitsRange, costPerUnit};

        // Adding values into the table
        model.addRow(data);

        // Setting fields empty
        txtCostPerUnit.setText("");
        txtRateTier.setText("");
        txtUnitsRange.setText("");
        
        // Adding values to the database
        // JDBC Connection
        
        // URL, USERNAME, PASSWORD
        String url = "jdbc:mysql://localhost:3306/electricitybillingsystem";
        String username = "root";
        String password = "noemak";
    
        // Establishing Connection
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully!");
            String query = "INSERT INTO Billing_Rates(rate_tier, units_range, cost_per_unit) VALUES (?, ?, ?);";
            PreparedStatement prepStm = con.prepareStatement(query);
            prepStm.setString(1, rateTier);
            prepStm.setString(2, unitsRange);
            prepStm.setString(3, costPerUnit);
            prepStm.executeUpdate();
           
            prepStm.close();
            con.close();
            
        } catch (SQLException excp) {
            System.out.println(excp.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
        btnDelete.setBackground(new Color(255, 255, 255));
        btnDelete.setForeground(new Color(102, 102, 102));
        btnDelete.setBorder(new MatteBorder(4, 4, 4, 4, new Color(102, 102, 102)));
        btnDelete.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
        btnDelete.setBackground(new Color(102, 102, 102));
        btnDelete.setForeground(new Color(255, 255, 255));
        btnDelete.setBorder(new MatteBorder(4, 4, 4, 4, new Color(255, 255, 255)));
        btnDelete.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = OperatorInterfaceBillingRates.getSelectedRow();

        if (selectedRow != -1) {
             // Deleting row from the database
             // JDBC Connection
        
             // URL, USERNAME, PASSWORD
             String url = "jdbc:mysql://localhost:3306/electricitybillingsystem";
             String username = "root";
             String password = "noemak";
    
             // Establishing Connection
            try {
                  Connection con = DriverManager.getConnection(url, username, password);
                  System.out.println("Connection Established Successfully!");
                  String rateTier = OperatorInterfaceBillingRates.getValueAt(selectedRow, 0).toString();
                  String query = "DELETE FROM Billing_Rates WHERE rate_tier = " + rateTier + ";";
                  PreparedStatement prepStm = con.prepareStatement(query);
                  int rowsAffected = prepStm.executeUpdate();
           
                  prepStm.close();
                  con.close();
            
                } catch (SQLException excp) {
                    System.out.println(excp.getMessage());
                }
            
            // Remove selected row
            model.removeRow(selectedRow);
        } else {
            // Show message if no row is selected
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(OperatorInterfaceBillingRates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperatorInterfaceBillingRates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperatorInterfaceBillingRates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperatorInterfaceBillingRates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BillingRatesScrollPanel;
    private javax.swing.JTable OperatorInterfaceBillingRates;
    private javax.swing.JPanel Sep1;
    private javax.swing.JSeparator Sep2;
    private javax.swing.JSeparator Sep3;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCostPerUnit;
    private javax.swing.JLabel lblEcoPulseLimited;
    private javax.swing.JLabel lblRateTier;
    private javax.swing.JLabel lblUnitsRange;
    private javax.swing.JTextField txtCostPerUnit;
    private javax.swing.JTextField txtRateTier;
    private javax.swing.JTextField txtUnitsRange;
    // End of variables declaration//GEN-END:variables
}
