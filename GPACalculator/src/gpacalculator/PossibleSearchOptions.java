/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.util.ArrayList;

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
        
        for(int i = 0; i < classInfo.size(); i++){
            searchOptions.add(classInfo.get(i).getSubject());
        }
        
        // Remove duplicate subjects (Currently not working!!!)
        for(int i = 0; i < searchOptions.size(); i++){
            for(int j = 0; j < searchOptions.size(); j++){
                if(searchOptions.get(i).equals(searchOptions.get(j))){
                    searchOptions.remove(j);
                }
            }
        }
        
        return searchOptions;
    }
}