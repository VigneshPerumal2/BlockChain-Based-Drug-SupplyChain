/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.registration;

import model.main.MainJFrame;

/**
 *
 * @author sunayanashivanagi
 */
public class RegistrationSideJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegistrationSideJPanel
     */
    javax.swing.JSplitPane splitPane;
    public RegistrationSideJPanel(javax.swing.JSplitPane splitPane) {
        initComponents();
        this.splitPane = splitPane;
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
        lblRoleHeading = new javax.swing.JLabel();
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
        imgFDA = new javax.swing.JLabel();
        lblFDA = new javax.swing.JLabel();
        btnFDA = new javax.swing.JButton();
        imgDistributor = new javax.swing.JLabel();
        lblDistributor = new javax.swing.JLabel();
        btnDistributor = new javax.swing.JButton();
        imgPharmacy = new javax.swing.JLabel();
        lblPharmacy = new javax.swing.JLabel();
        btnPharmacy = new javax.swing.JButton();
        imgHospital = new javax.swing.JLabel();
        lblHospital = new javax.swing.JLabel();
        btnHospital = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgfactory.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgfactory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgfactory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Account.png"))); // NOI18N
        add(imgfactory, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 60));

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

        imgingsupplier.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgingsupplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgingsupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Lab Items.png"))); // NOI18N
        add(imgingsupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 80, 60));

        lblSupplier.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblSupplier.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSupplier.setText("Supplier");
        add(lblSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 110, -1));

        lblIngredient.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblIngredient.setForeground(new java.awt.Color(255, 255, 255));
        lblIngredient.setText("Ingredient");
        add(lblIngredient, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        btnIngSupplier.setBackground(new java.awt.Color(255, 204, 51));
        btnIngSupplier.setForeground(new java.awt.Color(255, 0, 153));
        btnIngSupplier.setBorder(null);
        btnIngSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngSupplierActionPerformed(evt);
            }
        });
        add(btnIngSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 120, 130));

        imgManufacturer.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgManufacturer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgManufacturer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Factory.png"))); // NOI18N
        add(imgManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 80, 60));

        lblManufacturer.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        lblManufacturer.setText("Manufacturer");
        add(lblManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        btnManufacturer.setBackground(new java.awt.Color(204, 102, 0));
        btnManufacturer.setForeground(new java.awt.Color(255, 0, 153));
        btnManufacturer.setBorder(null);
        btnManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufacturerActionPerformed(evt);
            }
        });
        add(btnManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 120, 130));

        imgFDA.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgFDA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFDA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Licence.png"))); // NOI18N
        add(imgFDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 80, 60));

        lblFDA.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblFDA.setForeground(new java.awt.Color(255, 255, 255));
        lblFDA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFDA.setText("FDA");
        add(lblFDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 120, -1));

        btnFDA.setBackground(new java.awt.Color(0, 153, 51));
        btnFDA.setForeground(new java.awt.Color(255, 0, 153));
        btnFDA.setBorder(null);
        btnFDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFDAActionPerformed(evt);
            }
        });
        add(btnFDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 120, 130));

        imgDistributor.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgDistributor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgDistributor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Truck.png"))); // NOI18N
        add(imgDistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 80, 60));

        lblDistributor.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDistributor.setForeground(new java.awt.Color(255, 255, 255));
        lblDistributor.setText("Distributor");
        add(lblDistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        btnDistributor.setBackground(new java.awt.Color(153, 153, 255));
        btnDistributor.setForeground(new java.awt.Color(255, 0, 153));
        btnDistributor.setBorder(null);
        btnDistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistributorActionPerformed(evt);
            }
        });
        add(btnDistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 120, 130));

        imgPharmacy.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgPharmacy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPharmacy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Pharmacy Shop.png"))); // NOI18N
        add(imgPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 80, 60));

        lblPharmacy.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblPharmacy.setForeground(new java.awt.Color(255, 255, 255));
        lblPharmacy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPharmacy.setText("Pharmacy");
        add(lblPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 110, -1));

        btnPharmacy.setBackground(new java.awt.Color(153, 204, 255));
        btnPharmacy.setForeground(new java.awt.Color(255, 0, 153));
        btnPharmacy.setBorder(null);
        btnPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPharmacyActionPerformed(evt);
            }
        });
        add(btnPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 120, 130));

        imgHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgHospital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgHospital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Hospital 3.png"))); // NOI18N
        add(imgHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 80, 60));

        lblHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblHospital.setForeground(new java.awt.Color(255, 255, 255));
        lblHospital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospital.setText("Hospital");
        add(lblHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 670, 120, -1));

        btnHospital.setBackground(new java.awt.Color(255, 51, 102));
        btnHospital.setForeground(new java.awt.Color(255, 0, 153));
        btnHospital.setBorder(null);
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });
        add(btnHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 120, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnIngSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngSupplierActionPerformed
        // TODO add your handling code here:
        splitPane.setRightComponent(new IngredientSupplierFormJPanel(splitPane));
    }//GEN-LAST:event_btnIngSupplierActionPerformed

    private void btnManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufacturerActionPerformed
        // TODO add your handling code here:
        splitPane.setRightComponent(new ManufacturerFormJPanel(splitPane));
    }//GEN-LAST:event_btnManufacturerActionPerformed

    private void btnFDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFDAActionPerformed
        // TODO add your handling code here:
       splitPane.setRightComponent(new FDAFormJPanel(splitPane)); 
    }//GEN-LAST:event_btnFDAActionPerformed

    private void btnDistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistributorActionPerformed
        // TODO add your handling code here:
       splitPane.setRightComponent(new DistributorFormJPanel(splitPane));
    }//GEN-LAST:event_btnDistributorActionPerformed

    private void btnPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPharmacyActionPerformed
        // TODO add your handling code here:
       splitPane.setRightComponent(new PharmacyFormJPanel(splitPane));
    }//GEN-LAST:event_btnPharmacyActionPerformed

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
        // TODO add your handling code here:
       splitPane.setRightComponent(new HospitalFormJPanel(splitPane));
    }//GEN-LAST:event_btnHospitalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDistributor;
    private javax.swing.JButton btnFDA;
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnIngSupplier;
    private javax.swing.JButton btnManufacturer;
    private javax.swing.JButton btnPharmacy;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel imgDistributor;
    private javax.swing.JLabel imgFDA;
    private javax.swing.JLabel imgHospital;
    private javax.swing.JLabel imgManufacturer;
    private javax.swing.JLabel imgPharmacy;
    private javax.swing.JLabel imgfactory;
    private javax.swing.JLabel imgingsupplier;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDistributor;
    private javax.swing.JLabel lblFDA;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblIngredient;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblPharmacy;
    private javax.swing.JLabel lblRoleHeading;
    private javax.swing.JLabel lblSupplier;
    // End of variables declaration//GEN-END:variables
}
