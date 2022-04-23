/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Organization.Organization;
import model.Organization.OrganizationDirectory;

/**
 *
 * @author anitachen
 */
public abstract class Enterprise {

    private Type type;
    private String name;
    private OrganizationDirectory organizationDirectory;

    public enum Type {
        AnimalShelter("Animal Shelter"), 
        MedicalCare("Medical Care"), 
        Adoption("Adoption"), 
        Volunteer("Volunteer");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Enterprise(String name, Type type) {
        this.name = name;
        this.type = type;
        organizationDirectory = new OrganizationDirectory();        
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    @Override
    public String toString() {
        return name;
    }
    

}
