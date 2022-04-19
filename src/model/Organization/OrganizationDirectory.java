/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;




import model.Enterprise.Enterprise;
import model.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author anitachen
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.AnimalRegister.getValue())){
            organization = new AnimalRegisterOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AnimalManagement.getValue())){
            organization = new AnimalManagementOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Vet.getValue())){
            organization = new VetOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Treatment.getValue())){
            organization = new TreatmentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Adopter.getValue())){
            organization = new AdopterOrganization();
            organizationList.add(organization);
        }
       
        else if (type.getValue().equals(Type.AdoptionOperation.getValue())){
            organization = new AdoptionOperationOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.VolunteerManagement.getValue())){
            organization = new VolunteerManagementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Volunteer.getValue())){
            organization = new VolunteerOrganization();
            organizationList.add(organization);
        }
        return organization;
    
}
    
     public boolean isUnique(String name){
        for(Organization organization : organizationList){
            if(name.equalsIgnoreCase(organization.getName())){
                return false;
            }
        }
        return true;
    }
    
}