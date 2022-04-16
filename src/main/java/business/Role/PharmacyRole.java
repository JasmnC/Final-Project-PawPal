/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Organization.MedicalCare;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class PharmacyRole extends Role {

    public PharmacyRole() {
        this.type = RoleType.Pharmacy;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.Doctor;
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization) organization, business);
    }

}
