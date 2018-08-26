/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecklundcorp.top100earners;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author dillon
 */
public class SortTheData {
    
    ArrayList<PersonalInfo> personalData;
    
    public SortTheData(){
        personalData = new ArrayList<>();
    }
    
    public void sort(ArrayList<PersonalInfo> personalInfo){
        
        personalData = personalInfo;
        
        // Sort the data from the arraylist in descending order
        Collections.sort(personalData, new Comparator<PersonalInfo>(){
            
            // Descending sort
            public int compare(PersonalInfo c1, PersonalInfo c2){
                
                return Double.valueOf(c2.getIncome()).compareTo(c1.getIncome());
                
            }
            
        });
        // End of sorting
        
    }
    
    public ArrayList<PersonalInfo> getPersonalData(){
        return personalData;
    }
    
}
