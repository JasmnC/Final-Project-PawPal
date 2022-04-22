/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Animal;

import java.util.ArrayList;
import model.Enterprise.Enterprise;

/**
 *
 * @author anitachen
 */
public class AnimalDirectory {
    
    private ArrayList<Animal> animalList;
    private Enterprise enterprise;

    public AnimalDirectory(Enterprise enterprise) {
        this.animalList = new ArrayList<Animal>();
        this.enterprise = enterprise;
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }
    
    public Animal createAnimal(String name){
        Animal animal = new Animal(name);
        animalList.add(animal);
        
        return animal;
    }
    
    public boolean nameIsUnique(String name){
        for(Animal animal : animalList){
            if(name.equalsIgnoreCase(animal.getName())){
                return false;
            }
        }
        return true;
    }
    
    public Animal getAnimalByName(String name){
        for (Animal a : animalList){
            if (name.equalsIgnoreCase(a.getName())) return a;
        }
        return null;
    }
    
    public Animal getAnimalByManager(String manager){
        for(Animal a:animalList){
            if(manager.equalsIgnoreCase(manager)) return a;
        }
        return null;
    }
    
    
}
