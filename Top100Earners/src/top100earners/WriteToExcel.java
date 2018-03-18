/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package top100earners;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author dillon
 */
public class WriteToExcel {
    
    public void writeData(ArrayList<PersonalInfo> personalData) throws FileNotFoundException, IOException{
        
        String resultsPath = "Files/Results.xlsx";
        
        DecimalFormat moneyFormat = new DecimalFormat("$###,##0.00");
        
        XSSFWorkbook resultsWB = new XSSFWorkbook();
        XSSFSheet sheet = resultsWB.createSheet("Top Earners Results");
        
        // Write the data into the spreadsheet
        if(personalData.size() > 100){
            
            for(int i = 0; i <= 99; i++){
            
                XSSFRow row = sheet.createRow(i);

                XSSFCell nameCell = row.createCell(0);
                XSSFCell incomeCell = row.createCell(1);

                nameCell.setCellValue(personalData.get(i).getName());
                incomeCell.setCellValue(moneyFormat.format(personalData.get(i).getIncome()));

            }
            
        }
        else{
            
            for(int i = 0; i < personalData.size(); i++){
            
                XSSFRow row = sheet.createRow(i);

                XSSFCell nameCell = row.createCell(0);
                XSSFCell incomeCell = row.createCell(1);

                nameCell.setCellValue(personalData.get(i).getName());
                incomeCell.setCellValue(moneyFormat.format(personalData.get(i).getIncome()));
            
            }
            
        }
        
        
        FileOutputStream resultsOutputStream = new FileOutputStream(resultsPath);
        
        // Resize the columns in the sheet to fit the data
        sheet.autoSizeColumn(0);
        sheet.autoSizeColumn(1);
        
        // Write this workbook to an OutputStream
        resultsWB.write(resultsOutputStream);
        resultsOutputStream.flush();
        resultsOutputStream.close();
        
        JOptionPane.showMessageDialog(null, "The file has been created!!!");
        
    }
    
}
