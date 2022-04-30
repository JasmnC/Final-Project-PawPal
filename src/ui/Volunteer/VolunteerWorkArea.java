/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Volunteer;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.EcoSystem.EcoSystem;
import model.Enterprise.VolunteerEnterprise;
import model.Network.Network;
import model.Organization.VolunteerOrganization;
import model.UserAccount.UserAccount;
import model.WorkQueue.VolunteerRequest;
import model.WorkQueue.WorkRequest;

/**
 *
 * @author anitachen
 */
public class VolunteerWorkArea extends javax.swing.JPanel {

    private JPanel workArea;
    private VolunteerOrganization organization;
    private VolunteerEnterprise enterprise;
    private Network network;
    private EcoSystem ecosystem;
    private UserAccount userAccount;
    
    /**
     * Creates new form VolunteerWorkArea
     */
    public VolunteerWorkArea(JPanel userProcessContainer, UserAccount account, VolunteerOrganization organization, VolunteerEnterprise enterprise, Network network, EcoSystem ecosystem) {
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
        btnComplete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 246, 212));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Process Volunteer Request");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        tblWorkRequests.setBackground(new java.awt.Color(255, 238, 238));
        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Animal Shelter", "Volunteer Manager", "Volunteer Assigned", "Enterprise", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 890, 350));

        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed

        int selectedRow = tblWorkRequests.getSelectedRow();

        if (selectedRow >= 0) {
            
            VolunteerRequest selectedRequest = (VolunteerRequest) tblWorkRequests.getValueAt(selectedRow, 0);
            if (selectedRequest.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(this, "Request already completed. Please select another one.","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                selectedRequest.setStatus("Completed");
                JOptionPane.showMessageDialog(this, "Request completed!", "Information",JOptionPane.INFORMATION_MESSAGE);
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please choose a request first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }  
        
    }//GEN-LAST:event_btnCompleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComplete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();
        model.setRowCount(0);
        
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if (request instanceof VolunteerRequest){
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getSender().getEnterprise();
                row[3] = request.getReceiver() == null ? null : request.getReceiver();
                row[4] = ((VolunteerRequest) request).getAssignedVolunteer();
                row[5] = request.getReceiver() == null ? null :request.getReceiver().getEnterprise();
                row[6] = request.getStatus();
                model.addRow(row);
            }
        }
        
    }
}
