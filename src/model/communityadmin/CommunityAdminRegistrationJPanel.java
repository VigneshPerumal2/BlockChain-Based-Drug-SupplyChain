/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.communityadmin;

import model.main.MainJFrame;

import model.main.MainJFrame;
import model.registration.HospitalFormJPanel;
import model.registration.PharmacyFormJPanel;

/**
 *
 * @author sunayanashivanagi
 */
public class CommunityAdminRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdminRegistrationJPanel
     */
    javax.swing.JSplitPane splitPane;
    public CommunityAdminRegistrationJPanel(javax.swing.JSplitPane splitPane) {
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

        lblRoleHeading = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        lblBack = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        imgPharmacy = new javax.swing.JLabel();
        lblPharmacy = new javax.swing.JLabel();
        btnPharmacy = new javax.swing.JButton();
        imgHospital = new javax.swing.JLabel();
        lblHospital = new javax.swing.JLabel();
        btnHospital = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRoleHeading.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblRoleHeading.setForeground(new java.awt.Color(102, 102, 102));
        lblRoleHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRoleHeading.setText("Choose Role");
        add(lblRoleHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 230, 50));
        add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, -1, 90));
        add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 70, -1));

        lblBack.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Double Left.png"))); // NOI18N
        lblBack.setText("BACK");
        add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 70, 30));

        imgPharmacy.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgPharmacy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPharmacy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Pharmacy Shop.png"))); // NOI18N
        add(imgPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 190, 120));

        lblPharmacy.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblPharmacy.setForeground(new java.awt.Color(255, 255, 255));
        lblPharmacy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPharmacy.setText("Pharmacy");
        add(lblPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 190, 40));

        btnPharmacy.setBackground(new java.awt.Color(153, 204, 255));
        btnPharmacy.setForeground(new java.awt.Color(255, 0, 153));
        btnPharmacy.setBorder(null);
        btnPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPharmacyActionPerformed(evt);
            }
        });
        add(btnPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 190, 200));

        imgHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgHospital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgHospital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Hospital 3.png"))); // NOI18N
        add(imgHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 200, 60));

        lblHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblHospital.setForeground(new java.awt.Color(255, 255, 255));
        lblHospital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospital.setText("Hospital");
        add(lblHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 200, 20));

        btnHospital.setBackground(new java.awt.Color(255, 51, 102));
        btnHospital.setForeground(new java.awt.Color(255, 0, 153));
        btnHospital.setBorder(null);
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });
        add(btnHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 200, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPharmacyActionPerformed
        // TODO add your handling code here:
        splitPane.setRightComponent(new ViewPharmacyJPanel(splitPane));
    }//GEN-LAST:event_btnPharmacyActionPerformed

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
        // TODO add your handling code here:
        splitPane.setRightComponent(new ViewHospitalJPanel(splitPane));
    }//GEN-LAST:event_btnHospitalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnPharmacy;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel imgHospital;
    private javax.swing.JLabel imgPharmacy;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblPharmacy;
    private javax.swing.JLabel lblRoleHeading;
    // End of variables declaration//GEN-END:variables
}
