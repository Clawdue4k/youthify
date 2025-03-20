
package admindash;

import config.session;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import loginpack.login;




public class adminframe extends javax.swing.JFrame {

    
    private int menuX; // Store the X position of menu2
    private Timer timer;
    private boolean isMenuVisible = true; // Track menu visibility

    public adminframe() {
        initComponents();
        menuX = menu.getX();
    }
    
    private void toggleMenu() {
    int targetX = isMenuVisible ? -menu.getWidth() + 50 : 0; // Leave a 5-pixel gap when hidden

    timer = new Timer(10, e -> {
        if (isMenuVisible && menuX > targetX) {
            menuX -= 10; // Move left
        } else if (!isMenuVisible && menuX < targetX) {
            menuX += 10; // Move right
        } else {
            ((Timer) e.getSource()).stop();
            isMenuVisible = !isMenuVisible; // Toggle state
        }
        menu.setLocation(menuX, menu.getY());
    });

    timer.start();
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new admindash.Menu();
        jButton1 = new javax.swing.JButton();
        userbutton2 = new admindash.userbutton();
        acc_fname = new javax.swing.JLabel();
        acc_lname = new javax.swing.JLabel();
        acc_role = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(225, 223, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("||");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        acc_fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acc_fname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_fname.setText("Fname");
        acc_fname.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        acc_lname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acc_lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_lname.setText("Lname");
        acc_lname.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        acc_role.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        acc_role.setForeground(new java.awt.Color(153, 153, 153));
        acc_role.setText("Role");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/favicon.png"))); // NOI18N

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userbutton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(141, 141, 141))))
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(acc_role)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(acc_fname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acc_lname)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jButton1)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acc_fname)
                    .addComponent(acc_lname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acc_role)
                .addGap(54, 54, 54)
                .addComponent(userbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 230, 500));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(114, 114, 114));
        jLabel4.setText("ADMIN DASHBOARD");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1018, 648));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        toggleMenu();
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

    }//GEN-LAST:event_jLabel4MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        session ses = session.getInstance();
        
        if(ses.getUid()==0){
            JOptionPane.showMessageDialog(null, "No account, Please login first.");
            login lg = new login();
            lg.setVisible(true);
            this.dispose();
        }else{
            acc_fname.setText(""+ses.getFname());
            acc_lname.setText(""+ses.getLname());
            acc_role.setText(ses.getRole() != null ? ses.getRole() : "No role assigned");
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
            java.util.logging.Logger.getLogger(adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_fname;
    private javax.swing.JLabel acc_lname;
    private javax.swing.JLabel acc_role;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private admindash.Menu menu;
    private admindash.userbutton userbutton2;
    // End of variables declaration//GEN-END:variables
}
