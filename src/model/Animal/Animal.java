/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Animal;

import model.UserAccount.UserAccount; 

/**
 *
 * @author anitachen
 */
public class Animal {
    
    private static int idCounter = 0 ;
    
    private int id;
    private String name;
    private UserAccount manager;
    private UserAccount adoptor;
//    some attributes
//    Vet Feedback
    //BP Feedback
    //pharmisit Feedback
    // photo
    
    public Animal(String name) {

        this.name = name;
        idCounter++;
        id = idCounter;
        
    }
    
    
}
