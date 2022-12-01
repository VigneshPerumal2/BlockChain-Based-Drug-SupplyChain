/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package model.main;

import model.login.LoginJPanel;
import model.registration.RegistrationSideJPanel;
import util.extras.JHintPasswordTextField;
import util.extras.JHintTextField;

/**
 *
 * @author sunayanashivanagi
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
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

        splitPane = new javax.swing.JSplitPane();
        splitLeft = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(400, 0), new java.awt.Dimension(400, 0), new java.awt.Dimension(400, 32767));
        jPanel1 = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        lblEnterCredentials = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        txtEmailId = new JHintTextField("Enter Email ID");
        txtPassword = new JHintPasswordTextField("Enter Password");
        btnRegister = new javax.swing.JButton();
        btnSignIn = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 200), new java.awt.Dimension(0, 200), new java.awt.Dimension(32767, 200));
        EmailId = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        valPassword = new javax.swing.JLabel();
        valEmailId = new javax.swing.JLabel();
        splitRight = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblWelcomeImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        splitPane.setBackground(new java.awt.Color(7, 59, 76));

        splitLeft.setBackground(new java.awt.Color(7, 59, 76));
        splitLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        splitLeft.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 504, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogoBig.png"))); // NOI18N
        jPanel1.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 140));

        lblEnterCredentials.setForeground(new java.awt.Color(204, 204, 204));
        lblEnterCredentials.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnterCredentials.setText("Please enter your credentials");
        jPanel1.add(lblEnterCredentials, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 400, 30));

        lblWelcome.setFont(new java.awt.Font("Zapfino", 1, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(0, 51, 153));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Welcome !");
        jPanel1.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 400, 80));

        txtEmailId.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 360, 60));

        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 360, 60));

        btnRegister.setBackground(new java.awt.Color(0, 51, 153));
        btnRegister.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Add User Male.png"))); // NOI18N
        btnRegister.setText("REGISTER");
        btnRegister.setBorder(null);
        btnRegister.setBorderPainted(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 130, 50));

        btnSignIn.setBackground(new java.awt.Color(255, 61, 0));
        btnSignIn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Forward.png"))); // NOI18N
        btnSignIn.setText("SIGN IN");
        btnSignIn.setBorderPainted(false);
        btnSignIn.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnSignIn.setMixingCutoutShape(null);
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 120, 50));
        jPanel1.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, 270));

        EmailId.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        EmailId.setForeground(new java.awt.Color(153, 153, 153));
        EmailId.setText("Email ID");
        jPanel1.add(EmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 340, 270, 40));

        Password.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(153, 153, 153));
        Password.setText("Password");
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 350, 30));

        valPassword.setForeground(new java.awt.Color(255, 61, 0));
        valPassword.setText("Please enter valid Password");
        jPanel1.add(valPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        valEmailId.setForeground(new java.awt.Color(255, 61, 0));
        valEmailId.setText("Please enter valid Email Id");
        jPanel1.add(valEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        splitLeft.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        splitPane.setLeftComponent(splitLeft);

        splitRight.setBackground(new java.awt.Color(255, 255, 255));
        splitRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("to every moment of your health");
        splitRight.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 61, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Bringing our medicines ");
        splitRight.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 760, 230));

        lblWelcomeImage.setBackground(new java.awt.Color(204, 204, 204));
        lblWelcomeImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Group of doctors standing at hospital building.jpg"))); // NOI18N
        lblWelcomeImage.setText("Bringing our heart to every moment of your health");
        lblWelcomeImage.setToolTipText("");
        splitRight.add(lblWelcomeImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 810, 800));

        splitPane.setRightComponent(splitRight);

        getContentPane().add(splitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        RegistrationSideJPanel registrationSideJPanel = new RegistrationSideJPanel();
        splitPane.setLeftComponent(registrationSideJPanel);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignInActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailId;
    private javax.swing.JLabel Password;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSignIn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEnterCredentials;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblWelcomeImage;
    private javax.swing.JPanel splitLeft;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel splitRight;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel valEmailId;
    private javax.swing.JLabel valPassword;
    // End of variables declaration//GEN-END:variables
}
