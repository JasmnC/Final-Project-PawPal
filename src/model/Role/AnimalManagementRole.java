/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.Organization.AnimalRegisterOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import ui.AnimalRegistorRole.AnimalRegistorWorkAreaJPanel;

/**
 *
 * @author yuujadz
 */
public class AnimalManagementRole extends Role {
    
    public AnimalManagementRole() {
        this.type = Role.RoleType.AnimalManager;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization) {
        this.type = RoleType.AdoptionManager;
        return new AnimalRegistorWorkAreaJPanel(userProcessContainer, account, (AnimalRegisterOrganization) organization, business);
    }
}
