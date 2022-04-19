/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.Adopter.AdopterDirectory;
import model.Child.ChildDirectory;
import model.Donor.DonorDirectory;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.Organization.TreatmentOrganization;

import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Pharmacist.PharmacistWorkArea;


/**
 *
 * @author Kunjan
 */
public class PharmacistRole extends Role{

        @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, model.EcoSystem.EcoSystem Ecosystem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory childdirectory, AdopterDirectory adopterdirectory,DonorDirectory donorDirectory) {
       return new PharmacyWorkArea(userProcessContainer, account, (PharmacistOrganization)organization,enterprise, business,childdirectory);
    }
    **/
    @Override
    public String toString(){
        return (RoleType.Pharmacist.getValue());
    }


    
}
