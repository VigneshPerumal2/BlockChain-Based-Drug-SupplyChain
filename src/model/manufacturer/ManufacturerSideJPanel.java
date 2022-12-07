/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.manufacturer;

import model.main.MainJFrame;

/**
 *
 * @author sunayanashivanagi
 */
public class ManufacturerSideJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerSideJPanel
     */
    javax.swing.JSplitPane splitPane;
    public ManufacturerSideJPanel(javax.swing.JSplitPane splitPane) {
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

        lblManufacturerDashboard = new javax.swing.JLabel();
        lblavslogomd = new javax.swing.JLabel();
        lbldepartment = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblManufacturerimage = new javax.swing.JLabel();
        lblavsManufacturer = new javax.swing.JLabel();
        drpDepartment = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManufacturerDashboard.setBackground(new java.awt.Color(204, 204, 255));
        lblManufacturerDashboard.setFont(new java.awt.Font("Helvetica Neue", 1, 25)); // NOI18N
        lblManufacturerDashboard.setForeground(new java.awt.Color(102, 102, 102));
        lblManufacturerDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManufacturerDashboard.setText("Manufacturer Dashboard");
        add(lblManufacturerDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 400, 50));

        lblavslogomd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblavslogomd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        add(lblavslogomd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, 70));

        lbldepartment.setFont(new java.awt.Font("Helvetica Neue", 1, 35)); // NOI18N
        lbldepartment.setForeground(new java.awt.Color(0, 51, 153));
        lbldepartment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldepartment.setText("Choose a Department");
        add(lbldepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 400, 40));

        btnLogout.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Shutdown.png"))); // NOI18N
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 140, 40));

        lblManufacturerimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/ManufacturerP.jpg"))); // NOI18N
        add(lblManufacturerimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 570, 430, 240));

        lblavsManufacturer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblavsManufacturer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/WelcomeIS.gif"))); // NOI18N
        add(lblavsManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        drpDepartment.setForeground(new java.awt.Color(102, 102, 102));
        drpDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose an Option...", "R & D", "FDA", "Packaging" }));
        drpDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpDepartmentActionPerformed(evt);
            }
        });
        add(drpDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 410, 290, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void drpDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpDepartmentActionPerformed
        // TODO add your handling code here:
        if(drpDepartment.getSelectedItem().equals("R & D")){
            splitPane.setRightComponent(new ResearchAndDevelopmentJPanel());
        }
    }//GEN-LAST:event_drpDepartmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> drpDepartment;
    private javax.swing.JLabel lblManufacturerDashboard;
    private javax.swing.JLabel lblManufacturerimage;
    private javax.swing.JLabel lblavsManufacturer;
    private javax.swing.JLabel lblavslogomd;
    private javax.swing.JLabel lbldepartment;
    // End of variables declaration//GEN-END:variables
}
