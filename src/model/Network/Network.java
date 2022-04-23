/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Network;


import model.EcoSystem.EcoSystem;
import model.Enterprise.EnterpriseDirectory;

/**
 *
 * @author anitachen
 */
public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private EcoSystem ecosystem;
    
    public Network(String name, EcoSystem ecoSystem) {
        this.name = name;
        this.ecosystem = ecoSystem;
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public EcoSystem getEcosystem() {
        return ecosystem;
    }

    @Override
    public String toString() {
        return name;
    }    

}
