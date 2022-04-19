/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.AdopterRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anitachen
 */
public class AdopterOrganization extends Organization{

    public AdopterOrganization() {
        super(Organization.Type.Adopter.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdopterRole());
        return roles;
    }
    
}
