
package admindash;

import config.dbConnector;
import config.session;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class usersform extends javax.swing.JFrame {

    
    public usersform() {
        initComponents();
        displayData();
    }

    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT u_id, u_fname, u_lname, u_email, u_status FROM tbl_users");
            usersTable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        button1 = new swing.Button();
        b_add = new swing.Button();
        b_edit = new swing.Button();

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
        jLabel4.setText("USERS FORMS");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usersTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 720, 470));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Current User:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        acc_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acc_id.setText("ID:");
        jPanel1.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, -1));

        button1.setBackground(new java.awt.Color(223, 120, 141));
        button1.setForeground(new java.awt.Color(114, 114, 114));
        button1.setText("Back");
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
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 70, 30));

        b_add.setBackground(new java.awt.Color(223, 120, 141));
        b_add.setForeground(new java.awt.Color(114, 114, 114));
        b_add.setText("ADD");
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
        jPanel1.add(b_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 210, -1));

        b_edit.setBackground(new java.awt.Color(223, 120, 141));
        b_edit.setForeground(new java.awt.Color(114, 114, 114));
        b_edit.setText("EDIT");
        b_edit.setAutoscrolls(true);
        b_edit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_editMouseExited(evt);
            }
        });
        b_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editActionPerformed(evt);
            }
        });
        jPanel1.add(b_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1018, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

    }//GEN-LAST:event_jLabel4MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       session ses = session.getInstance();
       acc_id.setText(""+ses.getUid());
    }//GEN-LAST:event_formWindowActivated

    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
        button1.setBackground(new java.awt.Color(205, 13, 50));
    }//GEN-LAST:event_button1MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
        button1.setBackground(new java.awt.Color(223,120,141));
    }//GEN-LAST:event_button1MouseExited

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        adminframe af = new adminframe();
        af.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void b_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_addMouseEntered
        b_add.setBackground(new java.awt.Color(205, 13, 50));
    }//GEN-LAST:event_b_addMouseEntered

    private void b_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_addMouseExited
        b_add.setBackground(new java.awt.Color(223,120,141));
    }//GEN-LAST:event_b_addMouseExited

    private void b_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_addActionPerformed
        createuserforms cuf = new createuserforms();
        cuf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b_addActionPerformed

    private void b_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_editMouseEntered
        b_edit.setBackground(new java.awt.Color(205, 13, 50));
    }//GEN-LAST:event_b_editMouseEntered

    private void b_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_editMouseExited
        b_edit.setBackground(new java.awt.Color(223,120,141));
    }//GEN-LAST:event_b_editMouseExited

    private void b_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editActionPerformed
        int rowIndex = usersTable.getSelectedRow();
       
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null,"Please select an Item");
       }else{
           
           try{
           dbConnector dbc = new dbConnector();
           TableModel tbl = usersTable.getModel();
           ResultSet rs = dbc.getData("SELECT * FROM tbl_users WHERE u_id = '"+tbl.getValueAt(rowIndex, 0   )+"'");

           
           if(rs.next()){
               createuserforms cuf = new createuserforms();
               cuf.uid.setText(""+rs.getInt("u_id"));
               cuf.fname.setText(""+rs.getString("u_fname"));
               cuf.lname.setText(""+rs.getString("u_lname"));
               cuf.eml.setText(""+rs.getString("u_email"));
               cuf.uname.setText(""+rs.getString("u_username"));
               cuf.ps.setText(""+rs.getString("u_password"));
               cuf.role.setSelectedItem(""+rs.getString("u_role"));
               cuf.us.setSelectedItem(""+rs.getString("u_status"));
               cuf.addb.setEnabled(false);
               cuf.upb.setEnabled(true);
               cuf.setVisible(true);
               this.dispose();
          
              }
           }catch(SQLException ex){
               System.out.println(""+ex);
           }
       } 
    }//GEN-LAST:event_b_editActionPerformed

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
            java.util.logging.Logger.getLogger(usersform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usersform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_id;
    private swing.Button b_add;
    private swing.Button b_edit;
    private swing.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
