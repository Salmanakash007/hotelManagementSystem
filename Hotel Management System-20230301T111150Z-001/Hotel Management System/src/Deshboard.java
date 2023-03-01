
import com.mysql.cj.x.protobuf.MysqlxNotice;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Deshboard extends javax.swing.JFrame {

    /**
     * Creates new form Deshboard
     */
    GuestCheckIn gu = new GuestCheckIn();
    ManageRoom mr = new ManageRoom();
    GuestCheckIn gc  = new GuestCheckIn();
    GuestCheckOut go = new GuestCheckOut();
    CustomersDetailsBill cd = new CustomersDetailsBill();
    public Deshboard() {
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

        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCheckOut = new javax.swing.JButton();
        btnCeckIn = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        btnGuestBill = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 600, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));

        btnCheckOut.setBackground(new java.awt.Color(51, 51, 51));
        btnCheckOut.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        btnCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manakey.png"))); // NOI18N
        btnCheckOut.setText("Guest Checkout");
        btnCheckOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        btnCeckIn.setBackground(new java.awt.Color(51, 51, 51));
        btnCeckIn.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        btnCeckIn.setForeground(new java.awt.Color(255, 255, 255));
        btnCeckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manakey.png"))); // NOI18N
        btnCeckIn.setText("Guest CheckIn");
        btnCeckIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnCeckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeckInActionPerformed(evt);
            }
        });

        btnManage.setBackground(new java.awt.Color(51, 51, 51));
        btnManage.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        btnManage.setForeground(new java.awt.Color(255, 255, 255));
        btnManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manakey.png"))); // NOI18N
        btnManage.setText("Manage Room");
        btnManage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });

        btnGuestBill.setBackground(new java.awt.Color(51, 51, 51));
        btnGuestBill.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        btnGuestBill.setForeground(new java.awt.Color(255, 255, 255));
        btnGuestBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manakey.png"))); // NOI18N
        btnGuestBill.setText("Guest Bill System");
        btnGuestBill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnGuestBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuestBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnManage, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnCeckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnGuestBill, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCeckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuestBill, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1210, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nice.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        dispose();
        go.setVisible(true);
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        // TODO add your handling code here:
       
        dispose();
        mr.setVisible(true);
//        setVisible(false);
        new ManageRoom().setVisible(true);
       
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnGuestBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuestBillActionPerformed
        // TODO add your handling code here:
        dispose();
        cd.setVisible(true);
    }//GEN-LAST:event_btnGuestBillActionPerformed

    private void btnCeckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeckInActionPerformed
        dispose();
        gu.setVisible(true);
    }//GEN-LAST:event_btnCeckInActionPerformed
    private JFrame frame;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        setVisible(false);
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Do you want to exit?","Frame Connector",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
        
        System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Deshboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deshboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deshboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deshboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deshboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCeckIn;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnGuestBill;
    private javax.swing.JButton btnManage;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
