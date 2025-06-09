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
public class CustomerInterfaceInfo extends javax.swing.JFrame {

    // Creating Default Table Model To Insert & Delete Data
    DefaultTableModel model;
    
    public CustomerInterfaceInfo(String accNo) {
        initComponents();
        
        // To Center the table header text
        ((DefaultTableCellRenderer) CustomerInterfaceInfo.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(javax.swing.JLabel.CENTER);
        
        // Set column auto resizable
        CustomerInterfaceInfo.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        
        // Default Table Model Initialization
        model = (DefaultTableModel) CustomerInterfaceInfo.getModel();
        
         // JDBC Connection
        
         // URL, USERNAME, PASSWORD
        String url = "jdbc:mysql://localhost:3306/electricitybillingsystem";
        String username = "root";
        String password = "noemak";
    
        // Establishing Connection
        try {
            String accountNo, meterNo, name, contactNo, address;
            accountNo = meterNo = name = contactNo = address = "";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully!");
            String query = "SELECT * FROM customers WHERE account_number = " + accNo + ";";
            PreparedStatement prepStm = con.prepareStatement(query);
            ResultSet res = prepStm.executeQuery();
            
            String query2 = "SELECT meter_number FROM meters_list WHERE account_number = " + accNo + ";";
            PreparedStatement prepStm2 = con.prepareStatement(query2);
            ResultSet res2 = prepStm2.executeQuery();
            
            while(res.next()){
                while(res2.next())
                     meterNo = res2.getString("meter_number");
                
                accountNo = res.getString("account_number");
                name = res.getString("name");
                contactNo = res.getString("contact_no");
                address = res.getString("address");
                
                String data[] = {accountNo, meterNo, name, contactNo, address};
                model.addRow(data);
            }
                
            res.close();
            res2.close();
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
        InfoScrollPanel = new javax.swing.JScrollPane();
        CustomerInterfaceInfo = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Interface Info");

        Sep1.setBackground(new java.awt.Color(0, 153, 153));

        lblEcoPulseLimited.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblEcoPulseLimited.setForeground(new java.awt.Color(102, 102, 102));
        lblEcoPulseLimited.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEcoPulseLimited.setText("EcoPulse Private Limited");

        CustomerInterfaceInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CustomerInterfaceInfo.setForeground(new java.awt.Color(102, 102, 102));
        CustomerInterfaceInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account No", "Meter No", "Name", "Contact No", "Address"
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
        CustomerInterfaceInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CustomerInterfaceInfo.setFocusable(false);
        CustomerInterfaceInfo.setGridColor(new java.awt.Color(204, 204, 204));
        CustomerInterfaceInfo.setName("Info"); // NOI18N
        CustomerInterfaceInfo.setRowHeight(30);
        CustomerInterfaceInfo.setSelectionBackground(new java.awt.Color(102, 102, 102));
        CustomerInterfaceInfo.setSelectionForeground(new java.awt.Color(255, 255, 255));
        CustomerInterfaceInfo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        CustomerInterfaceInfo.getTableHeader().setReorderingAllowed(false);
        InfoScrollPanel.setViewportView(CustomerInterfaceInfo);

        javax.swing.GroupLayout Sep1Layout = new javax.swing.GroupLayout(Sep1);
        Sep1.setLayout(Sep1Layout);
        Sep1Layout.setHorizontalGroup(
            Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sep1Layout.createSequentialGroup()
                .addGap(794, 794, 794)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
            .addGroup(Sep1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Sep1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEcoPulseLimited, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InfoScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE))
                .addContainerGap())
        );
        Sep1Layout.setVerticalGroup(
            Sep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sep1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblEcoPulseLimited, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(InfoScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(CustomerInterfaceInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInterfaceInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInterfaceInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInterfaceInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerInterfaceInfo;
    private javax.swing.JScrollPane InfoScrollPanel;
    private javax.swing.JPanel Sep1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEcoPulseLimited;
    // End of variables declaration//GEN-END:variables
}
