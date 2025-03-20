/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpack;

import admindash.adminframe;
import config.dbConnector;
import config.hashpass;
import config.session;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import registerpack.registration;
import userpack.userframe;
import welcome.welcome;


public class login extends javax.swing.JFrame {

   
    public login() {
        initComponents();
    }
    
    static String status;
    static String roles;
    
    public static boolean loginAcc(String username, String password) {
    dbConnector connector = new dbConnector();
    try {
        String query = "SELECT u_id, u_fname, u_lname, u_email, u_username, u_role, u_status, u_password FROM tbl_users WHERE u_username = '" + username + "'";
        ResultSet resultSet = connector.getData(query);

        if (resultSet.next()) {
            String storedHashedPassword = resultSet.getString("u_password");

            if (hashpass.verifyPassword(password, storedHashedPassword)) {
                status = resultSet.getString("u_status");
                roles = resultSet.getString("u_role");

                // Store user session details
                session ses = session.getInstance();
                ses.setUid(resultSet.getInt("u_id"));
                ses.setFname(resultSet.getString("u_fname"));
                ses.setLname(resultSet.getString("u_lname"));
                ses.setEmail(resultSet.getString("u_email"));
                ses.setUsername(resultSet.getString("u_username"));
                ses.setRole(resultSet.getString("u_role"));
                ses.setStatus(resultSet.getString("u_status"));

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Credentials!");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "User not found!");
            return false;
        }
    } catch (Exception e) {
        System.out.println("Error: " + e);
        return false;
    }
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelBorder3 = new swing.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        button1 = new swing.Button();
        jLabel3 = new javax.swing.JLabel();
        user = new swing.TextField();
        pass = new swing.PasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(225, 223, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(223, 120, 141));
        jLabel2.setText("Login");

        jLabel1.setForeground(new java.awt.Color(223, 120, 141));
        jLabel1.setText("Get Started");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        button1.setBackground(new java.awt.Color(223, 120, 141));
        button1.setForeground(new java.awt.Color(114, 114, 114));
        button1.setText("Login");
        button1.setAutoscrolls(true);
        button1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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

        jLabel3.setForeground(new java.awt.Color(114, 114, 114));
        jLabel3.setText("Don't have an Account?");

        user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user.setLabelText("Username");

        pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass.setLabelText("Password");

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 38, Short.MAX_VALUE))
        );
        panelBorder3Layout.setVerticalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel1.add(panelBorder3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 350, 400));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/desgin.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, -70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1018, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        
        if(loginAcc(user.getText(),pass.getText())){
            if(!status.equals("Active")){
                JOptionPane.showMessageDialog(null,"In-Active acocunt, Contact the Admin!");
            }else{
                JOptionPane.showMessageDialog(null,"Login Successfully!");
                    if(roles.equals("Admin")){
                        adminframe af = new adminframe();
                        af.setVisible(true);
                        this.dispose();
                    }else if(roles.equals("User")){
                        userframe usr = new userframe();
                        usr.setVisible(true);
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null,"No acocunt role found, Contact the Admin!");
                    }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Account Does not Exist!");
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
        button1.setBackground(new java.awt.Color(205, 13, 50));
    }//GEN-LAST:event_button1MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
        button1.setBackground(new java.awt.Color(223,120,141));
    }//GEN-LAST:event_button1MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        welcome wlc = new welcome();
        wlc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        registration rgs = new registration();
        rgs.setVisible(true);
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private swing.PanelBorder panelBorder3;
    private swing.PasswordField pass;
    private swing.TextField user;
    // End of variables declaration//GEN-END:variables
}
