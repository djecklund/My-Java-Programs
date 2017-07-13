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
public class ModifyClassInformation {
    
    public ArrayList<ClassInfo> modifyClassInfo(ArrayList<ClassInfo> classInfo, String subject, String title, char grade, int creditHours, int index){
            
        classInfo.get(index).setSubject(subject);
        classInfo.get(index).setTitle(title);
        classInfo.get(index).setGrade(grade);
        classInfo.get(index).setCreditHours(creditHours);
        classInfo.get(index).setQualityPoints();
        
        return classInfo;
    }
    
}
