/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdoptionManager;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.EcoSystem.CommonMail;
import model.EcoSystem.EcoSystem;
import model.Enterprise.AdoptionEnterprise;
import model.Network.Network;
import model.Organization.AdoptionOperationOrganization;
import model.UserAccount.UserAccount;
import model.WorkQueue.AdopterAuthorizationRequest;
import model.WorkQueue.WorkRequest;

/**
 *
 * @author anitachen
 */
public class AdoptionManagerWorkArea extends javax.swing.JPanel {

    private JPanel workArea;
    private AdoptionOperationOrganization organization;
    private AdoptionEnterprise enterprise;
    private Network network;
    private EcoSystem ecosystem;
    private UserAccount userAccount;

    /**
     * Creates new form AdoptionManagerWorkArea
     */
    public AdoptionManagerWorkArea(JPanel userProcessContainer, UserAccount account, AdoptionOperationOrganization organization, AdoptionEnterprise enterprise, Network network, EcoSystem ecosystem) {

        initComponents();

        this.workArea = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.ecosystem = ecosystem;

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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 237, 252));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Adopter Authorization");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Sender Email", "Organization", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tblWorkRequests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 890, 350));

        btnApprove.setBackground(new java.awt.Color(204, 255, 204));
        btnApprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_approved.png"))); // NOI18N
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, -1, -1));

        btnAssign.setBackground(new java.awt.Color(204, 255, 204));
        btnAssign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_assign.png"))); // NOI18N
        btnAssign.setText("Assign to Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed

        int selectedRow = tblWorkRequests.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
            if (request.getReceiver() == userAccount) {
                if (request.getStatus().equalsIgnoreCase("Approved")) {
                    JOptionPane.showMessageDialog(this, "Request already completed. Please select another one.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                } else {
                    request.setStatus("Approved");
                    populateTable();
                    JOptionPane.showMessageDialog(this, "Account approved", "Infornation", JOptionPane.INFORMATION_MESSAGE);
                    String subject = "Account activation";
                    String content = "Dear Adopter, \nyour PawPal account: [" + request.getSender() + "] has been activated. You can check your status through your credentials. \nThank you!";
                    CommonMail.sendEmailMessage(request.getSender().getEmailId(), subject, content);
                }
            } else {
                JOptionPane.showMessageDialog(this, "This request is not assign to you.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please choose a request first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblWorkRequests.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Approved")) {
                JOptionPane.showMessageDialog(this, "Request already completed. Please select another one.", "Warning", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                request.setReceiver(userAccount);
                request.setStatus("Reviewing");
                populateTable();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please choose a request to assign to yourself", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnAssign;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();
        model.setRowCount(0);

        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {
            if (request instanceof AdopterAuthorizationRequest) {

                Object[] row = new Object[6];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getSender().getEmailId();
                row[3] = request.getSender().getOrgainization();
                row[4] = request.getReceiver() == null ? null : request.getReceiver();
                row[5] = request.getStatus();

                model.addRow(row);
            }
        }
    }
}
