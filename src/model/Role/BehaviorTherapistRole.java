/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.Adopter.AdopterDirectory;
import model.Child.ChildDirectory;
import model.Donor.DonorDirectory;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;

import javax.swing.JPanel;
import ui.BehaviorTherapist.BTWorkArea;

/**
 *
 * @author raunak
 */
public class BehaviorTherapistRole extends Role {

        @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, model.EcoSystem.EcoSystem Ecosystem) {

            return null;
    }
    /**
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory childdirectory, AdopterDirectory adopterdirectory, DonorDirectory donorDirectory) {
        return new LabWorkArea(userProcessContainer, account, organization, business);
    }
    **/
    @Override
    public String toString(){
        return (RoleType.BehaviorTherapist.getValue());
    }


     
}
