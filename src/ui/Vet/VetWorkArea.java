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
import model.WorkQueue.PharmacistWorkRequest;

/**
 *
 * @author raunak
 */
public class VetWorkArea extends javax.swing.JPanel {

    private JPanel workArea;
    private VetOrganization vetOrganization;
    private MedicalCareEnterprise enterprise;
    private Network network;
    private EcoSystem ecoSystem;
    private UserAccount userAccount;
    Animal animal;
    AnimalDirectory animalDirectory;

    /**
     * Creates new form VolunteerWorkArea
     */
    public VetWorkArea(JPanel userProcessContainer, UserAccount account,
            VetOrganization vetOrganization, MedicalCareEnterprise enterprise, Network network, EcoSystem ecoSystem) {
        initComponents();
        this.workArea = userProcessContainer;
        this.userAccount = account;
        this.animalDirectory = animalDirectory;
        this.vetOrganization = vetOrganization;
        this.enterprise = enterprise;
        this.network = network;
        this.ecoSystem = ecoSystem;

        for (Network net : ecoSystem.getNetworkList()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.equals(enterprise)) {
                    network = net;
                }
            }
        }

        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();
        model.setRowCount(0);
        for (WorkRequest request : network.getWorkQueue().getWorkRequestList()) {
            if (request instanceof MedCareRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = request;
                row[1] = request.getAnimal().getId();
                row[2] = request.getAnimal().getName();
                row[3] = request.getSender();
                row[4] = request.getReceiver() == null ? null : request.getReceiver();
                row[5] = request.getStatus();
                String result = ((MedCareRequest) request).getVetResult();
                row[6] = result == null ? "Waiting" : result;
                model.addRow(row);
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
        icon = new javax.swing.JLabel();

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

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_refresh2.png"))); // NOI18N
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

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_vet.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(lblTitle)
                        .addGap(196, 196, 196)
                        .addComponent(btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(icon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAssignToMe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewDetial))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnRefresh)))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnViewDetial)
                        .addComponent(btnAssignToMe)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateRequestTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblWorkRequests.getSelectedRow();
        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Processed")) {
                JOptionPane.showMessageDialog(null, "Request already processed.");
                return;
            } else if (request.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(this, "Request already closed.", "Thank you!", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                request.setReceiver(userAccount);
                request.setStatus("Processed");
                populateRequestTable();
                //         btnViewDetial.setEnabled(true);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }

        /**
         * int selectedRow = tblWorkRequests.getSelectedRow(); if (selectedRow <
         * 0 ) { JOptionPane.showMessageDialog(null, "Please select a request");
         * return; } MedCareRequest request = (MedCareRequest)
         * tblWorkRequests.getValueAt(selectedRow, 0); if (request.getReceiver()
         * != null) { JOptionPane.showMessageDialog(null, "Request already
         * assigned."); return; } if
         * (request.getStatus().equalsIgnoreCase("Processed")) { //
         * request.getStatus().equalsIgnoreCase("Medicine Prescribed") ||
         * request.getStatus().equalsIgnoreCase("Medical Test Requested")) {
         *
         * JOptionPane.showMessageDialog(null, "Request already processed.");
         * return; } else { request.setReceiver(userAccount);
         * request.setStatus("Processed"); // btnViewDetial.setEnabled(true);
         * populateRequestTable(); JOptionPane.showMessageDialog(null, "Request
         * has been assigned"); populateRequestTable(); } *
         */
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnViewDetialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetialActionPerformed
        int selectedRow = tblWorkRequests.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first");
            return;
        }
        WorkRequest wr = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
         if (wr.getReceiver() != userAccount) {
            JOptionPane.showMessageDialog(null, "This request is not assign to you.");
            return;
        }
        MedCareRequest request = (MedCareRequest) tblWorkRequests.getValueAt(selectedRow, 0);
        if (request.getStatus().equalsIgnoreCase("Completed")) {
            JOptionPane.showMessageDialog(null, "Request already completed.");
            return;
        }
        //     request.setVetResult("Under Examination");
        /**
         * for (Animal a : animalDirectory.getAnimalList()) { if (a.getId() ==
         * request.getAnimal().getId()) { animal = a; } }
         *
         */
        VetAnimalDetail vetAnimalDetailJPanel = new VetAnimalDetail(workArea, request, userAccount, vetOrganization,
                enterprise, animal, animalDirectory, ecoSystem);
        workArea.add("vetAnimalDetailJPanel", vetAnimalDetailJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnViewDetialActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewDetial;
    private javax.swing.JLabel icon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables
}
