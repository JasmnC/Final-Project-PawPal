/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSystem.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author anitachen
 */
public abstract class Role {
    
        public enum RoleType {
            
        AnimalRegister("Animal Register"),
        AnimalManager("Animal Manager"),
        Vet("vet"),
        Pharmacist("Pharmacist"),
        BehaviorTherapist("Behavior Therapist"),
        Adopter("Adopter"),
        AdoptionManager("Adoption Manager"), 
        VolunteerManeger("Volunteer Manager"),
        Volunteer("Volunteer"),
        SystemAdmin ("System Admin");

        private String value;

        private RoleType(String value) {
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

    public RoleType type;
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem Ecosystem);

    @Override
    public String toString() {
        return this.getClass().getName();
    }    
    
}