/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSystem.EcoSystem;
import model.Organization.AnimalRegisterOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AnimalRegistorRole.AnimalRegistorWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class AnimalRegisterRole extends Role {

    public AnimalRegisterRole() {
        this.type = RoleType.AnimalRegister;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, ) {
        this.type = RoleType.AnimalRegister;
        return new AnimalRegistorWorkAreaJPanel(userProcessContainer, account, (AnimalRegisterOrganization) organization, business);
    }

}
