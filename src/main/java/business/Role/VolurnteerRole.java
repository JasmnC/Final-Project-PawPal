/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Organization.VolunteerOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class VolurnteerRole extends Role {

    public VolurnteerRole() {
        this.type = RoleType.Volurnteer;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.Volurnteer;
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (VolunteerOrganization) organization, business);
    }

}
