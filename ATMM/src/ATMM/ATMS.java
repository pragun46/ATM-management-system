package ATMM;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author pragun
 */
public class ATMS extends javax.swing.JFrame {
    
    private static int acnt;
    private static int pin;
    private int choice;
    private JFrame frame;
    private static Connection conn;
    private static Statement st;
    private static PreparedStatement pst,pst1;
    private static String querry1,querry;
    private static ResultSet res;
    
    public ATMS() {
        initComponents();
        jPanel3.setVisible(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        balance = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        details = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelLT = new javax.swing.JLabel();
        labelRT = new javax.swing.JLabel();
        labelLB = new javax.swing.JLabel();
        labelRB = new javax.swing.JLabel();
        text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "ATM SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        balance.setBackground(new java.awt.Color(204, 255, 204));
        balance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        balance.setText("-->");
        balance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });

        withdraw.setBackground(new java.awt.Color(204, 255, 204));
        withdraw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        withdraw.setText("-->");
        withdraw.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        details.setBackground(new java.awt.Color(204, 255, 204));
        details.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        details.setText("<--");
        details.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsActionPerformed(evt);
            }
        });

        deposit.setBackground(new java.awt.Color(204, 255, 204));
        deposit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deposit.setText("<--");
        deposit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelLT.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        labelLT.setText("Balance");

        labelRT.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        labelRT.setText("Details");

        labelLB.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        labelLB.setText("Withdraw");

        labelRB.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        labelRB.setText("Deposit");

        text.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelLT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelRT))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(labelRB))
                    .addComponent(text)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRT)
                    .addComponent(labelLT, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLB)
                    .addComponent(labelRB))
                .addContainerGap())
        );

        clear.setBackground(new java.awt.Color(255, 255, 102));
        clear.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        clear.setForeground(new java.awt.Color(51, 51, 51));
        clear.setText("CLEAR");
        clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 102, 102));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cancel.setText("CANCEL");
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        enter.setBackground(new java.awt.Color(0, 153, 255));
        enter.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        enter.setText("ENTER");
        enter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(153, 153, 153));
        exit.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        exit.setText("EXIT");
        exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 380));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Info", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        jLabel2.setColumns(20);
        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel2.setRows(5);
        jScrollPane1.setViewportView(jLabel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 400, 190));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        //this.dispose();
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       //jPanel3.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        start();
        jPanel3.setVisible(false);
    }//GEN-LAST:event_clearActionPerformed
    
    private void start(){
        jLabel1.setText("");
        jLabel2.setText("");
        text.setText("");
        jPanel3.setVisible(true);
    }
    private void optionselected(){
        exit.setEnabled(true);
        cancel.setEnabled(true);
        clear.setEnabled(true);
        enter.setEnabled(true);
    }
    private boolean checkbal(){
        try {
            int amount = Integer.parseInt(text.getText());
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/accountdatabase", "pragun", "pragun");
            st = conn.createStatement();
            querry1 = "select balance from acounts_info where accountno=?";
            pst1 = conn.prepareStatement(querry);
            pst1.setInt(1, Loginpage.account);
            res = pst1.executeQuery();
            while (res.next()) {
                int bal = res.getInt("balance");
                //jLabel2.append("Balance in your account is:\n$"+String.valueOf(bal));
                if (bal - amount < 0) {
                    JOptionPane.showMessageDialog(null, "Insufficient Funds", "Warning", JOptionPane.PLAIN_MESSAGE);
                    optionselected();
                    conn.close();
                    start();
                    return false;
                }

                if (bal - amount < 1000 && bal-amount > 0) {
                    if (JOptionPane.showConfirmDialog(null, "Low Balance\n Fine will be Charged.\n Continue?", "Warning", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {

                        optionselected();
                        conn.close();
                        start();
                        return false;

                    }
                } else {
                    conn.close();
                    optionselected();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ATMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        try {
            boolean x = false;
           // x = checkbal();
            int amount = Integer.parseInt(text.getText());
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/accountdatabase", "pragun", "pragun");
            st = conn.createStatement();
            
            //start();
            if (choice == 1) {
                querry = "update acounts_info set balance=balance + ? where accountno=?";
                x = true;
            } else if (choice == 0) {
                x=checkbal();
                querry = "update acounts_info set balance=balance - ? where accountno=?";
            }
            if (x) {
                pst = conn.prepareStatement(querry);
                pst.setInt(1, amount);
                pst.setInt(2, Loginpage.account);
                pst.executeUpdate();
                start();
                jLabel2.append("Your Balance has been updated");

            }
            conn.close();
            optionselected();
        } 
        catch (SQLException ex) {
            Logger.getLogger(ATMS.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_enterActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        int y=JOptionPane.showConfirmDialog(null,"Are you sure","EXIT",JOptionPane.YES_NO_OPTION);
        if(y==JOptionPane.YES_OPTION){
            System.exit(0);
        }    
        else{
            start();
            jPanel3.setVisible(false);
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceActionPerformed
        try {
        conn= DriverManager.getConnection("jdbc:derby://localhost:1527/accountdatabase","pragun","pragun");
        st=conn.createStatement();
        start();
        querry="select balance from acounts_info where accountno=?";
        pst=conn.prepareStatement(querry);
        pst.setInt(1,Loginpage.account);
        res=pst.executeQuery();
        while(res.next()){
            int bal=res.getInt("balance");
            jLabel2.append("Balance in your account is:\n$"+String.valueOf(bal));
            
            }
        conn.close();
        optionselected();
        
        } catch (SQLException ex) {
            Logger.getLogger(ATMS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_balanceActionPerformed

    private void detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsActionPerformed
        try {
            conn= DriverManager.getConnection("jdbc:derby://localhost:1527/accountdatabase","pragun","pragun");
            st=conn.createStatement();
            start();
            querry="select * from acounts_info where accountno=?";
            pst=conn.prepareStatement(querry);
            pst.setInt(1,Loginpage.account);
            res=pst.executeQuery();
            while(res.next()){
                String name=res.getString("name");
                int acc= res.getInt("accountno");
                int piin=res.getInt("Pin");
                int bal= res.getInt("balance");
                jLabel2.append("Your account details are:\n"+"Name: "+name+"\nAccount No.: "+acc+"\nBalance: $"+bal);
            }
            conn.close();
            optionselected();
        } catch (SQLException ex) {
            Logger.getLogger(ATMS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_detailsActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
      
        start();
        jLabel1.setText("Enter Amount:");
        text.requestFocusInWindow();
        choice=0;
        optionselected();
        enter.grabFocus();
        
          
    }//GEN-LAST:event_withdrawActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        start();
        jLabel1.setText("Enter Amount:");
        text.requestFocusInWindow();
        choice=1;
        optionselected();
        enter.grabFocus();
    }//GEN-LAST:event_depositActionPerformed

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
            java.util.logging.Logger.getLogger(ATMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMS().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balance;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JButton deposit;
    private javax.swing.JButton details;
    private javax.swing.JButton enter;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextArea jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLB;
    private javax.swing.JLabel labelLT;
    private javax.swing.JLabel labelRB;
    private javax.swing.JLabel labelRT;
    private javax.swing.JTextField text;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}
