/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.hospital;

import classes.Medicine;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import util.sql.MedicineSqlQuery;

/**
 *
 * @author sunayanashivanagi
 */
public class HospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalJPanel
     */
    DefaultPieDataset manfDataset;
    DefaultPieDataset categoryDataset;

    public HospitalJPanel() {
        initComponents();
        populateTable();
        this.manfDataset = new DefaultPieDataset();
        this.categoryDataset = new DefaultPieDataset();
        ArrayList<Medicine> mList = new ArrayList<>();
        MedicineSqlQuery msq = new MedicineSqlQuery();
        mList = msq.readAllMedicine();
        HashMap<String, Integer> manufacturerMap = new HashMap<>();
        HashMap<String, Integer> categoryMap = new HashMap<>();

        for (Medicine m : mList) {
            if (manufacturerMap.containsKey(m.getManufacturer_Name())) {
                int old = manufacturerMap.get(m.getManufacturer_Name());
                manufacturerMap.put(m.getManufacturer_Name(), old + 1);
            } else {
                manufacturerMap.put(m.getManufacturer_Name(), 0);
            }
            if (categoryMap.containsKey(m.getMedicine_Category())) {
                int old = categoryMap.get(m.getMedicine_Category());
                categoryMap.put(m.getMedicine_Category(), old + 1);
            } else {
                categoryMap.put(m.getMedicine_Category(), 0);
            }
        }
        manufacturerMap.forEach((k, v) -> this.manfDataset.setValue(k, v));
        categoryMap.forEach((k, v) -> this.categoryDataset.setValue(k, v));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelInventoryM = new javax.swing.JTabbedPane();
        Inventory = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedicine = new javax.swing.JTable();
        btnNewOrder = new javax.swing.JButton();
        btnViewManufacturer = new javax.swing.JButton();
        btnViewCategory = new javax.swing.JButton();
        lbllogo2 = new javax.swing.JLabel();
        Pharmacy_Orders = new javax.swing.JPanel();
        lbllogo1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPharmacyOrder = new javax.swing.JTable();
        btnNewOrder1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital");

        PanelInventoryM.setBackground(new java.awt.Color(255, 255, 255));
        PanelInventoryM.setForeground(new java.awt.Color(0, 51, 153));
        PanelInventoryM.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N

        Inventory.setBackground(new java.awt.Color(255, 255, 255));
        Inventory.setForeground(new java.awt.Color(0, 51, 153));
        Inventory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medicine Name", "Medicine Category", "Date of Manufacturing", "Manufacturer Name", "Medicine Status"
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
        jScrollPane2.setViewportView(tblMedicine);

        Inventory.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 24, 764, 530));

        btnNewOrder.setBackground(new java.awt.Color(0, 153, 255));
        btnNewOrder.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnNewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnNewOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Eye.png"))); // NOI18N
        btnNewOrder.setText("VIEW");
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
            }
        });
        Inventory.add(btnNewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 120, 34));

        btnViewManufacturer.setBackground(new java.awt.Color(255, 102, 102));
        btnViewManufacturer.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnViewManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        btnViewManufacturer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Chart.png"))); // NOI18N
        btnViewManufacturer.setText("CHART1");
        btnViewManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewManufacturerActionPerformed(evt);
            }
        });
        Inventory.add(btnViewManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 120, 34));

        btnViewCategory.setBackground(new java.awt.Color(255, 153, 0));
        btnViewCategory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnViewCategory.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Chart.png"))); // NOI18N
        btnViewCategory.setText("CHART2");
        btnViewCategory.setToolTipText("");
        btnViewCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCategoryActionPerformed(evt);
            }
        });
        Inventory.add(btnViewCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, 120, 34));

        lbllogo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        Inventory.add(lbllogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 608, 110, 70));

        PanelInventoryM.addTab("Inventory", Inventory);

        Pharmacy_Orders.setBackground(new java.awt.Color(255, 255, 255));
        Pharmacy_Orders.setForeground(new java.awt.Color(255, 255, 255));
        Pharmacy_Orders.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        Pharmacy_Orders.add(lbllogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 608, 110, 70));

        tblPharmacyOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medicine Name", "Medicine Category", "Pharmacy Name", "Manufacturer Name", "Medicine Status"
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
        jScrollPane3.setViewportView(tblPharmacyOrder);

        Pharmacy_Orders.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 24, 764, 530));

        btnNewOrder1.setBackground(new java.awt.Color(0, 153, 255));
        btnNewOrder1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnNewOrder1.setForeground(new java.awt.Color(255, 255, 255));
        btnNewOrder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Eye.png"))); // NOI18N
        btnNewOrder1.setText("VIEW");
        btnNewOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrder1ActionPerformed(evt);
            }
        });
        Pharmacy_Orders.add(btnNewOrder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 120, 34));

        PanelInventoryM.addTab("Hospital Orders", Pharmacy_Orders);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PanelInventoryM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(PanelInventoryM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMedicine.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }

        ArrayList<Medicine> mList = new ArrayList<>();
        MedicineSqlQuery msq = new MedicineSqlQuery();
        mList = msq.readAllMedicine();
        Medicine m = mList.get(selectedRow);
        new HospitalJDialog(null, true, m).show();
        populateTable();
    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void btnViewManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewManufacturerActionPerformed
        // TODO add your handling code here:
        JFreeChart chart = ChartFactory.createPieChart("Manufacturers", this.manfDataset, true, true, false);
        ChartFrame frame = new ChartFrame("Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(450, 450);
    }//GEN-LAST:event_btnViewManufacturerActionPerformed

    private void btnViewCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCategoryActionPerformed
        // TODO add your handling code here:
        JFreeChart chart = ChartFactory.createPieChart("Categories", this.categoryDataset, true, true, false);
        ChartFrame frame = new ChartFrame("Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(450, 450);
    }//GEN-LAST:event_btnViewCategoryActionPerformed

    private void btnNewOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrder1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewOrder1ActionPerformed
    private void populateTable() {
        ArrayList<Medicine> mList = new ArrayList<>();
        MedicineSqlQuery msq = new MedicineSqlQuery();
        mList = msq.readAllMedicine();

        DefaultTableModel model = (DefaultTableModel) tblMedicine.getModel();
        model.setRowCount(0);

        for (Medicine e : mList) {
            Object row[] = new Object[10];
            row[0] = e.getMedicine_Name();
            row[1] = e.getMedicine_Category();
            row[2] = e.getDate_Of_Manufacture();
            row[3] = e.getManufacturer_Name();
            row[4] = e.getMedicine_Status();

            if ((e.getMedicine_Status().equals("Available"))) {
                model.addRow(row);
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inventory;
    private javax.swing.JTabbedPane PanelInventoryM;
    private javax.swing.JPanel Pharmacy_Orders;
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnNewOrder1;
    private javax.swing.JButton btnViewCategory;
    private javax.swing.JButton btnViewManufacturer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbllogo1;
    private javax.swing.JLabel lbllogo2;
    private javax.swing.JTable tblMedicine;
    private javax.swing.JTable tblPharmacyOrder;
    // End of variables declaration//GEN-END:variables
}
