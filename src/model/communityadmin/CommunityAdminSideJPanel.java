/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.communityadmin;

import model.main.MainJFrame;

/**
 *
 * @author sunayanashivanagi
 */
public class CommunityAdminSideJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdminSideJPanel
     */
    javax.swing.JSplitPane splitPane;
    public CommunityAdminSideJPanel(javax.swing.JSplitPane splitPane) {
        initComponents();
        this.splitPane=splitPane;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRoleHeadingCommunityAdmin = new javax.swing.JLabel();
        lblavslogoadmin = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        imgCommunityAdmin = new javax.swing.JLabel();
        lblGIF = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRoleHeadingCommunityAdmin.setBackground(new java.awt.Color(204, 204, 255));
        lblRoleHeadingCommunityAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 25)); // NOI18N
        lblRoleHeadingCommunityAdmin.setForeground(new java.awt.Color(102, 102, 102));
        lblRoleHeadingCommunityAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRoleHeadingCommunityAdmin.setText("Community Admin Dashboard");
        add(lblRoleHeadingCommunityAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 400, 50));

        lblavslogoadmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblavslogoadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        add(lblavslogoadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, 70));

        btnLogout.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Shutdown.png"))); // NOI18N
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 140, 40));

        imgCommunityAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCommunityAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/CommunityAdmin.jpg"))); // NOI18N
        add(imgCommunityAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 400, 200));

        lblGIF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/WelcomeIS.gif"))); // NOI18N
        add(lblGIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        btnRegister.setBackground(new java.awt.Color(0, 153, 255));
        btnRegister.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Eye.png"))); // NOI18N
        btnRegister.setText("VIEW");
        btnRegister.setBorder(null);
        btnRegister.setBorderPainted(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        splitPane.setLeftComponent(new CommunityAdminRegistrationJPanel(splitPane));
    }//GEN-LAST:event_btnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel imgCommunityAdmin;
    private javax.swing.JLabel lblGIF;
    private javax.swing.JLabel lblRoleHeadingCommunityAdmin;
    private javax.swing.JLabel lblavslogoadmin;
    // End of variables declaration//GEN-END:variables
}
