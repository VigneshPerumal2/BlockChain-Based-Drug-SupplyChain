/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.superadmin;

import classes.FDA;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.registration.FDAFormJPanel;
import util.sql.FDASqlQuery;

/**
 *
 * @author sunayanashivanagi
 */
public class ViewFDAJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFDAJPanel
     */
    javax.swing.JSplitPane splitPane;
    public ViewFDAJPanel(javax.swing.JSplitPane splitPane) {
        initComponents();
        this.splitPane=splitPane;
        populateTable();
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
        tblFDA = new javax.swing.JTable();
        lblViewHFDA = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 32767));
        lbllogo = new javax.swing.JLabel();
        lblViewFDA = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnViewPharmacy = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblFDA.setModel(new javax.swing.table.DefaultTableModel(
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
                "Board Name", "City", "Country", "Email Id", "Password", "Phone  Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFDA);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 760, 520));

        lblViewHFDA.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblViewHFDA.setForeground(new java.awt.Color(153, 153, 153));
        lblViewHFDA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewHFDA.setText("VIEW FDA DETAILS");
        add(lblViewHFDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 760, 60));
        add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, -1, 90));
        add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 190, 0));

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 730, 110, 70));

        lblViewFDA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/FDAView.jpg"))); // NOI18N
        add(lblViewFDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 290, 200));

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

        btnViewPharmacy.setBackground(new java.awt.Color(0, 153, 255));
        btnViewPharmacy.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        btnViewPharmacy.setForeground(new java.awt.Color(255, 255, 255));
        btnViewPharmacy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Eye.png"))); // NOI18N
        btnViewPharmacy.setText("VIEW");
        btnViewPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPharmacyActionPerformed(evt);
            }
        });
        add(btnViewPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 110, 30));

        btnCreate.setBackground(new java.awt.Color(0, 153, 51));
        btnCreate.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Plus(3).png"))); // NOI18N
        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFDA.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }
        ArrayList<FDA> mList =  new  ArrayList<>();
        FDASqlQuery msq = new FDASqlQuery();
        mList = msq.readAllFDA();
        FDA p = mList.get(selectedRow);

        msq.deleteFDA(p);

        populateTable();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPharmacyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFDA.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }
        ArrayList<FDA> mList =  new  ArrayList<>();
        FDASqlQuery msq = new FDASqlQuery();
        mList = msq.readAllFDA();
        FDA p = mList.get(selectedRow);

        splitPane.setRightComponent(new UpdateFDAFormJPanel(splitPane,p));
        populateTable();
    }//GEN-LAST:event_btnViewPharmacyActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        splitPane.setRightComponent(new FDAFormJPanel(splitPane));
        populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed

private void populateTable() {
        ArrayList<FDA> mList =  new  ArrayList<>();
        FDASqlQuery msq = new FDASqlQuery();
        mList = msq.readAllFDA();
        
        
        DefaultTableModel model =(DefaultTableModel) tblFDA.getModel();
        model.setRowCount(0);
        
        for(FDA e: mList){
            System.out.println(e);
            Object row[]=new Object[10];
            row[0] = e.getFDA_Board_Name();
            row[1] = e.getFDA_City();
            row[2] = e.getFDA_Country();
            row[3] = e.getEmail_Id();
            row[4] = e.getPassword();
            row[5] = e.getPhone_No();
            
            model.addRow(row);
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnViewPharmacy;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblViewFDA;
    private javax.swing.JLabel lblViewHFDA;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JTable tblFDA;
    // End of variables declaration//GEN-END:variables
}
