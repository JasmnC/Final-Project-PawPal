package ui.Vet;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Animal.Animal;
import model.Animal.AnimalDirectory;
import model.EcoSystem.EcoSystem;
import model.Enterprise.AnimalShelterEnterprise;
import model.Enterprise.Enterprise;
import model.Enterprise.MedicalCareEnterprise;
import model.Network.Network;
import model.Organization.TreatmentOrganization;
import model.Organization.VetOrganization;
import model.UserAccount.UserAccount;
import model.WorkQueue.MedCareRequest;
import model.WorkQueue.PharmacistWorkRequest;
import model.WorkQueue.BTWorkRequest;
import ui.Pharmacist.PharmacistWorkArea;

/**
 *
 * @author ariel
 */
public class VetAnimalDetail extends javax.swing.JPanel {

    private JPanel workArea;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private EcoSystem ecoSystem;
    Network network;
    private VetOrganization vetOrganization;
    private TreatmentOrganization treatmentOrganization;
    MedCareRequest request;
    private AnimalDirectory animalDirectory;
    private Animal animal;

    public VetAnimalDetail(JPanel workArea, MedCareRequest request, UserAccount userAccount, VetOrganization vetOrganization,
            Enterprise enterprise, Animal animal, AnimalDirectory animalDirectory, EcoSystem ecoSystem) {
        initComponents();

        this.workArea = workArea;
        this.request = request;
        this.userAccount = userAccount;
        this.vetOrganization = vetOrganization;
        this.enterprise = enterprise;
        this.animal = request.getAnimal();
        this.animalDirectory = animalDirectory;
        this.ecoSystem = ecoSystem;
        for (Network net : ecoSystem.getNetworkList()) {
            for (Enterprise e : net.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.equals(enterprise)) {
                    network = net;
                }
            }
        }

        getAnimalDetails();
        //       displayImage();
    }

    private void getAnimalDetails() {
        //      displayImage();
        txtAnimalName.setText(animal.getName());
        txtAnimalArea.setText(animal.getArea());
        txtAnimalSex.setText(animal.getSex());
        txtAnimalWeight.setText(animal.getWeight());
        txtAnimalMessageFromVet.setText(animal.getVetMessage());
        txtAnimalMessageFromPharmacy.setText(animal.getPharmacyMessage());
        txtAnimalMessageFromBehaviorTharapipst.setText(animal.getBaviorCheckMessage());
        //      displayImage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRequestBT = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnRequestPharmacy = new javax.swing.JButton();
        txtResults = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        lblMessage5 = new javax.swing.JLabel();
        txtAnimalName = new javax.swing.JTextField();
        txtAnimalArea = new javax.swing.JTextField();
        lblMessage6 = new javax.swing.JLabel();
        lblMessage7 = new javax.swing.JLabel();
        txtAnimalSex = new javax.swing.JTextField();
        lblMessage8 = new javax.swing.JLabel();
        txtAnimalWeight = new javax.swing.JTextField();
        lblMessage10 = new javax.swing.JLabel();
        txtAnimalMessageFromVet = new javax.swing.JTextField();
        lblMessage11 = new javax.swing.JLabel();
        txtAnimalMessageFromPharmacy = new javax.swing.JTextField();
        lblMessage9 = new javax.swing.JLabel();
        txtAnimalMessageFromBehaviorTharapipst = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblAnimalPhoto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(212, 238, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRequestBT.setText("Request Behavioral Therapy");
        btnRequestBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestBTActionPerformed(evt);
            }
        });
        add(btnRequestBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 247, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Animal Detail");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        btnRequestPharmacy.setText("Request Pharmaceutical Therapy");
        btnRequestPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestPharmacyActionPerformed(evt);
            }
        });
        add(btnRequestPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, -1, -1));
        add(txtResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 400, 40));

        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_reply.png"))); // NOI18N
        btnSubmit.setText("Submit Result");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        lblResult.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblResult.setText("Vet Message:");
        add(lblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        lblMessage5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage5.setText("Name:");
        add(lblMessage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 50, -1));

        txtAnimalName.setEnabled(false);
        add(txtAnimalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 150, -1));

        txtAnimalArea.setEnabled(false);
        add(txtAnimalArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 150, -1));

        lblMessage6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage6.setText("Area:");
        add(lblMessage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 50, -1));

        lblMessage7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage7.setText("Sex:");
        add(lblMessage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 50, -1));

        txtAnimalSex.setEnabled(false);
        add(txtAnimalSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 150, -1));

        lblMessage8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage8.setText("Weight:");
        add(lblMessage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 50, -1));

        txtAnimalWeight.setEnabled(false);
        add(txtAnimalWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 150, -1));

        lblMessage10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage10.setText("Vet:");
        add(lblMessage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 150, -1));

        txtAnimalMessageFromVet.setEnabled(false);
        add(txtAnimalMessageFromVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 217, -1));

        lblMessage11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage11.setText("Pharmacy Feedback:");
        add(lblMessage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 150, -1));

        txtAnimalMessageFromPharmacy.setEnabled(false);
        add(txtAnimalMessageFromPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 217, -1));

        lblMessage9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage9.setText("Behavior Check:");
        add(lblMessage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 150, -1));

        txtAnimalMessageFromBehaviorTharapipst.setEnabled(false);
        add(txtAnimalMessageFromBehaviorTharapipst, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 217, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        add(lblAnimalPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 160, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestBTActionPerformed

        CardLayout layout = (CardLayout) workArea.getLayout();
        workArea.add("requestBehaviorTherapy", new RequestBT(workArea, request, userAccount, enterprise, animal, animalDirectory, ecoSystem));
        layout.next(workArea);
    }//GEN-LAST:event_btnRequestBTActionPerformed

    private void btnRequestPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestPharmacyActionPerformed

        CardLayout layout = (CardLayout) workArea.getLayout();
        workArea.add("requestPharmaceuticalTherapy", new RequestPharmacist(workArea, request, userAccount, enterprise, animal, animalDirectory, ecoSystem));
        layout.next(workArea);
    }//GEN-LAST:event_btnRequestPharmacyActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        if (txtResults.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter something.", "Information", JOptionPane.WARNING_MESSAGE);
        } else {
            animal.setVetMessage(txtResults.getText());
            request.setStatus("Completed");
            request.setVetResult(txtResults.getText());
            JOptionPane.showMessageDialog(this, "Vet Request is completed now!", "Thank you!", JOptionPane.INFORMATION_MESSAGE);
            txtAnimalMessageFromVet.setText(txtResults.getText());
            
            CardLayout layout = (CardLayout) workArea.getLayout();
            workArea.add("VetWorkArea", new VetWorkArea(workArea, userAccount,vetOrganization, (MedicalCareEnterprise) enterprise,network, ecoSystem));
            layout.next(workArea);
            

        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestBT;
    private javax.swing.JButton btnRequestPharmacy;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblAnimalPhoto;
    private javax.swing.JLabel lblMessage10;
    private javax.swing.JLabel lblMessage11;
    private javax.swing.JLabel lblMessage5;
    private javax.swing.JLabel lblMessage6;
    private javax.swing.JLabel lblMessage7;
    private javax.swing.JLabel lblMessage8;
    private javax.swing.JLabel lblMessage9;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAnimalArea;
    private javax.swing.JTextField txtAnimalMessageFromBehaviorTharapipst;
    private javax.swing.JTextField txtAnimalMessageFromPharmacy;
    private javax.swing.JTextField txtAnimalMessageFromVet;
    private javax.swing.JTextField txtAnimalName;
    private javax.swing.JTextField txtAnimalSex;
    private javax.swing.JTextField txtAnimalWeight;
    private javax.swing.JTextField txtResults;
    // End of variables declaration//GEN-END:variables
}
