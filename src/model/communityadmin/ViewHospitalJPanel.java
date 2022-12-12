/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.communityadmin;

import javax.swing.JOptionPane;

/**
 *
 * @author sunayanashivanagi
 */
public class ViewHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHospitalJPanel
     */
    javax.swing.JSplitPane splitPane;
    public ViewHospitalJPanel(javax.swing.JSplitPane splitPane) {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        lblViewHospital = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnViewHospital = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 32767));
        lbllogo = new javax.swing.JLabel();
        lblIVHospital = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Location", "Speciality", "Email Id", "Password", "Phone  Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHospital);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 760, 520));

        lblViewHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblViewHospital.setForeground(new java.awt.Color(153, 153, 153));
        lblViewHospital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewHospital.setText("VIEW HOSPITAL ");
        add(lblViewHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 760, 60));

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Remove.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 110, 30));

        btnViewHospital.setBackground(new java.awt.Color(0, 153, 255));
        btnViewHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        btnViewHospital.setForeground(new java.awt.Color(255, 255, 255));
        btnViewHospital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Eye.png"))); // NOI18N
        btnViewHospital.setText("VIEW");
        btnViewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalActionPerformed(evt);
            }
        });
        add(btnViewHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 110, 30));
        add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, -1, 90));
        add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 190, 0));

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 730, 110, 70));

        lblIVHospital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIVHospital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/HospitalLogoV.jpg"))); // NOI18N
        add(lblIVHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 310, 190));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblHospital.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }

        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewHospitalActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnViewHospital;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblIVHospital;
    private javax.swing.JLabel lblViewHospital;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JTable tblHospital;
    // End of variables declaration//GEN-END:variables
}
