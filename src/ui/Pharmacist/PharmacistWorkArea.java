/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Pharmacist;

import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Animal.Animal;
import model.Animal.AnimalDirectory;
import model.EcoSystem.EcoSystem;
import model.Enterprise.Enterprise;
import model.Enterprise.MedicalCareEnterprise;
import model.Network.Network;
import model.Organization.TreatmentOrganization;
import model.UserAccount.UserAccount;
import model.WorkQueue.PharmacistWorkRequest;
import model.WorkQueue.WorkRequest;

/**
 *
 * @author ariel
 */
public class PharmacistWorkArea extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private TreatmentOrganization organization;
    private Enterprise enterprise;
    private EcoSystem ecosystem;
    private UserAccount userAccount;
    private Animal animal;
    private AnimalDirectory animalDirectory;
    Network network;

    public PharmacistWorkArea(JPanel userProcessContainer, UserAccount account, 
            TreatmentOrganization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {

        initComponents();
      this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = (TreatmentOrganization) organization;
        this.enterprise = enterprise;
        this.network = network;
        this.ecosystem = ecosystem;
        for (Network net : ecosystem.getNetworkList()) {
            for (Enterprise e : net.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.equals(enterprise)) {
                    network = net;
                }
            }
        }

        populateTable();
    }

    public void populateTable() {
      DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();
        model.setRowCount(0);
        for (WorkRequest request : network.getWorkQueue().getWorkRequestList()) {
            if (request instanceof PharmacistWorkRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = request;
                row[1] = request.getAnimal().getId();
                row[2] = request.getAnimal().getName();
                row[3] = request.getSender();
                row[4] = request.getReceiver() == null ? null : request.getReceiver();
                row[5] = request.getStatus();
                String result = ((PharmacistWorkRequest) request).getResult();
                row[6] = result == null ? "Waiting" : result;
                model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

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
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        }

        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("Pharmacist Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssign)
                        .addGap(18, 18, 18)
                        .addComponent(btnProcess))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblTitle)
                            .addGap(174, 174, 174)
                            .addComponent(btnRefresh))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAssign, btnProcess});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnRefresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnProcess))
                .addContainerGap(321, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

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
                populateTable();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }


    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
   int selectedRow = tblWorkRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table before proceeding");
            return;
        }
        PharmacistWorkRequest request = (PharmacistWorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
         if (request.getReceiver() != userAccount) {
            JOptionPane.showMessageDialog(null, "This request is not assign to you.");
            return;
        }
        PharmacistWorkRequest btwr = (PharmacistWorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
        if (btwr.getStatus().equalsIgnoreCase("Completed")) {
            JOptionPane.showMessageDialog(null, "Request already completed.");
            return;
        }


        PharmacistProcessRequest ppr = new PharmacistProcessRequest(userProcessContainer, request, userAccount, enterprise, animal, animalDirectory, ecosystem, organization);
        userProcessContainer.add("PharmacistProcessRequest", ppr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables
}
