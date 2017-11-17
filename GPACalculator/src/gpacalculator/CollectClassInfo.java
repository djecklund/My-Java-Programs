/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
        
        try{
            
            File classInformation = new File("Grades/Class Info.xlsx");
            FileInputStream input = new FileInputStream(classInformation);
            
            Workbook classWB = new XSSFWorkbook(input);
            Sheet classSheet = classWB.getSheetAt(0);
            
            Row row;
            
            // Loop through the excel spreadsheet and populate the classInfo ArrayList with the
            // data collected from each row.
            for(int rowIndex = 1; rowIndex <= classSheet.getLastRowNum(); rowIndex++){
                ClassInfo info = new ClassInfo();
                row = classSheet.getRow(rowIndex);
                
                Cell subjectCell = row.getCell(0);
                Cell titleCell = row.getCell(1);
                Cell gradeCell = row.getCell(2);
                Cell creditHourCell = row.getCell(3);
                
                info.setSubject(subjectCell.getStringCellValue());
                info.setTitle(titleCell.getStringCellValue());
                info.setGrade(gradeCell.getStringCellValue().toCharArray()[0]);
                
                if(creditHourCell.getCellType() == Cell.CELL_TYPE_STRING){
                    int creditHours = Integer.parseInt(creditHourCell.getStringCellValue());
                    info.setCreditHours(creditHours);
                }
                else{
                    info.setCreditHours((int)creditHourCell.getNumericCellValue());
                }
                
                info.setQualityPoints();
                
                classInfo.add(info);
                
            }
            
            classWB.close();
            input.close();
            
        }catch(IOException io){
            
        }
    }
    
    // Return the contents of the classInfo ArrayList
    public ArrayList<ClassInfo> getClassInfo(){
        return classInfo;
    }
    
}
