/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.DoctorRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class MedicalCare extends Organization{

    public MedicalCare() {
        super(Organization.Type.MedCare.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
     
}