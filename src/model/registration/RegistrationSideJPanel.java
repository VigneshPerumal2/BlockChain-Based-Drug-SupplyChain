/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.registration;

/**
 *
 * @author sunayanashivanagi
 */
public class RegistrationSideJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegistrationSideJPanel
     */
    public RegistrationSideJPanel() {
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

        imgfactory = new javax.swing.JLabel();
        lblPatient = new javax.swing.JLabel();
        btnPatient = new javax.swing.JButton();
        lblRoleHeading = new javax.swing.JLabel();
        imgDoctor = new javax.swing.JLabel();
        lblPatient1 = new javax.swing.JLabel();
        btnDoctor = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        lblBack = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        imgingsupplier = new javax.swing.JLabel();
        lblSupplier = new javax.swing.JLabel();
        lblIngredient = new javax.swing.JLabel();
        btnIngSupplier = new javax.swing.JButton();
        imgManufacturer = new javax.swing.JLabel();
        lblManufacturer = new javax.swing.JLabel();
        btnManufacturer = new javax.swing.JButton();
        imgManufacturer1 = new javax.swing.JLabel();
        lblManufacturer1 = new javax.swing.JLabel();
        btnFDA = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgfactory.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgfactory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgfactory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Account.png"))); // NOI18N
        add(imgfactory, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 60));

        lblPatient.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblPatient.setText("Patient");
        add(lblPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        btnPatient.setBackground(new java.awt.Color(0, 0, 153));
        btnPatient.setForeground(new java.awt.Color(255, 0, 153));
        btnPatient.setBorder(null);
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });
        add(btnPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 120, 130));

        lblRoleHeading.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblRoleHeading.setForeground(new java.awt.Color(102, 102, 102));
        lblRoleHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRoleHeading.setText("Choose Role");
        add(lblRoleHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 230, 50));

        imgDoctor.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgDoctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Doctor.png"))); // NOI18N
        add(imgDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 80, 60));

        lblPatient1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblPatient1.setForeground(new java.awt.Color(255, 255, 255));
        lblPatient1.setText("Doctor");
        add(lblPatient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        btnDoctor.setBackground(new java.awt.Color(0, 153, 153));
        btnDoctor.setForeground(new java.awt.Color(255, 0, 153));
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });
        add(btnDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 120, 130));
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

        imgingsupplier.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgingsupplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgingsupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Lab Items.png"))); // NOI18N
        add(imgingsupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 80, 60));

        lblSupplier.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblSupplier.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSupplier.setText("Supplier");
        add(lblSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 370, 110, -1));

        lblIngredient.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblIngredient.setForeground(new java.awt.Color(255, 255, 255));
        lblIngredient.setText("Ingredient");
        add(lblIngredient, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        btnIngSupplier.setBackground(new java.awt.Color(255, 204, 51));
        btnIngSupplier.setForeground(new java.awt.Color(255, 0, 153));
        btnIngSupplier.setBorder(null);
        btnIngSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngSupplierActionPerformed(evt);
            }
        });
        add(btnIngSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 120, 130));

        imgManufacturer.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgManufacturer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgManufacturer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Factory.png"))); // NOI18N
        add(imgManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 80, 60));

        lblManufacturer.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        lblManufacturer.setText("Manufacturer");
        add(lblManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        btnManufacturer.setBackground(new java.awt.Color(204, 102, 0));
        btnManufacturer.setForeground(new java.awt.Color(255, 0, 153));
        btnManufacturer.setBorder(null);
        btnManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufacturerActionPerformed(evt);
            }
        });
        add(btnManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 120, 130));

        imgManufacturer1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgManufacturer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgManufacturer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Licence.png"))); // NOI18N
        add(imgManufacturer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 80, 60));

        lblManufacturer1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblManufacturer1.setForeground(new java.awt.Color(255, 255, 255));
        lblManufacturer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManufacturer1.setText("FDA");
        add(lblManufacturer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 120, -1));

        btnFDA.setBackground(new java.awt.Color(0, 153, 51));
        btnFDA.setForeground(new java.awt.Color(255, 0, 153));
        btnFDA.setBorder(null);
        btnFDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFDAActionPerformed(evt);
            }
        });
        add(btnFDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 120, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnIngSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngSupplierActionPerformed

    private void btnManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManufacturerActionPerformed

    private void btnFDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFDAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnFDA;
    private javax.swing.JButton btnIngSupplier;
    private javax.swing.JButton btnManufacturer;
    private javax.swing.JButton btnPatient;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel imgDoctor;
    private javax.swing.JLabel imgManufacturer;
    private javax.swing.JLabel imgManufacturer1;
    private javax.swing.JLabel imgfactory;
    private javax.swing.JLabel imgingsupplier;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblIngredient;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblManufacturer1;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblPatient1;
    private javax.swing.JLabel lblRoleHeading;
    private javax.swing.JLabel lblSupplier;
    // End of variables declaration//GEN-END:variables
}
