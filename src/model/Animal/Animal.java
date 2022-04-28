/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Animal;

import model.UserAccount.UserAccount; 
import model.WorkQueue.WorkQueue;

/**
 *
 * @author anitachen
 */
public class Animal {
  
    
    private static int idCounter = 0 ;
    
    private int id;
    private String name;
    private String area;
    private String sex;
    private String weight;
    private String vetMessage;
    private String pharmacyMessage;
    private String baviorCheckMessage;

    private UserAccount manager;
    private UserAccount adoptor;
    private boolean adpotionRequested;
    
    private WorkQueue workQueue;

    
    public Animal(String name) {

        this.name = name;
        idCounter++;
        id = idCounter;
        workQueue = new WorkQueue();
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Animal.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getVetMessage() {
        return vetMessage;
    }

    public void setVetMessage(String vetMessage) {
        this.vetMessage = vetMessage;
    }

    public String getPharmacyMessage() {
        return pharmacyMessage;
    }

    public void setPharmacyMessage(String pharmacyMessage) {
        this.pharmacyMessage = pharmacyMessage;
    }

    public String getBaviorCheckMessage() {
        return baviorCheckMessage;
    }

    public void setBaviorCheckMessage(String baviorCheckMessage) {
        this.baviorCheckMessage = baviorCheckMessage;
    }

    public UserAccount getManager() {
        return manager;
    }

    public void setManager(UserAccount manager) {
        this.manager = manager;
    }

    public UserAccount getAdoptor() {
        return adoptor;
    }

    public void setAdoptor(UserAccount adoptor) {
        this.adoptor = adoptor;
    }

    public boolean isAdpotionRequested() {
        return adpotionRequested;
    }

    public void setAdpotionRequested(boolean adpotionRequested) {
        this.adpotionRequested = adpotionRequested;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
