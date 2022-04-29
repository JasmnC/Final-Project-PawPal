/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Adpoter;

import ui.AnimalManagerRole.*;
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
public class ViewAnimalDetailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Animal animal;
    
    public ViewAnimalDetailJPanel(JPanel userProcessContainer, Animal animal) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
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
        lblPhoto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("On Going Animal");

        txtAnimalName.setEnabled(false);

        lblMessage5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage5.setText("Name:");

        txtAnimalArea.setEnabled(false);

        lblMessage6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage6.setText("Area:");

        txtAnimalSex.setEnabled(false);

        lblMessage7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage7.setText("Sex:");

        txtAnimalWeight.setEnabled(false);

        lblMessage8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage8.setText("Weight:");

        txtAnimalMessageFromBehaviorTharapipst.setEnabled(false);

        lblMessage9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage9.setText("Behavior Check:");

        txtAnimalMessageFromVet.setEnabled(false);

        lblMessage10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage10.setText("Vet Feedback:");

        txtAnimalMessageFromPharmacy.setEnabled(false);

        lblMessage11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage11.setText("Pharmacy Feedback:");

        lblMessage12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage12.setText("Photo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(lblTitle)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMessage5)
                        .addGap(18, 18, 18)
                        .addComponent(txtAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMessage6)
                        .addGap(18, 18, 18)
                        .addComponent(txtAnimalArea, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMessage7)
                        .addGap(18, 18, 18)
                        .addComponent(txtAnimalSex, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMessage8)
                        .addGap(18, 18, 18)
                        .addComponent(txtAnimalWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMessage10)
                            .addComponent(lblMessage9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(44, 44, 44))
                            .addComponent(lblMessage11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAnimalMessageFromVet, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnimalMessageFromPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnimalMessageFromBehaviorTharapipst, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addComponent(lblMessage12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMessage5)
                            .addComponent(txtAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMessage12))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnimalMessageFromVet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMessage10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnimalMessageFromPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMessage11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnimalMessageFromBehaviorTharapipst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMessage9)))
                    .addComponent(lblPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(299, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblMessage10;
    private javax.swing.JLabel lblMessage11;
    private javax.swing.JLabel lblMessage12;
    private javax.swing.JLabel lblMessage5;
    private javax.swing.JLabel lblMessage6;
    private javax.swing.JLabel lblMessage7;
    private javax.swing.JLabel lblMessage8;
    private javax.swing.JLabel lblMessage9;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAnimalArea;
    private javax.swing.JTextField txtAnimalMessageFromBehaviorTharapipst;
    private javax.swing.JTextField txtAnimalMessageFromPharmacy;
    private javax.swing.JTextField txtAnimalMessageFromVet;
    private javax.swing.JTextField txtAnimalName;
    private javax.swing.JTextField txtAnimalSex;
    private javax.swing.JTextField txtAnimalWeight;
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
                
    }

}
