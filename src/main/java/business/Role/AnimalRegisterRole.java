/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Organization.AnimalShelter;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AnimalRegisterRole extends Role {

    public AnimalRegisterRole() {
        this.type = RoleType.AnimalRegister;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.AnimalRegister;
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (AnimalShelter) organization, business);
    }

}
