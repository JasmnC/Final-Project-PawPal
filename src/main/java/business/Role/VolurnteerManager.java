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
public class VolurnteerManager extends Role {

    public VolurnteerManager() {
        this.type = RoleType.VolurnteerManager;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.VolurnteerManager;
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (VolunteerOrganization) organization, business);
    }

}
