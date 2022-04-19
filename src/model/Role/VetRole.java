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
import model.Organization.VetOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorOrg.DoctorWorkArea;

/**
 *
 * @author raunak
 */
public class VetRole extends Role{

    
        @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, 
                                                                  Enterprise enterprise, model.EcoSystem.EcoSystem Ecosystem) { 
            return null;        
    }
    /**
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory childdirectory, AdopterDirectory adopterdirectory, DonorDirectory donorDirectory) {
        return new DoctorWorkArea(userProcessContainer, account, (DoctorOrganization) organization, enterprise, business, childdirectory);
    }
    **/
    @Override
    public String toString(){
        return (RoleType.Vet.getValue());
    }


}
