/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.BehaviorTherapist;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Animal.Animal;
import model.Animal.AnimalDirectory;
import model.EcoSystem.EcoSystem;
import model.Enterprise.Enterprise;
import model.Enterprise.MedicalCareEnterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.Organization.TreatmentOrganization;
import model.Role.BehaviorTherapistRole;
import model.Role.Role;
import model.UserAccount.UserAccount;
import model.WorkQueue.MedCareRequest;
import model.WorkQueue.BTWorkRequest;
import ui.BehaviorTherapist.BTWorkArea;

/**
 *
 * @author ariel
 */
public class BTProcessRequest extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private EcoSystem ecoSystem;
    BTWorkRequest request;
    private Animal animal;
    private AnimalDirectory animalDirectory;
    private TreatmentOrganization treatmentOrganization;
    Network network;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public BTProcessRequest(JPanel userProcessContainer, BTWorkRequest request, UserAccount userAccount, Enterprise enterprise,
            Animal animal, AnimalDirectory animalDirectory, EcoSystem ecoSystem, TreatmentOrganization treatmentOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.treatmentOrganization = treatmentOrganization;
        this.enterprise = enterprise;
        this.animal = request.getAnimal();
        this.animalDirectory = animalDirectory;
        this.ecoSystem = ecoSystem;
        for (Network net : ecoSystem.getNetworkList()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.equals(enterprise)) {
                    network = net;
                }
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

        btnBack = new javax.swing.JButton();
        txtResults = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();

        setBackground(new java.awt.Color(181, 255, 232));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultsActionPerformed(evt);
            }
        });
        add(txtResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 450, 50));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Result Submission");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_reply.png"))); // NOI18N
        btnSubmit.setText("Submit Result");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        lblResult.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblResult.setText("Result:");
        add(lblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if (txtResults.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter message","Warning",JOptionPane.WARNING_MESSAGE);
        } else {
            animal.setBaviorCheckMessage(txtResults.getText());
            request.setStatus("Completed");
            request.setResult(txtResults.getText());
            JOptionPane.showMessageDialog(this, " Behavior Therapy Request is completed now!", "Thank you!", JOptionPane.INFORMATION_MESSAGE);
            

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("BTWorkArea", new BTWorkArea(userProcessContainer, userAccount, treatmentOrganization, (MedicalCareEnterprise) enterprise, network, ecoSystem));
            layout.next(userProcessContainer);

        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtResults;
    // End of variables declaration//GEN-END:variables
}
