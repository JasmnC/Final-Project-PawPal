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

        setBackground(new java.awt.Color(254, 236, 236));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 33, -1, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("On Going Animal");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 38, -1, -1));

        txtAnimalName.setEnabled(false);
        add(txtAnimalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 80, 217, -1));

        lblMessage5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage5.setText("Name:");
        add(lblMessage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 87, -1, -1));

        txtAnimalArea.setEnabled(false);
        add(txtAnimalArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 112, 217, -1));

        lblMessage6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage6.setText("Area:");
        add(lblMessage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 119, -1, -1));

        txtAnimalSex.setEnabled(false);
        add(txtAnimalSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 144, 217, -1));

        lblMessage7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage7.setText("Sex:");
        add(lblMessage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 151, -1, -1));

        txtAnimalWeight.setEnabled(false);
        add(txtAnimalWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 176, 217, -1));

        lblMessage8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage8.setText("Weight:");
        add(lblMessage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 183, -1, -1));

        txtAnimalMessageFromBehaviorTharapipst.setEnabled(false);
        add(txtAnimalMessageFromBehaviorTharapipst, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 272, 217, -1));

        lblMessage9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage9.setText("Behavior Check:");
        add(lblMessage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 279, -1, -1));

        txtAnimalMessageFromVet.setEnabled(false);
        add(txtAnimalMessageFromVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 208, 217, -1));

        lblMessage10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage10.setText("Vet Feedback:");
        add(lblMessage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 215, -1, -1));

        txtAnimalMessageFromPharmacy.setEnabled(false);
        add(txtAnimalMessageFromPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 240, 217, -1));

        lblMessage11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage11.setText("Pharmacy Feedback:");
        add(lblMessage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 247, -1, -1));

        lblMessage12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage12.setText("Photo:");
        add(lblMessage12, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 87, -1, -1));
        add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 80, 209, 218));
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
