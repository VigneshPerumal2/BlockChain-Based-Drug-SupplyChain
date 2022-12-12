/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.superadmin;

import model.main.MainJFrame;

/**
 *
 * @author sunayanashivanagi
 */
public class SuperAdminSideJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SuperAdminSideJPanel
     */
    javax.swing.JSplitPane splitPane;
    public SuperAdminSideJPanel(javax.swing.JSplitPane splitPane) {
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

        lblRoleHeadingSuperAdmin = new javax.swing.JLabel();
        lblavslogoadmin = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        imgPharmacy = new javax.swing.JLabel();
        lblGIF = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRoleHeadingSuperAdmin.setBackground(new java.awt.Color(204, 204, 255));
        lblRoleHeadingSuperAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 25)); // NOI18N
        lblRoleHeadingSuperAdmin.setForeground(new java.awt.Color(102, 102, 102));
        lblRoleHeadingSuperAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRoleHeadingSuperAdmin.setText("Super Admin Dashboard");
        add(lblRoleHeadingSuperAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 400, 50));

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
        add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 160, 40));

        imgPharmacy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/SuperAdmin.jpg"))); // NOI18N
        add(imgPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 400, 200));

        lblGIF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/WelcomeIS.gif"))); // NOI18N
        add(lblGIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        btnRegister.setBackground(new java.awt.Color(0, 51, 153));
        btnRegister.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Add User Male.png"))); // NOI18N
        btnRegister.setText("Manage ");
        btnRegister.setBorder(null);
        btnRegister.setBorderPainted(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 160, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        splitPane.setLeftComponent(new SuperAdminRolesSideJPanel(splitPane));
    }//GEN-LAST:event_btnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel imgPharmacy;
    private javax.swing.JLabel lblGIF;
    private javax.swing.JLabel lblRoleHeadingSuperAdmin;
    private javax.swing.JLabel lblavslogoadmin;
    // End of variables declaration//GEN-END:variables
}
