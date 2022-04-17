/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import model.Organization.OrganizationDirectory;

/**
 *
 * @author anitachen
 */
public abstract class Enterprise {

    private String name;
    private OrganizationDirectory organizationDirectory;

    public enum Type {
        AnimalShelter("Animal Shelter"), 
        MedicalCare("MedicalCare"), 
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

    public Enterprise(String name) {
        this.name = name;
        organizationDirectory = new OrganizationDirectory();        
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
