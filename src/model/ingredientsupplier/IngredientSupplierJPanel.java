/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.ingredientsupplier;

import util.extras.MedicineDetailsJDialog;

/**
 *
 * @author sunayanashivanagi
 */
public class IngredientSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form IngredientSupplierJPanel
     */
    javax.swing.JSplitPane splitPane;
    public IngredientSupplierJPanel(javax.swing.JSplitPane splitPane) {
        initComponents();
        this.splitPane=splitPane;
        System.out.println("Inside IS Right");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInventoryM = new javax.swing.JTabbedPane();
        panOrderManagement = new javax.swing.JPanel();
        lblOrderTable = new javax.swing.JLabel();
        btnNewOrder = new javax.swing.JButton();
        lbllogo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnOrderDelete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        lblOrderTable.setText("Order Table");
        lblOrderTable.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblOrderTable.setIconTextGap(10);
        panOrderManagement.add(lblOrderTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 24, 499, 56));

        btnNewOrder.setBackground(new java.awt.Color(0, 153, 255));
        btnNewOrder.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnNewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnNewOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Eye.png"))); // NOI18N
        btnNewOrder.setText("VIEW");
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
            }
        });
        panOrderManagement.add(btnNewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 700, 120, 34));

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        panOrderManagement.add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 698, 110, 70));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medicine name", "Category", "Date Of Manufacturing", "Manufacturing Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        panOrderManagement.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 764, 553));

        btnOrderDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnOrderDelete.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnOrderDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Remove.png"))); // NOI18N
        btnOrderDelete.setText("DELETE");
        btnOrderDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDeleteActionPerformed(evt);
            }
        });
        panOrderManagement.add(btnOrderDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 700, 118, 34));

        PanelInventoryM.addTab("Logistics Department", panOrderManagement);

        add(PanelInventoryM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed
        // TODO add your handling code here:
       new MedicineDetailsJDialog(null,true).show();
    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void btnOrderDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrderDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PanelInventoryM;
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnOrderDelete;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblOrderTable;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panOrderManagement;
    private javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables
}
