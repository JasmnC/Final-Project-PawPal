/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AnimalManagerRole;

import ui.AnimalRegistorRole.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Animal.Animal;
import model.Animal.AnimalDirectory;
import model.Enterprise.AnimalShelterEnterprise;
import model.Network.Network;
import model.Organization.AnimalManagementOrganization;
import model.UserAccount.UserAccount;
import model.WorkQueue.MedCareRequest;
import model.WorkQueue.WorkRequest;

/**
 *
 * @author raunak
 */
public class ViewOngingAnimalJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private AnimalShelterEnterprise enterprise;
    private Network network;
    private Animal animal;
    
    public ViewOngingAnimalJPanel(JPanel userProcessContainer, UserAccount account, Animal animal, AnimalShelterEnterprise enterprise, Network network) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.animal = animal;
        
        showAnimalDetails();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        txtAnimalName = new javax.swing.JTextField();
        lblMessage5 = new javax.swing.JLabel();
        txtAnimalArea = new javax.swing.JTextField();
        lblMessage6 = new javax.swing.JLabel();
        txtAnimalSex = new javax.swing.JTextField();
        lblMessage7 = new javax.swing.JLabel();
        txtAnimalWeight = new javax.swing.JTextField();
        lblMessage8 = new javax.swing.JLabel();
        txtAnimalMessageFromBehaviorTharapipst = new javax.swing.JTextField();
        lblMessage9 = new javax.swing.JLabel();
        txtAnimalMessageFromVet = new javax.swing.JTextField();
        lblMessage10 = new javax.swing.JLabel();
        txtAnimalMessageFromPharmacy = new javax.swing.JTextField();
        lblMessage11 = new javax.swing.JLabel();
        lblMessage12 = new javax.swing.JLabel();
        btnAnimalManagerRequestMedicalCare = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimalManagerWorkArea = new javax.swing.JTable();
        lblMessage13 = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblMedicalCareMessage = new javax.swing.JLabel();
        txtSendMedicalCareMessage = new javax.swing.JTextField();
        viewAdoptionRequestJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("On Going Animal");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        txtAnimalName.setEnabled(false);
        add(txtAnimalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 140, -1));

        lblMessage5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage5.setText("Name:");
        add(lblMessage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 50, -1));

        txtAnimalArea.setEnabled(false);
        add(txtAnimalArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 140, -1));

        lblMessage6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage6.setText("Area:");
        add(lblMessage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        txtAnimalSex.setEnabled(false);
        add(txtAnimalSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, -1));

        lblMessage7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage7.setText("Sex:");
        add(lblMessage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        txtAnimalWeight.setEnabled(false);
        add(txtAnimalWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 140, -1));

        lblMessage8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage8.setText("Weight:");
        add(lblMessage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        txtAnimalMessageFromBehaviorTharapipst.setEnabled(false);
        add(txtAnimalMessageFromBehaviorTharapipst, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 217, -1));

        lblMessage9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage9.setText("Behavior Check:");
        add(lblMessage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        txtAnimalMessageFromVet.setEnabled(false);
        add(txtAnimalMessageFromVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 217, -1));

        lblMessage10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage10.setText("Vet Feedback:");
        add(lblMessage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        txtAnimalMessageFromPharmacy.setEnabled(false);
        add(txtAnimalMessageFromPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 217, -1));

        lblMessage11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage11.setText("Pharmacy Feedback:");
        add(lblMessage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        lblMessage12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage12.setText("Photo:");
        add(lblMessage12, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 87, -1, -1));

        btnAnimalManagerRequestMedicalCare.setText("Request Medical Care");
        btnAnimalManagerRequestMedicalCare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimalManagerRequestMedicalCareActionPerformed(evt);
            }
        });
        add(btnAnimalManagerRequestMedicalCare, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, -1));

        tblAnimalManagerWorkArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Recipient", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAnimalManagerWorkArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 890, 150));

        lblMessage13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage13.setText("Medical Care Status:");
        add(lblMessage13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 274, -1, 30));
        add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 209, 218));

        lblMedicalCareMessage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMedicalCareMessage.setText("Message:");
        add(lblMedicalCareMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));
        add(txtSendMedicalCareMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 217, -1));

        viewAdoptionRequestJButton.setText("View Adoption Request");
        viewAdoptionRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdoptionRequestJButtonActionPerformed(evt);
            }
        });
        add(viewAdoptionRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 178, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed


        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManagerWorkArea", new ManageAnimalJPanel(userProcessContainer, userAccount, (AnimalManagementOrganization) userAccount.getOrgainization(), enterprise, network, network.getEcosystem()));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAnimalManagerRequestMedicalCareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimalManagerRequestMedicalCareActionPerformed

        String requestVetMessage = txtSendMedicalCareMessage.getText();
        if(requestVetMessage.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter something to send.","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        MedCareRequest request = new MedCareRequest();
        request.setMessage(requestVetMessage);
        request.setSender(userAccount);
        request.setStatus("Pending for Vet");
        request.setAnimal(animal);
        
        network.getWorkQueue().getWorkRequestList().add(request);
        animal.getWorkQueue().getWorkRequestList().add(request);
        
        JOptionPane.showMessageDialog(this, "Medical Request sent.", "Information",JOptionPane.INFORMATION_MESSAGE);
        populateTable();
        txtSendMedicalCareMessage.setText("");
        
//        RequestMedicalCareJPanel rmcjp = new RequestMedicalCareJPanel(userProcessContainer, userAccount, enterprise, network, animal);
//        userProcessContainer.add("requestMedicalCareJPanel", rmcjp);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnimalManagerRequestMedicalCareActionPerformed

    private void viewAdoptionRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdoptionRequestJButtonActionPerformed
        // TODO add your handling code here:
        AdoptionRequestJPanel adoptionRequestJPanel = new AdoptionRequestJPanel(userProcessContainer, userAccount, animal, enterprise, network);
        userProcessContainer.add("adoptionRequestJPanel", adoptionRequestJPanel);

        CardLayout layout = (CardLayout) (userProcessContainer.getLayout());
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAdoptionRequestJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnimalManagerRequestMedicalCare;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMedicalCareMessage;
    private javax.swing.JLabel lblMessage10;
    private javax.swing.JLabel lblMessage11;
    private javax.swing.JLabel lblMessage12;
    private javax.swing.JLabel lblMessage13;
    private javax.swing.JLabel lblMessage5;
    private javax.swing.JLabel lblMessage6;
    private javax.swing.JLabel lblMessage7;
    private javax.swing.JLabel lblMessage8;
    private javax.swing.JLabel lblMessage9;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAnimalManagerWorkArea;
    private javax.swing.JTextField txtAnimalArea;
    private javax.swing.JTextField txtAnimalMessageFromBehaviorTharapipst;
    private javax.swing.JTextField txtAnimalMessageFromPharmacy;
    private javax.swing.JTextField txtAnimalMessageFromVet;
    private javax.swing.JTextField txtAnimalName;
    private javax.swing.JTextField txtAnimalSex;
    private javax.swing.JTextField txtAnimalWeight;
    private javax.swing.JTextField txtSendMedicalCareMessage;
    private javax.swing.JButton viewAdoptionRequestJButton;
    // End of variables declaration//GEN-END:variables

    private void showAnimalDetails() {

        txtAnimalName.setText(animal.getName());
        txtAnimalArea.setText(animal.getArea());
        txtAnimalSex.setText(animal.getSex());
        txtAnimalWeight.setText(animal.getWeight());
        txtAnimalMessageFromBehaviorTharapipst.setText(animal.getBaviorCheckMessage());
        txtAnimalMessageFromPharmacy.setText(animal.getPharmacyMessage());
        txtAnimalMessageFromVet.setText(animal.getVetMessage());
        
        lblPhoto.setIcon(animal.getPhotoIcon());
        
        populateTable();
        

    }

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblAnimalManagerWorkArea.getModel();
        model.setRowCount(0);
        
        if (!animal.getWorkQueue().getWorkRequestList().isEmpty()){
            for (WorkRequest request : animal.getWorkQueue().getWorkRequestList()){
                if (request instanceof MedCareRequest){
                    Object[] row = new Object[4];
                    row[0] = request;
                    row[1] = animal.getManager();
                    row[2] = request.getReceiver() == null ? null : request.getReceiver();
                    row[3] = request.getStatus();
                    model.addRow(row);
                }   
            }
        }
                
    }
}
