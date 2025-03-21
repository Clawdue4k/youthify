/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerpack;

import config.dbConnector;
import config.hashpass;
import loginpack.login;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Aubrey Rose Undang
 */
public class registration extends javax.swing.JFrame {

    /**
     * Creates new form registration
     */
    public registration() {
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 255));
    }
    
    public static String email, usrname;
    
    public boolean duplicatedChecker() {
    dbConnector dbc = new dbConnector();
    try {
        String query = "SELECT u_email, u_username FROM tbl_users WHERE u_username = '" + uname.getText() + "' OR u_email = '" + eml.getText() + "'";
        ResultSet resultSet = dbc.getData(query);
        
        boolean duplicate = false; // Flag to track duplicates
        
        while (resultSet.next()) { // Loop through results (if any)
            email = resultSet.getString("u_email");
            usrname = resultSet.getString("u_username");
            
            if (email.equals(eml.getText())) {
                JOptionPane.showMessageDialog(null, "Email already used!");
                eml.setText("");
                duplicate = true;
            }
            
            if (usrname.equals(uname.getText())) {
                JOptionPane.showMessageDialog(null, "Username already used!");
                uname.setText("");
                duplicate = true;
            }
        }
        
        return duplicate;
    } catch (SQLException ex) {
        System.out.println("SQL Error: " + ex);
        return true; // Assume duplicate to avoid inserting problematic data
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

        Rolebutton = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eml = new swing.TextField();
        lname = new swing.TextField();
        uname = new swing.TextField();
        ps = new swing.PasswordField();
        fname = new swing.TextField();
        role = new swing.Combobox();
        button1 = new swing.Button();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(225, 223, 228));
        jPanel2.setAutoscrolls(true);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(114, 114, 114));
        jLabel4.setText("Youthify");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(537, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 600));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(223, 120, 141));
        jLabel2.setText("Sign Up");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        eml.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eml.setLabelText("Email");
        jPanel1.add(eml, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 390, -1));

        lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lname.setLabelText("Last Name");
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 190, -1));

        uname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uname.setLabelText("Username");
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 190, -1));

        ps.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ps.setLabelText("Password");
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        jPanel1.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 190, -1));

        fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fname.setLabelText("First Name");
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 190, -1));

        role.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "User" }));
        role.setSelectedIndex(-1);
        role.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        role.setLabeText("Select Role");
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 390, -1));

        button1.setBackground(new java.awt.Color(223, 120, 141));
        button1.setForeground(new java.awt.Color(114, 114, 114));
        button1.setText("Sign Up");
        button1.setAutoscrolls(true);
        button1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1MouseExited(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 510, 140, -1));

        jLabel3.setForeground(new java.awt.Color(114, 114, 114));
        jLabel3.setText("Already have an Account?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, -1, -1));

        jLabel1.setForeground(new java.awt.Color(223, 120, 141));
        jLabel1.setText("Click Me");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1017, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psActionPerformed

    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
        button1.setBackground(new java.awt.Color(205, 13, 50));
    }//GEN-LAST:event_button1MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
        button1.setBackground(new java.awt.Color(223,120,141));
    }//GEN-LAST:event_button1MouseExited

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
            
        if(fname.getText().isEmpty()||lname.getText().isEmpty()||eml.getText().isEmpty()||uname.getText().isEmpty()||ps.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Feilds are required!");
            return;
        }else if(ps.getText().length()<8){
            JOptionPane.showMessageDialog(null, "Password must be 8 characters above!");
            ps.setText("");
            return;
        }else if(duplicatedChecker()){
            System.out.println("Duplicate Exist");
            return;
        }else{
            
            dbConnector dbc = new dbConnector();
            
            try {
        String pass = hashpass.hashPassword(ps.getText()); // Hash password before storing

        if (dbc.insertData("INSERT INTO tbl_users (u_fname, u_lname, u_email, u_username, u_password, u_role, u_status) "
                + "VALUES ('" + fname.getText() + "','" + lname.getText() + "','" + eml.getText() + "','" 
                + uname.getText() + "','" + pass + "','" + role.getSelectedItem() + "','Inactive')")) 
        {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            login lg = new login();
            lg.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }
    } catch (NoSuchAlgorithmException ex) {
        System.out.println("" + ex);
    }

    }     
        
    }//GEN-LAST:event_button1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        login lg = new login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Rolebutton;
    private swing.Button button1;
    private swing.TextField eml;
    private swing.TextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private swing.TextField lname;
    private swing.PasswordField ps;
    private swing.Combobox role;
    private swing.TextField uname;
    // End of variables declaration//GEN-END:variables
}
