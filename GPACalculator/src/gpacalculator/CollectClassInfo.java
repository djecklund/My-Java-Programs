/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author Dillon
 */
public class CollectClassInfo {
    
    ArrayList<ClassInfo> classInfo;
    
    public CollectClassInfo(){
        classInfo = new ArrayList<>();
    }
    
    public void collectClassInfo(){
        
        String pathway = "Grades/Class Info.xls";
        
        try{
            
            File classInfoExcel = new File(pathway);        
            Workbook classWB = Workbook.getWorkbook(classInfoExcel);
            Sheet classSheet = classWB.getSheet(0);
            
            int rows = classSheet.getRows();
            
            // Determine if the spreadsheet is missing
            if(classInfoExcel.exists()){
                if(pathway.endsWith(".xls")){
                    
                    // Loop through the excel spreadsheet and populate the classInfo ArrayList with the
                    // data collected from each row.
                    for(int i = 1; i < rows; i ++){
                        
                        Cell subject = classSheet.getCell(0,i);
                        Cell title = classSheet.getCell(1, i);
                        Cell grade = classSheet.getCell(2,i);
                        Cell creditHours = classSheet.getCell(3,i);
                        
                        ClassInfo info = new ClassInfo();
                        info.setSubject(subject.getContents());
                        info.setTitle(title.getContents());
                        info.setGrade(grade.getContents().charAt(0));
                        info.setCreditHours(Integer.parseInt(creditHours.getContents()));
                        info.setQualityPoints();

                        classInfo.add(info);
                        
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "The excel spreadsheet needs to have a .xls extension.");
                }
            }
            
        }catch(IOException | BiffException biff){

        }
    }
    
    // Return the contents of the classInfo ArrayList
    public ArrayList<ClassInfo> getClassInfo(){
        return classInfo;
    }
    
}
