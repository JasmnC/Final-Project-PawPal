/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Vet;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.EcoSystem.EcoSystem;
import model.Enterprise.Enterprise;
import model.Enterprise.MedicalCareEnterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.Organization.VetOrganization;
import model.UserAccount.UserAccount;
import model.Animal.Animal;
import model.Animal.AnimalDirectory;

import model.WorkQueue.MedCareRequest;
import model.WorkQueue.WorkRequest;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class VetWorkArea extends javax.swing.JPanel {

    private JPanel workArea;
    private VetOrganization vetOrganization;
    private MedicalCareEnterprise enterprise;
    private Network network;
    private EcoSystem ecosystem;
    private UserAccount userAccount;
    Animal animal;
    AnimalDirectory animalDirectory;

    /**
     * Creates new form VolunteerWorkArea
     */
    public VetWorkArea(JPanel userProcessContainer, UserAccount account,
            VetOrganization vetOrganization, MedicalCareEnterprise enterprise, Network network, EcoSystem ecosystem) {
        initComponents();
        this.workArea = userProcessContainer;
        this.userAccount = account;
  //      this.animalDirectory = animalDirectory;
        this.vetOrganization = vetOrganization;
        this.enterprise = enterprise;
        this.network = network;
        this.ecosystem = ecosystem;
        
        for (Network net : ecosystem.getNetworkList()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.equals(enterprise)) {
                    network = net;
                }
            }
        }
        btnViewDetial.setEnabled(false);
        populateRequestTable();
    }



    public void populateRequestTable() {
        DefaultTableModel table = (DefaultTableModel) tblWorkRequests.getModel();
        table.setRowCount(0);
        for (WorkRequest req : vetOrganization.getWorkQueue().getWorkRequestList()) {
            if (req instanceof MedCareRequest) {
                MedCareRequest request = (MedCareRequest) req;
                if (request instanceof MedCareRequest) {
                    Object[] row = new Object[table.getColumnCount()];
                    row[0] = req;
                    row[1] = req.getAnimal().getId();
                    row[2] = req.getAnimal().getName();
                    row[3] = req.getSender();
                    row[4] = req.getReceiver();
                    row[5] = req.getStatus();
                    row[6] = req.getVetResult();
                    table.addRow(row);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnAssignToMe = new javax.swing.JButton();
        btnViewDetial = new javax.swing.JButton();

        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Animal ID", "Animal Name", "Sender", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequests);
        if (tblWorkRequests.getColumnModel().getColumnCount() > 0) {
            tblWorkRequests.getColumnModel().getColumn(0).setResizable(false);
            tblWorkRequests.getColumnModel().getColumn(1).setResizable(false);
            tblWorkRequests.getColumnModel().getColumn(2).setResizable(false);
            tblWorkRequests.getColumnModel().getColumn(3).setResizable(false);
            tblWorkRequests.getColumnModel().getColumn(4).setResizable(false);
            tblWorkRequests.getColumnModel().getColumn(5).setResizable(false);
            tblWorkRequests.getColumnModel().getColumn(6).setResizable(false);
        }

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("Vet Work Area");

        btnAssignToMe.setText("Assign To Me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        btnViewDetial.setText("View Animal Detail");
        btnViewDetial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addGap(210, 210, 210)
                                .addComponent(btnRefresh))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 405, Short.MAX_VALUE)
                        .addComponent(btnAssignToMe)
                        .addGap(31, 31, 31)
                        .addComponent(btnViewDetial)
                        .addGap(98, 98, 98))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnRefresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetial)
                    .addComponent(btnAssignToMe))
                .addGap(311, 311, 311))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateRequestTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }
        MedCareRequest request = (MedCareRequest) tblWorkRequests.getValueAt(selectedRow, 0);
        if (request.getReceiver() != null) {
            JOptionPane.showMessageDialog(null, "Request already assigned.");
            return;
        }
        if (request.getStatus().equalsIgnoreCase("Pending")) {
            //   request.getStatus().equalsIgnoreCase("Medicine Prescribed") || request.getStatus().equalsIgnoreCase("Medical Test Requested")) {

            JOptionPane.showMessageDialog(null, "Request already processed.");
            return;
        } else {
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            btnViewDetial.setEnabled(true);
            populateRequestTable();
            JOptionPane.showMessageDialog(null, "Request has been assigned");
            populateRequestTable();
        }
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnViewDetialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetialActionPerformed
        // TODO add your handling code here:
            int selectedRow = tblWorkRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request from table before proceeding");
            return;
        }
        MedCareRequest request = (MedCareRequest) tblWorkRequests.getValueAt(selectedRow, 0);
        if (request.getStatus().equalsIgnoreCase("Completed")) {
            JOptionPane.showMessageDialog(null, "Request already completed.");
            return;
        }
        request.setResult("Under Examination");
        for (Animal a : animalDirectory.getAnimalList()) {
            if (a.getId() == request.getAnimal().getId()) {
                animal = a;
            }
        }
     
        VetAnimalDetail vetAnimalDetailJPanel = new VetAnimalDetail(workArea);
        workArea.add("vetAnimalDetailJPanel", vetAnimalDetailJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnViewDetialActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewDetial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables
}
