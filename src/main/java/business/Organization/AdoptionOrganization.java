/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AdoptionOrganization extends Organization{

    public AdoptionOrganization() {
        super(Organization.Type.Volunteer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LabAssistantRole());
        return roles;
    }
     
   
    
    
}
