/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.manufacturer;

/**
 *
 * @author vigy
 */
public class ResearchAndDevelopmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerJPanel
     */
    public ResearchAndDevelopmentJPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        PanelInventoryM = new javax.swing.JTabbedPane();
        panOrderManagement = new javax.swing.JPanel();
        lblOrderTable = new javax.swing.JLabel();
        btnNewOrder = new javax.swing.JButton();
        lbllogo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnOrderUpdate = new javax.swing.JButton();
        btnOrderDelete = new javax.swing.JButton();
        panInventoryManagement = new javax.swing.JPanel();
        lbllogo1 = new javax.swing.JLabel();
        lblMedicineName = new javax.swing.JLabel();
        txtMedicineName = new javax.swing.JTextField();
        valMedName = new javax.swing.JLabel();
        lblMedStatus = new javax.swing.JLabel();
        lblMedCategory = new javax.swing.JLabel();
        lblManufacturerN = new javax.swing.JLabel();
        txtManufacturerName = new javax.swing.JTextField();
        valManufacturerName = new javax.swing.JLabel();
        lblDOM = new javax.swing.JLabel();
        lblShellLife = new javax.swing.JLabel();
        lblName6 = new javax.swing.JLabel();
        txtMedicineName6 = new javax.swing.JTextField();
        valIngredients = new javax.swing.JLabel();
        drpStatusofMedicine = new javax.swing.JComboBox<>();
        comboCategoryMed = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIngMed = new javax.swing.JTextArea();
        spinShellLife = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnResetMed = new javax.swing.JButton();
        btnsubmitMed = new javax.swing.JButton();
        dateDOM = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(51, 153, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Research and Development Department");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        PanelInventoryM.setBackground(new java.awt.Color(255, 255, 255));
        PanelInventoryM.setForeground(new java.awt.Color(0, 51, 153));
        PanelInventoryM.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N

        panOrderManagement.setBackground(new java.awt.Color(255, 255, 255));
        panOrderManagement.setForeground(new java.awt.Color(0, 51, 153));
        panOrderManagement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrderTable.setBackground(new java.awt.Color(255, 255, 255));
        lblOrderTable.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblOrderTable.setForeground(new java.awt.Color(153, 153, 153));
        lblOrderTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Full Shopping Basket.png"))); // NOI18N
        lblOrderTable.setText("Manage Table");
        lblOrderTable.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblOrderTable.setIconTextGap(10);
        panOrderManagement.add(lblOrderTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 24, 499, 56));

        btnNewOrder.setBackground(new java.awt.Color(0, 153, 51));
        btnNewOrder.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnNewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnNewOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Plus(2).png"))); // NOI18N
        btnNewOrder.setText("New");
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
            }
        });
        panOrderManagement.add(btnNewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 67, -1, 29));

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        panOrderManagement.add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 608, 110, 70));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ingredient Id", "Transaction Id", "Manufacturer Id", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrder);

        panOrderManagement.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 114, 764, 440));

        btnOrderUpdate.setBackground(new java.awt.Color(0, 153, 255));
        btnOrderUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnOrderUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Eye.png"))); // NOI18N
        btnOrderUpdate.setText("VIEW");
        btnOrderUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderUpdateActionPerformed(evt);
            }
        });
        panOrderManagement.add(btnOrderUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 130, 40));

        btnOrderDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnOrderDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Remove.png"))); // NOI18N
        btnOrderDelete.setText("DELETE");
        panOrderManagement.add(btnOrderDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, 120, 40));

        PanelInventoryM.addTab("Manage Medicine", panOrderManagement);

        panInventoryManagement.setBackground(new java.awt.Color(255, 255, 255));
        panInventoryManagement.setForeground(new java.awt.Color(255, 255, 255));
        panInventoryManagement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        panInventoryManagement.add(lbllogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 608, 110, 70));

        lblMedicineName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblMedicineName.setForeground(new java.awt.Color(102, 102, 102));
        lblMedicineName.setText("Medicine Name");
        panInventoryManagement.add(lblMedicineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 290, 30));

        txtMedicineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicineNameActionPerformed(evt);
            }
        });
        panInventoryManagement.add(txtMedicineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 290, 30));

        valMedName.setForeground(new java.awt.Color(255, 61, 0));
        valMedName.setText("Please enter valid medicine name");
        panInventoryManagement.add(valMedName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 290, 20));

        lblMedStatus.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblMedStatus.setForeground(new java.awt.Color(102, 102, 102));
        lblMedStatus.setText(" Status");
        panInventoryManagement.add(lblMedStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 290, 30));

        lblMedCategory.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblMedCategory.setForeground(new java.awt.Color(102, 102, 102));
        lblMedCategory.setText(" Category");
        panInventoryManagement.add(lblMedCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 290, 30));

        lblManufacturerN.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblManufacturerN.setForeground(new java.awt.Color(102, 102, 102));
        lblManufacturerN.setText("Manufacturer Name");
        panInventoryManagement.add(lblManufacturerN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 290, 30));

        txtManufacturerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturerNameActionPerformed(evt);
            }
        });
        panInventoryManagement.add(txtManufacturerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 290, 30));

        valManufacturerName.setForeground(new java.awt.Color(255, 61, 0));
        valManufacturerName.setText("Please enter valid manufacturer name");
        panInventoryManagement.add(valManufacturerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 290, 20));

        lblDOM.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblDOM.setForeground(new java.awt.Color(102, 102, 102));
        lblDOM.setText("Date of Manufacturer");
        panInventoryManagement.add(lblDOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 290, 30));

        lblShellLife.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblShellLife.setForeground(new java.awt.Color(102, 102, 102));
        lblShellLife.setText("Shell Life");
        panInventoryManagement.add(lblShellLife, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 290, 30));

        lblName6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblName6.setForeground(new java.awt.Color(102, 102, 102));
        lblName6.setText("Ingredients");
        panInventoryManagement.add(lblName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 290, 30));

        txtMedicineName6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicineName6ActionPerformed(evt);
            }
        });
        panInventoryManagement.add(txtMedicineName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 230, 30));

        valIngredients.setForeground(new java.awt.Color(255, 61, 0));
        valIngredients.setText("Please enter valid ingredients");
        panInventoryManagement.add(valIngredients, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 290, 20));

        drpStatusofMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        drpStatusofMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpStatusofMedicineActionPerformed(evt);
            }
        });
        panInventoryManagement.add(drpStatusofMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 290, 30));

        comboCategoryMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panInventoryManagement.add(comboCategoryMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 290, 30));
        panInventoryManagement.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 50, 30));

        txtIngMed.setColumns(20);
        txtIngMed.setRows(5);
        jScrollPane1.setViewportView(txtIngMed);

        panInventoryManagement.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, 180));
        panInventoryManagement.add(spinShellLife, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 80, 30));

        btnAdd.setBackground(new java.awt.Color(0, 153, 255));
        btnAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Plus(2).png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panInventoryManagement.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 150, 90, 30));

        btnResetMed.setBackground(new java.awt.Color(255, 51, 0));
        btnResetMed.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnResetMed.setForeground(new java.awt.Color(255, 255, 255));
        btnResetMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Reverse.png"))); // NOI18N
        btnResetMed.setText("RESET");
        btnResetMed.setIconTextGap(10);
        btnResetMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetMedActionPerformed(evt);
            }
        });
        panInventoryManagement.add(btnResetMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 140, 40));

        btnsubmitMed.setBackground(new java.awt.Color(0, 153, 0));
        btnsubmitMed.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnsubmitMed.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmitMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Double Tick.png"))); // NOI18N
        btnsubmitMed.setText("SUBMIT");
        btnsubmitMed.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnsubmitMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitMedActionPerformed(evt);
            }
        });
        panInventoryManagement.add(btnsubmitMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 140, 40));
        panInventoryManagement.add(dateDOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 290, 30));

        PanelInventoryM.addTab("Create Medicine", panInventoryManagement);

        add(PanelInventoryM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 800, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void btnOrderUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrderUpdateActionPerformed

    private void txtMedicineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicineNameActionPerformed

    private void txtManufacturerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufacturerNameActionPerformed

    private void drpStatusofMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpStatusofMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drpStatusofMedicineActionPerformed

    private void txtMedicineName6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicineName6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicineName6ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnResetMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetMedActionPerformed

    private void btnsubmitMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitMedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PanelInventoryM;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnOrderDelete;
    private javax.swing.JButton btnOrderUpdate;
    private javax.swing.JButton btnResetMed;
    private javax.swing.JButton btnsubmitMed;
    private javax.swing.JComboBox<String> comboCategoryMed;
    private com.toedter.calendar.JDateChooser dateDOM;
    private javax.swing.JComboBox<String> drpStatusofMedicine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblDOM;
    private javax.swing.JLabel lblManufacturerN;
    private javax.swing.JLabel lblMedCategory;
    private javax.swing.JLabel lblMedStatus;
    private javax.swing.JLabel lblMedicineName;
    private javax.swing.JLabel lblName6;
    private javax.swing.JLabel lblOrderTable;
    private javax.swing.JLabel lblShellLife;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lbllogo1;
    private javax.swing.JPanel panInventoryManagement;
    private javax.swing.JPanel panOrderManagement;
    private javax.swing.JSpinner spinShellLife;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextArea txtIngMed;
    private javax.swing.JTextField txtManufacturerName;
    private javax.swing.JTextField txtMedicineName;
    private javax.swing.JTextField txtMedicineName6;
    private javax.swing.JLabel valIngredients;
    private javax.swing.JLabel valManufacturerName;
    private javax.swing.JLabel valMedName;
    // End of variables declaration//GEN-END:variables
}
