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
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class CustomerInterfaceMeterReadings extends javax.swing.JFrame {

    // Creating Default Table Model To Insert & Delete Data
    DefaultTableModel model;
    
    public CustomerInterfaceMeterReadings() {
        initComponents();
        
         // To Center the table header text
        ((DefaultTableCellRenderer) CustomerInterfaceMeterReadings.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(javax.swing.JLabel.CENTER);
        
        // Default Table Model Initialization
        model = (DefaultTableModel) CustomerInterfaceMeterReadings.getModel();
        
        // Set column auto resizable
        CustomerInterfaceMeterReadings.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sep1 = new javax.swing.JPanel();
        lblEcoPulseLimited = new javax.swing.JLabel();
        MeterReadingsScrollPanel = new javax.swing.JScrollPane();
        CustomerInterfaceMeterReadings = new javax.swing.JTable();
        lblMeterNo = new javax.swing.JLabel();
        txtMeterNo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Sep2 = new javax.swing.JSeparator();
        btnCustomerInterfaceMeterReadingSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Meter Readings");

        Sep1.setBackground(new java.awt.Color(0, 153, 153));

        lblEcoPulseLimited.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblEcoPulseLimited.setForeground(new java.awt.Color(102, 102, 102));
        lblEcoPulseLimited.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEcoPulseLimited.setText("EcoPulse Private Limited");

        CustomerInterfaceMeterReadings.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CustomerInterfaceMeterReadings.setForeground(new java.awt.Color(102, 102, 102));
        CustomerInterfaceMeterReadings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meter Reading ID", "Consumed Units", "Month", "Year", "Rate Tier"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CustomerInterfaceMeterReadings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CustomerInterfaceMeterReadings.setFocusable(false);
        CustomerInterfaceMeterReadings.setGridColor(new java.awt.Color(204, 204, 204));
        CustomerInterfaceMeterReadings.setName("Meter Readings"); // NOI18N
        CustomerInterfaceMeterReadings.setRowHeight(30);
        CustomerInterfaceMeterReadings.setSelectionBackground(new java.awt.Color(102, 102, 102));
        CustomerInterfaceMeterReadings.setSelectionForeground(new java.awt.Color(255, 255, 255));
        CustomerInterfaceMeterReadings.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        CustomerInterfaceMeterReadings.getTableHeader().setReorderingAllowed(false);
        MeterReadingsScrollPanel.setViewportView(CustomerInterfaceMeterReadings);

        lblMeterNo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMeterNo.setForeground(new java.awt.Color(102, 102, 102));
        lblMeterNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMeterNo.setText("Meter No");

        txtMeterNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMeterNo.setForeground(new java.awt.Color(102, 102, 102));
        txtMeterNo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));

        btnCustomerInterfaceMeterReadingSearch.setBackground(new java.awt.Color(102, 102, 102));
        btnCustomerInterfaceMeterReadingSearch.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        btnCustomerInterfaceMeterReadingSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomerInterfaceMeterReadingSearch.setText("Search");
        btnCustomerInterfaceMeterReadingSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));
        btnCustomerInterfaceMeterReadingSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCustomerInterfaceMeterReadingSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCustomerInterfaceMeterReadingSearchMouseExited(evt);
            }
        });
        btnCustomerInterfaceMeterReadingSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerInterfaceMeterReadingSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Sep1Layout = new javax.swing.GroupLayout(Sep1);
        Sep1.setLayout(Sep1Layout);
        Sep1Layout.setHorizontalGroup(
            Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(Sep1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEcoPulseLimited, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Sep1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMeterNo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMeterNo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCustomerInterfaceMeterReadingSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(Sep1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MeterReadingsScrollPanel)
                .addContainerGap())
            .addGroup(Sep1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Sep2)
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
                .addComponent(MeterReadingsScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Sep2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblMeterNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMeterNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerInterfaceMeterReadingSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void btnCustomerInterfaceMeterReadingSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerInterfaceMeterReadingSearchMouseEntered
        // TODO add your handling code here:
        btnCustomerInterfaceMeterReadingSearch.setBackground(new Color(255, 255, 255));
        btnCustomerInterfaceMeterReadingSearch.setForeground(new Color(102, 102, 102));
        btnCustomerInterfaceMeterReadingSearch.setBorder(new MatteBorder(4, 4, 4, 4, new Color(102, 102, 102)));
        btnCustomerInterfaceMeterReadingSearch.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnCustomerInterfaceMeterReadingSearchMouseEntered

    private void btnCustomerInterfaceMeterReadingSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerInterfaceMeterReadingSearchMouseExited
        // TODO add your handling code here:
        btnCustomerInterfaceMeterReadingSearch.setBackground(new Color(102, 102, 102));
        btnCustomerInterfaceMeterReadingSearch.setForeground(new Color(255, 255, 255));
        btnCustomerInterfaceMeterReadingSearch.setBorder(new MatteBorder(4, 4, 4, 4, new Color(255, 255, 255)));
        btnCustomerInterfaceMeterReadingSearch.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnCustomerInterfaceMeterReadingSearchMouseExited

    private void btnCustomerInterfaceMeterReadingSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerInterfaceMeterReadingSearchActionPerformed
        // TODO add your handling code here:
        
         // JDBC Connection
        
         // URL, USERNAME, PASSWORD
        String url = "jdbc:mysql://localhost:3306/electricitybillingsystem";
        String username = "root";
        String password = "noemak";
    
        // Establishing Connection
        try {
            String meterNo, meter_reading_ID, consumed_units, month, year, rateTier;
            meter_reading_ID = consumed_units = month = year = rateTier = "";
            meterNo = txtMeterNo.getText();
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully!");
            String query = "SELECT * FROM meter_readings WHERE meter_number = " + meterNo + ";";
            PreparedStatement prepStm = con.prepareStatement(query);
            ResultSet res = prepStm.executeQuery();
            
            while(res.next()){
                meter_reading_ID = res.getString("meter_reading_ID");
                consumed_units = res.getString("consumed_units");
                month = res.getString("month");
                year = res.getString("year");
                rateTier = res.getString("rate_tier");
                
                String data[] = {meter_reading_ID, consumed_units, month, year, rateTier};
                model.addRow(data);
            }
                
            res.close();
            prepStm.close();
            con.close();
            
            } catch (SQLException excp) {
                System.out.println(excp.getMessage());
            }
    }//GEN-LAST:event_btnCustomerInterfaceMeterReadingSearchActionPerformed


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
            java.util.logging.Logger.getLogger(CustomerInterfaceMeterReadings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInterfaceMeterReadings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInterfaceMeterReadings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInterfaceMeterReadings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerInterfaceMeterReadings;
    private javax.swing.JScrollPane MeterReadingsScrollPanel;
    private javax.swing.JPanel Sep1;
    private javax.swing.JSeparator Sep2;
    private javax.swing.JButton btnCustomerInterfaceMeterReadingSearch;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEcoPulseLimited;
    private javax.swing.JLabel lblMeterNo;
    private javax.swing.JTextField txtMeterNo;
    // End of variables declaration//GEN-END:variables
}
