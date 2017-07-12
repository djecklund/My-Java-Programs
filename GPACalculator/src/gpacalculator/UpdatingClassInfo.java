/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author Dillon
 */
public class UpdatingClassInfo {
    
    public void updateClasses(ArrayList<ClassInfo> classInfo){
        
        try{
            
            WritableWorkbook classWB = Workbook.createWorkbook(new File("Grades/Class Info.xls"));
            WritableSheet classSheet = classWB.createSheet("Classes", 0);
            
            // Loop through the classInfo ArrayList and populate the excel spreadsheet with the updated 
            // classInfo ArrayList data.
            for(int i = 0; i < classInfo.size(); i++){
                
                Label subject = new Label(0, i + 1, classInfo.get(i).getSubject());
                Label title = new Label(1, i + 1, classInfo.get(i).getTitle());
                Label grade = new Label(2, i + 1, "" + classInfo.get(i).getGrade());
                Label creditHours = new Label(3, i + 1, "" + classInfo.get(i).getCreditHours());
                
                classSheet.addCell(subject);
                classSheet.addCell(title);
                classSheet.addCell(grade);
                classSheet.addCell(creditHours);
                
            }
            
            // Create the headers for each column
            Label classSubject = new Label(0,0,"Subject");
            Label classTitle = new Label(1,0,"Title");
            Label classGrade = new Label(2,0,"Grade");
            Label classCreditHours = new Label(3,0,"Credit Hours");
            
            classSheet.addCell(classSubject);
            classSheet.addCell(classTitle);
            classSheet.addCell(classGrade);
            classSheet.addCell(classCreditHours);
            // End of header creation
            
            // Write the data into the excel spreadsheet and close it.
            classWB.write();
            classWB.close();
            
        }catch(IOException | WriteException write){
            
        }
        
    }
    
}
