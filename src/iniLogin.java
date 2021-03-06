
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class iniLogin extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public iniLogin() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_bg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBox_username = new javax.swing.JTextField();
        txtBox_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login_bg.setBackground(new java.awt.Color(0, 153, 153));

        txtBox_username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtBox_username.setForeground(new java.awt.Color(204, 204, 204));
        txtBox_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBox_username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtBox_password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtBox_password.setForeground(new java.awt.Color(204, 204, 204));
        txtBox_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBox_password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btn_login.setBackground(new java.awt.Color(255, 255, 255));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(51, 102, 255));
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_cancel.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(0, 102, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        lbl_username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(204, 204, 204));
        lbl_username.setText("User Name");

        lbl_password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(204, 204, 204));
        lbl_password.setText("Password");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/coollogo_com-3125731.png"))); // NOI18N

        javax.swing.GroupLayout login_bgLayout = new javax.swing.GroupLayout(login_bg);
        login_bg.setLayout(login_bgLayout);
        login_bgLayout.setHorizontalGroup(
            login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_bgLayout.createSequentialGroup()
                        .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_bgLayout.createSequentialGroup()
                        .addComponent(lbl_password)
                        .addGap(306, 306, 306))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_bgLayout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBox_password, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_bgLayout.createSequentialGroup()
                            .addComponent(txtBox_username, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(203, 203, 203))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_bgLayout.createSequentialGroup()
                            .addGroup(login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addGroup(login_bgLayout.createSequentialGroup()
                                    .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(194, 194, 194)))))
            .addGroup(login_bgLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        login_bgLayout.setVerticalGroup(
            login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_bgLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtBox_username, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_password)
                .addGap(29, 29, 29)
                .addComponent(txtBox_password, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(login_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        conn=mySqlConnection.ConnectDB();
        String sql = "select * from login where username=? and password=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtBox_username.getText());
            pst.setString(2, txtBox_password.getText());
            String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(txtBox_password.getText());
            if (matcher.find()) {
                rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Welcome to Seminyak Hotel " + txtBox_username.getText());
                    this.setVisible(false);
                    main mainf = new main();
                    mainf.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Access Denied - Try again ");
                    txtBox_username.setText("");
                    txtBox_password.setText("");
                }
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(iniLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPanel login_bg;
    private javax.swing.JPasswordField txtBox_password;
    private javax.swing.JTextField txtBox_username;
    // End of variables declaration//GEN-END:variables
}
