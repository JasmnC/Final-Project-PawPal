/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Adpoter;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Animal.Animal;
import model.EcoSystem.EcoSystem;
import model.Enterprise.AdoptionEnterprise;
import model.Enterprise.AnimalShelterEnterprise;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.AdopterOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import model.WorkQueue.AdoptionRequest;
import model.WorkQueue.WorkRequest;

/**
 *
 * @author anitachen
 */
public class AdopterWorkArea extends javax.swing.JPanel {

    private JPanel workArea;
    private AdopterOrganization organization;
    private AdoptionEnterprise enterprise;
    private Network network;
    private EcoSystem ecosystem;
    private UserAccount userAccount;
    
    /**
     * Creates new form AdopterWorkArea
     */
    public AdopterWorkArea(JPanel userProcessContainer, UserAccount account, AdopterOrganization organization, AdoptionEnterprise enterprise, Network network, EcoSystem ecosystem) {
        initComponents();
        
        this.workArea = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.ecosystem = ecosystem;
        
        String status = userAccount.getWorkQueue().getWorkRequestList().get(0).getStatus();
        txtAuthorizationStatus.setText(status);
        
        if (!txtAuthorizationStatus.getText().equalsIgnoreCase("Approved")){
            hideInfo();
            return;
        }
        
        populateAnimalTable();
        populateRequestTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAuthorizationStatus = new javax.swing.JLabel();
        txtAuthorizationStatus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimalList = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblAnimalSelection = new javax.swing.JLabel();
        btnViewDetails = new javax.swing.JButton();
        btnSendRequest = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblAdoptionRequest = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAdoptionRequests = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 231, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAuthorizationStatus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAuthorizationStatus.setText("Authorization Status:");
        add(lblAuthorizationStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));
        add(txtAuthorizationStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 163, -1));

        tblAnimalList.setBackground(new java.awt.Color(255, 238, 238));
        tblAnimalList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Sex", "Area", "Manager", "Animal Shelter"
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
        jScrollPane1.setViewportView(tblAnimalList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 890, 150));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 74, 659, -1));

        lblAnimalSelection.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAnimalSelection.setText("Animal Selection");
        add(lblAnimalSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 104, -1, -1));

        btnViewDetails.setBackground(new java.awt.Color(128, 80, 80));
        btnViewDetails.setForeground(new java.awt.Color(238, 238, 238));
        btnViewDetails.setText("View");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });
        add(btnViewDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, -1, -1));

        btnSendRequest.setBackground(new java.awt.Color(255, 161, 161));
        btnSendRequest.setForeground(new java.awt.Color(238, 238, 238));
        btnSendRequest.setText("Adopt");
        btnSendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestActionPerformed(evt);
            }
        });
        add(btnSendRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 318, 659, -1));

        lblAdoptionRequest.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAdoptionRequest.setText("Your Adoption Request");
        add(lblAdoptionRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 348, -1, -1));

        tblAdoptionRequests.setBackground(new java.awt.Color(255, 238, 238));
        tblAdoptionRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Manager", "Enterprise", "Status"
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
        jScrollPane2.setViewportView(tblAdoptionRequests);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 890, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestActionPerformed

        int selectedRow = tblAnimalList.getSelectedRow();

        if (selectedRow >= 0) {
            
            Animal selectedAnimal = (Animal) tblAnimalList.getValueAt(selectedRow, 0);
            
            for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
                if (request.getAnimal() == selectedAnimal){
                    JOptionPane.showMessageDialog(this, "Your have sent requst for this animal.\nPlease refer to request history for application result.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            
            AdoptionRequest request = new AdoptionRequest();
            request.setMessage("Adoption Request");
            request.setAnimal(selectedAnimal);
            request.setSender(userAccount);
            request.setStatus("Pending Review");
            
            network.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(this, "Adotion request has been sent. Please wait for the result.","Information",JOptionPane.INFORMATION_MESSAGE);
            populateRequestTable();
            
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
                
        
    }//GEN-LAST:event_btnSendRequestActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed

        int selectedRow = tblAnimalList.getSelectedRow();
        
        if (selectedRow >= 0) {
            Animal selectedAnimal = (Animal) tblAnimalList.getValueAt(selectedRow, 0);
            
            JPanel viewAnimalDetailJPanel = new ViewAnimalDetailJPanel(workArea, selectedAnimal);
            workArea.add("viewAnimalDetailJPanel", viewAnimalDetailJPanel);
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.next(workArea);
            
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        

    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendRequest;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAdoptionRequest;
    private javax.swing.JLabel lblAnimalSelection;
    private javax.swing.JLabel lblAuthorizationStatus;
    private javax.swing.JTable tblAdoptionRequests;
    private javax.swing.JTable tblAnimalList;
    private javax.swing.JTextField txtAuthorizationStatus;
    // End of variables declaration//GEN-END:variables

    private void hideInfo() {
        jSeparator1.setVisible(false);
        lblAnimalSelection.setVisible(false);
        jScrollPane1.setVisible(false);
        tblAnimalList.setVisible(false);
        btnSendRequest.setVisible(false);
        btnViewDetails.setVisible(false);
        jSeparator2.setVisible(false);
        lblAdoptionRequest.setVisible(false);
        jScrollPane2.setVisible(false);
        tblAdoptionRequests.setVisible(false);
    }

    private void populateAnimalTable() {

        DefaultTableModel model = (DefaultTableModel) tblAnimalList.getModel();
        model.setRowCount(0);
        
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof AnimalShelterEnterprise){
                for (Animal a : ((AnimalShelterEnterprise) e).getAnimalDirectory().getAnimalList()){
                    if (a.getAdoptor() == null && a.getManager() != null){
                        
                        Object[] row = new Object[5];
                        row[0] = a;
                        row[1] = a.getSex();
                        row[2] = a.getArea();
                        row[3] = a.getManager();
                        row[4] = a.getManager().getEnterprise();

                        model.addRow(row);
                    }        
                }
            }
        }     
    }

    private void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) tblAdoptionRequests.getModel();
        model.setRowCount(0);
        
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if (request instanceof AdoptionRequest){
                
                Object[] row = new Object[5];
                row[0] = request.getAnimal().getId();
                row[1] = request.getAnimal().getName();
                row[2] = request.getAnimal().getManager();
                row[3] = request.getAnimal().getManager().getEnterprise();
                row[4] = request.getStatus();
                
                model.addRow(row);
            }
        }
    }
}

