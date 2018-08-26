/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecklundcorp.top100earners;

import java.util.ArrayList;

/**
 *
 * @author dillon
 */
public class FindDuplicatePeople {
    
    ArrayList<PersonalInfo> personalData;
    
    public FindDuplicatePeople(ArrayList<PersonalInfo> c){
        personalData = c;
    }
    
    public void addUpCounts(){
        
        // Look through the people and find the duplicate people. Add those duplicates up and 
        // remove the duplicates after adding their income to the original.
        for(int i = 0; i < personalData.size(); i++){
            for(int j = 1; j < personalData.size(); j++){
                if(personalData.get(i).getName().equalsIgnoreCase(personalData.get(j).getName()) && i != j){
                    
                    // Find the duplicates, add their income to the original, then 
                    // remove the duplicates.
                    personalData.get(i).setIncome(personalData.get(i).getIncome() + personalData.get(j).getIncome());
                    personalData.remove(j);
                    j--;
                }
                
            }
        }
        
    }
    
    public ArrayList<PersonalInfo> getClientData(){
        return personalData;
    }
    
}
