/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userpack;

import config.dbConnector;
import config.hashpass;
import config.session;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import loginpack.login;

/**
 *
 * @author SCC-PC
 */
public class usersdetails extends javax.swing.JFrame {

    private String userRole;
    
    public usersdetails() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        iddisplay = new javax.swing.JLabel();
        fname = new swing.TextField();
        lname = new swing.TextField();
        eml = new swing.TextField();
        uname = new swing.TextField();
        b_add = new swing.Button();
        fn = new javax.swing.JLabel();
        ln = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(225, 223, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(114, 114, 114));
        jLabel4.setText("ACCOUNT DETAILS ");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        iddisplay.setBackground(new java.awt.Color(255, 255, 255));
        iddisplay.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 35)); // NOI18N
        iddisplay.setForeground(new java.awt.Color(114, 114, 114));
        iddisplay.setText("(UID)");
        iddisplay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iddisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iddisplayMouseClicked(evt);
            }
        });
        jPanel1.add(iddisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fname.setLabelText("First Name");
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 190, -1));

        lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lname.setLabelText("Last Name");
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 190, -1));

        eml.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eml.setLabelText("Email");
        jPanel1.add(eml, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 390, -1));

        uname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uname.setLabelText("Username");
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 390, -1));

        b_add.setBackground(new java.awt.Color(223, 120, 141));
        b_add.setForeground(new java.awt.Color(114, 114, 114));
        b_add.setText("CHANGE PASS");
        b_add.setAutoscrolls(true);
        b_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_addMouseExited(evt);
            }
        });
        b_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_addActionPerformed(evt);
            }
        });
        jPanel1.add(b_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 210, -1));

        fn.setText("jLabel1");
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        ln.setText("jLabel2");
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1016, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

    }//GEN-LAST:event_jLabel4MouseClicked

    private void iddisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iddisplayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_iddisplayMouseClicked

    private void b_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_addMouseEntered
        b_add.setBackground(new java.awt.Color(205, 13, 50));
    }//GEN-LAST:event_b_addMouseEntered

    private void b_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_addMouseExited
        b_add.setBackground(new java.awt.Color(223,120,141));
    }//GEN-LAST:event_b_addMouseExited

    private void b_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_addActionPerformed
        changepass cp = new changepass();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b_addActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        session ses = session.getInstance();
        
        if(ses.getUid()==0){
            JOptionPane.showMessageDialog(null, "No account login first!");
            login lg = new login();
            lg.setVisible(true);
            this.dispose();
        }else{
            iddisplay.setText("USER ID:"+ses.getUid());
            fn.setText(""+ses.getFname());
            ln.setText(""+ses.getLname());
            fname.setText(""+ses.getFname());
            lname.setText(""+ses.getLname());
            eml.setText(""+ses.getEmail());
            uname.setText(""+ses.getUsername());
        }
        
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(usersdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usersdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button b_add;
    public swing.TextField eml;
    private javax.swing.JLabel fn;
    public swing.TextField fname;
    private javax.swing.JLabel iddisplay;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ln;
    public swing.TextField lname;
    public swing.TextField uname;
    // End of variables declaration//GEN-END:variables
}
