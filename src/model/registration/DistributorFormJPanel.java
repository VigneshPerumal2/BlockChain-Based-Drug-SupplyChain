/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.registration;

/**
 *
 * @author sunayanashivanagi
 */
public class DistributorFormJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DistributorFormJPanel
     */
    public DistributorFormJPanel() {
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

        jPanel2 = new javax.swing.JPanel();
        lblDistributor = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        valName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        valPrice = new javax.swing.JLabel();
        lblModeOfTransport = new javax.swing.JLabel();
        lblDateofEst = new javax.swing.JLabel();
        lblAddWallet = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        valAmount = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 32767));
        btnReset = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        lbllogo = new javax.swing.JLabel();
        datechooserDateofEst = new com.toedter.calendar.JDateChooser();
        comboboxModeOfTransport = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        valLocation = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDistributor.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblDistributor.setForeground(new java.awt.Color(0, 51, 153));
        lblDistributor.setText("Enter Distributor Details");
        jPanel2.add(lblDistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 540, 90));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(102, 102, 102));
        lblName.setText("Name");
        jPanel2.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 70, 30));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 290, 30));

        valName.setForeground(new java.awt.Color(255, 61, 0));
        valName.setText("Please enter valid Name");
        jPanel2.add(valName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 290, 20));

        lblPrice.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(102, 102, 102));
        lblPrice.setText("Price");
        jPanel2.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 120, 30));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 290, 30));

        valPrice.setForeground(new java.awt.Color(255, 61, 0));
        valPrice.setText("Please enter valid Price");
        jPanel2.add(valPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 290, 20));

        lblModeOfTransport.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblModeOfTransport.setForeground(new java.awt.Color(102, 102, 102));
        lblModeOfTransport.setText("Mode of Transport");
        jPanel2.add(lblModeOfTransport, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 170, 30));

        lblDateofEst.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblDateofEst.setForeground(new java.awt.Color(102, 102, 102));
        lblDateofEst.setText("Date of Establishment");
        jPanel2.add(lblDateofEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 200, 30));

        lblAddWallet.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblAddWallet.setForeground(new java.awt.Color(102, 102, 102));
        lblAddWallet.setText("Add Wallet");
        jPanel2.add(lblAddWallet, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 140, 30));

        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        jPanel2.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 290, 30));

        valAmount.setForeground(new java.awt.Color(255, 61, 0));
        valAmount.setText("Please enter valid Amount");
        jPanel2.add(valAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 290, 20));
        jPanel2.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, -1, 90));
        jPanel2.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 190, 0));

        btnReset.setBackground(new java.awt.Color(255, 51, 0));
        btnReset.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Reverse.png"))); // NOI18N
        btnReset.setText("RESET");
        btnReset.setIconTextGap(10);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, 160, 40));

        btnsubmit.setBackground(new java.awt.Color(0, 153, 0));
        btnsubmit.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Double Tick.png"))); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel2.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 660, 160, 40));

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        jPanel2.add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 730, 110, 70));
        jPanel2.add(datechooserDateofEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 290, 30));

        comboboxModeOfTransport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxModeOfTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxModeOfTransportActionPerformed(evt);
            }
        });
        jPanel2.add(comboboxModeOfTransport, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 290, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Distributor.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 390, 440));

        lblLocation.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(102, 102, 102));
        lblLocation.setText("Location");
        jPanel2.add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 120, 30));

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        jPanel2.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 290, 30));

        valLocation.setForeground(new java.awt.Color(255, 61, 0));
        valLocation.setText("Please enter valid Location");
        jPanel2.add(valLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 290, 20));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void comboboxModeOfTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxModeOfTransportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxModeOfTransportActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> comboboxModeOfTransport;
    private com.toedter.calendar.JDateChooser datechooserDateofEst;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddWallet;
    private javax.swing.JLabel lblDateofEst;
    private javax.swing.JLabel lblDistributor;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblModeOfTransport;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JLabel valAmount;
    private javax.swing.JLabel valLocation;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valPrice;
    // End of variables declaration//GEN-END:variables
}
