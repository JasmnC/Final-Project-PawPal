/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Organization.AdoptionOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdoptorRole extends Role {

    public AdoptorRole() {
        this.type = RoleType.Adoptor;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.Adoptor;
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (AdoptionOrganization) organization, business);
    }

}
