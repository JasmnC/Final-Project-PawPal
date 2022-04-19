/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.VetRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class VetOrganization extends Organization{
    String name;
    public VetOrganization(String name) {
        super(name);
        this.name=name;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VetRole());
        return roles;
    }

    @Override
    public Type getType() {
        return Organization.Type.Vet;
    }
    
    
     
}