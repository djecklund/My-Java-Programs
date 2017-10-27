/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Dillon
 */
public class PossibleSearchOptions {
    
    ArrayList<String> searchOptions;
    
    public PossibleSearchOptions(){
        searchOptions = new ArrayList<>();
    }
    
    public ArrayList<String> setUpSearchOptions(ArrayList<ClassInfo> classInfo){
        
        // Store all data temporarily in searchOptions Arraylist
        for(int i = 0; i < classInfo.size(); i++){
            searchOptions.add(classInfo.get(i).getSubject());
        }
        
        // Remove any duplicate values in searchOptions ArrayList by storing its values 
        // in a HashSet, then place the new list in searchOptions
        Set<String> temp = new HashSet<>();
        temp.addAll(searchOptions);
        searchOptions.removeAll(searchOptions);
        searchOptions.addAll(temp);
        
        return searchOptions;
    }
}