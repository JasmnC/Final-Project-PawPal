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
        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {
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
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(181, 198, 232));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 890, 350));

        btnAssign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_assign.png"))); // NOI18N
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 150, 40));

        btnProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_process.png"))); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, 150, 40));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Pharmacist Work Area");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

       int selectedRow = tblWorkRequests.getSelectedRow();
        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Processed")) {
                JOptionPane.showMessageDialog(this, "Request already processed.","Warning",JOptionPane.WARNING_MESSAGE);
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
            JOptionPane.showMessageDialog(this, "Please select a request.","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }


    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
   int selectedRow = tblWorkRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table before proceeding","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        PharmacistWorkRequest request = (PharmacistWorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
         if (request.getReceiver() != userAccount) {
            JOptionPane.showMessageDialog(this, "This request is not assign to you.","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        PharmacistWorkRequest btwr = (PharmacistWorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
        if (btwr.getStatus().equalsIgnoreCase("Completed")) {
            JOptionPane.showMessageDialog(this, "Request already completed.","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }


        PharmacistProcessRequest ppr = new PharmacistProcessRequest(userProcessContainer, request, userAccount, enterprise, animal, animalDirectory, ecosystem, organization);
        userProcessContainer.add("PharmacistProcessRequest", ppr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnProcessActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables
}
