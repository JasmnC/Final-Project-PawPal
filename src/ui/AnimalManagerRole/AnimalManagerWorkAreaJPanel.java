/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AnimalManagerRole;

import model.EcoSystem.EcoSystem;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import model.Animal.Animal;
import model.Animal.AnimalDirectory;
import model.Enterprise.AnimalShelterEnterprise;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.AnimalManagementOrganization;

/**
 *
 * @author raunak
 */
public class AnimalManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel workArea;
    private AnimalManagementOrganization organization;
    private AnimalShelterEnterprise enterprise;
    private Network network;
    private EcoSystem ecosystem;
    private UserAccount userAccount;

    public AnimalManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, AnimalManagementOrganization animalManagementOrganization, AnimalShelterEnterprise animalShelterEnterprise, Network network, EcoSystem ecosystem) {
        initComponents();

        this.workArea = userProcessContainer;
        this.userAccount = account;
        this.organization = animalManagementOrganization;
        this.enterprise = animalShelterEnterprise;
        this.network = network;
        this.ecosystem = ecosystem;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewOngoingAnimalJButton = new javax.swing.JButton();
        getAnAnimalJButton = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        viewAdoptionRequestJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewOngoingAnimalJButton.setText("View On Going Animal");
        viewOngoingAnimalJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOngoingAnimalJButtonActionPerformed(evt);
            }
        });
        add(viewOngoingAnimalJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 173, -1));

        getAnAnimalJButton.setText("Get An Animal");
        getAnAnimalJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAnAnimalJButtonActionPerformed(evt);
            }
        });
        add(getAnAnimalJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 173, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Animal Manager Work Area");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        viewAdoptionRequestJButton.setText("View Adoption Request");
        viewAdoptionRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdoptionRequestJButtonActionPerformed(evt);
            }
        });
        add(viewAdoptionRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 173, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewOngoingAnimalJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOngoingAnimalJButtonActionPerformed

//        
//        
//        ViewOngingAnimalJPanel viewOngoingAnimalJPanel = new ViewOngingAnimalJPanel(workArea, userAccount, enterprise, network);
//        workArea.add("viewOngoingAnimalJPanel", viewOngoingAnimalJPanel);
//
//        CardLayout layout = (CardLayout) workArea.getLayout();
//        layout.next(workArea);

    }//GEN-LAST:event_viewOngoingAnimalJButtonActionPerformed

    private void getAnAnimalJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAnAnimalJButtonActionPerformed

        ManageAnimalJPanel manageAnimalJPanel = new ManageAnimalJPanel(workArea, userAccount, organization, enterprise, network, ecosystem);
        workArea.add("manageAnimalJPanel", manageAnimalJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);

    }//GEN-LAST:event_getAnAnimalJButtonActionPerformed

    private void viewAdoptionRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdoptionRequestJButtonActionPerformed
        // TODO add your handling code here:
//        AdoptionRequestJPanel adoptionRequestJPanel = new AdoptionRequestJPanel(workArea, userAccount, enterprise);
//        workArea.add("adoptionRequestJPanel", adoptionRequestJPanel);
//
//        CardLayout layout = (CardLayout) (workArea.getLayout());
//        layout.next(workArea);
    }//GEN-LAST:event_viewAdoptionRequestJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getAnAnimalJButton;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton viewAdoptionRequestJButton;
    private javax.swing.JButton viewOngoingAnimalJButton;
    // End of variables declaration//GEN-END:variables
}
