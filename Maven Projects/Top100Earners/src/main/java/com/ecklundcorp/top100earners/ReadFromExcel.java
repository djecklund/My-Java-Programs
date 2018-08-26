/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecklundcorp.top100earners;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author dillon
 */
public class ReadFromExcel {
    
    ArrayList<PersonalInfo> personalInfo;
    
    public ReadFromExcel(){
        personalInfo = new ArrayList<>();
    }
    
    public void read(){
        
        try{
            
            File file = new File("Files/PersonalData.xlsx");
            FileInputStream input = new FileInputStream(file);
            
            Workbook wb = new XSSFWorkbook(input);
            Sheet sheet = wb.getSheetAt(0);
            
            Row row;
            
            // Get the Personal info from the spreadsheet and populate the personalInfo Arraylist
            for(int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++){
                
                PersonalInfo info = new PersonalInfo();
                row = sheet.getRow(rowIndex);
                Cell nameCell = row.getCell(0);
                Cell incomeCell = row.getCell(1);
                
                info.setName(nameCell.getStringCellValue());
                info.setIncome(incomeCell.getNumericCellValue());
                
                personalInfo.add(info);
                
            }
            
            // Close the Workbook and inputfilestream
            wb.close();
            input.close();
            
        }catch(IOException io){
            
        }
        
    }
    
    public ArrayList<PersonalInfo> getPersonalData(){
        return personalInfo;
    }
    
}
