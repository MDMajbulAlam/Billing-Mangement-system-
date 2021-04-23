
import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Majbul Rahman
 */
public class AdminUpdate extends javax.swing.JFrame {

    /**
     * Creates new form AdminUpdate
     */
    public AdminUpdate() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        AdminID = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Update = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(580, 160));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("ADMIN UPDATE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 130));

        jPanel2.setBackground(new java.awt.Color(153, 51, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" ADMIN ID");

        AdminID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AdminID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AdminIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AdminIDFocusLost(evt);
            }
        });
        AdminID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminIDActionPerformed(evt);
            }
        });

        Search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searching.png"))); // NOI18N
        Search.setText(" SEARCH");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Admin Name");

        Name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameFocusLost(evt);
            }
        });
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Admin Password");

        Password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFocusLost(evt);
            }
        });
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reset1.png"))); // NOI18N
        Reset.setText("RESET");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        Close.setText("  CLOSE");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addComponent(AdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(124, 124, 124))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 740, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void AdminIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdminIDFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminIDFocusGained

    private void AdminIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdminIDFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminIDFocusLost

    private void AdminIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminIDActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:

        String ID =AdminID.getText();
        try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from admintbl where ID='"+ID+"'");
            if(rs.next())
            {
                Name.setText(rs.getString(2));
                Password.setText(rs.getString(3));
                AdminID.setEditable(false);
            }
            else
            JOptionPane.showMessageDialog(null,"ProductID does not Exit");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void NameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_NameFocusGained

    private void NameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_NameFocusLost

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_PasswordFocusGained

    private void PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_PasswordFocusLost

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        String ID=AdminID.getText();
        String AdminName=Name.getText();
        String AdminPass=Password.getText();
        try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("update admintbl set AdminName='"+AdminName+"',AdminPass='"+AdminPass+"'where ID='"+ID+"'  ");
            JOptionPane.showMessageDialog(null,"Successfully Admin Updated");
            setVisible(false);
            new AdminUpdate().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminUpdate().setVisible(true);
    }//GEN-LAST:event_ResetActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

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
            java.util.logging.Logger.getLogger(AdminUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdminID;
    private javax.swing.JButton Close;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Password;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Search;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
