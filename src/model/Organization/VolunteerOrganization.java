/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.Role;
import java.util.ArrayList;
import model.Role.VolunteerRole;

/**
 *
 * @author anitachen
 */
public class VolunteerOrganization extends Organization{

    public VolunteerOrganization() {
        super(Organization.Type.Volunteer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VolunteerRole());
        return roles;
    }
    
}
