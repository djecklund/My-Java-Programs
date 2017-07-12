/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Dillon
 */
public class GPACalculations {
    
    DecimalFormat gpaFormat;
    private double gpa, qualityPointsEarned, totalCreditHours;
    
    public GPACalculations(){
        gpaFormat = new DecimalFormat("###.00");
        gpa = qualityPointsEarned = totalCreditHours = 0.0;
    }
    
    public String calculateGPA(ArrayList<ClassInfo> info){
        
        // Calculate the gpa
        for(int i = 0; i < info.size(); i++){
            qualityPointsEarned += info.get(i).getQualityPoints();
            totalCreditHours += info.get(i).getCreditHours();
        }
        
        gpa = qualityPointsEarned / totalCreditHours;
        
        // return the data in a format consistent with how gpa's are
        // regularily seen. (EX: 3.34)
        return gpaFormat.format(gpa);
        // End gpa calculations
    }
    
}
