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
    
    public ViewOngingAnimalJPanel(JPanel userProcessContainer, UserAccount account, AnimalShelterEnterprise enterprise, Network network) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.animal = enterprise.getAnimalDirectory().getAnimalByManager(userAccount);
        
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
        txtAnimalPhoto = new javax.swing.JTextField();
        btnAnimalManagerRequestMedicalCare = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimalManagerWorkArea = new javax.swing.JTable();
        lblMessage13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("On Going Animal");

        lblMessage5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage5.setText("Name:");

        lblMessage6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage6.setText("Area:");

        lblMessage7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage7.setText("Sex:");

        lblMessage8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage8.setText("Weight:");

        lblMessage9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage9.setText("Message from Behavior Check:");

        lblMessage10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage10.setText("Message from Vet:");

        lblMessage11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage11.setText("Message from Pharmacy:");

        lblMessage12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage12.setText("Photo:");

        txtAnimalPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnimalPhotoActionPerformed(evt);
            }
        });

        btnAnimalManagerRequestMedicalCare.setText("Request Medical Care");
        btnAnimalManagerRequestMedicalCare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimalManagerRequestMedicalCareActionPerformed(evt);
            }
        });

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

        lblMessage13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage13.setText("Medical Care Status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAnimalManagerRequestMedicalCare)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(btnBack)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTitle)
                                        .addGap(88, 88, 88))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblMessage5)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblMessage6)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtAnimalArea, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblMessage7)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtAnimalSex, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblMessage8)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtAnimalWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblMessage10)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtAnimalMessageFromVet, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblMessage11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtAnimalMessageFromPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblMessage9)
                                                .addComponent(lblMessage13))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtAnimalMessageFromBehaviorTharapipst, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(44, 44, 44)
                            .addComponent(lblMessage12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAnimalPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage5)
                    .addComponent(txtAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMessage12)
                    .addComponent(txtAnimalPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage6)
                    .addComponent(txtAnimalArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage7)
                    .addComponent(txtAnimalSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage8)
                    .addComponent(txtAnimalWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAnimalMessageFromVet, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMessage10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAnimalMessageFromPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMessage11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAnimalMessageFromBehaviorTharapipst, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMessage9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMessage13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnimalManagerRequestMedicalCare)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AnimalManagerWorkAreaJPanel amwajp = (AnimalManagerWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);


    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAnimalManagerRequestMedicalCareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimalManagerRequestMedicalCareActionPerformed

        // create work request
        
        RequestMedicalCareJPanel rmcjp = new RequestMedicalCareJPanel(userProcessContainer, userAccount, enterprise, network, animal);
        userProcessContainer.add("eequestMedicalCareJPanel", rmcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnimalManagerRequestMedicalCareActionPerformed

    private void txtAnimalPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnimalPhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnimalPhotoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnimalManagerRequestMedicalCare;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage10;
    private javax.swing.JLabel lblMessage11;
    private javax.swing.JLabel lblMessage12;
    private javax.swing.JLabel lblMessage13;
    private javax.swing.JLabel lblMessage5;
    private javax.swing.JLabel lblMessage6;
    private javax.swing.JLabel lblMessage7;
    private javax.swing.JLabel lblMessage8;
    private javax.swing.JLabel lblMessage9;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAnimalManagerWorkArea;
    private javax.swing.JTextField txtAnimalArea;
    private javax.swing.JTextField txtAnimalMessageFromBehaviorTharapipst;
    private javax.swing.JTextField txtAnimalMessageFromPharmacy;
    private javax.swing.JTextField txtAnimalMessageFromVet;
    private javax.swing.JTextField txtAnimalName;
    private javax.swing.JTextField txtAnimalPhoto;
    private javax.swing.JTextField txtAnimalSex;
    private javax.swing.JTextField txtAnimalWeight;
    // End of variables declaration//GEN-END:variables

    private void showAnimalDetails() {

        txtAnimalName.setText(animal.getName());
        
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
