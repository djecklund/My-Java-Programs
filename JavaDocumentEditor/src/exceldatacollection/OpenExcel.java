/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceldatacollection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Dillon
 */
public class OpenExcel {
    
    private ArrayList<String> text;
    
    public OpenExcel(){
        text = new ArrayList<>();
    }
    
    public ArrayList<String> openXlsxDocument(String p){
        
        try{
            
            File file = new File(p);
            FileInputStream input = new FileInputStream(file);
            
            Workbook wb = new XSSFWorkbook(input);
            
            // Determine if the file exists
            if(file.exists()){
                
                // Ask the user how they want the data displayed
                String fileType = JOptionPane.showInputDialog(null, "Enter what separates the data: (EX: tab, comma, pipe)");
                
                if(fileType.equals("tab") || fileType.equals("comma") || fileType.equals("pipe")){
                    
                    // Determine how many sheets are in the spreadsheet
                    int numberOfSheets = wb.getNumberOfSheets();
                    
                    // Loop through the spreadsheet to fill out the ArrayList.
                    // Loop through each sheet in the spreadsheet
                    for(int sheetNum = 0; sheetNum < numberOfSheets; sheetNum++){

                        Sheet sheet = wb.getSheetAt(sheetNum);
                        int numberOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
                        int numberOfRows = sheet.getLastRowNum();

                        Row row;

                        for(int rowIndex = 0; rowIndex < numberOfRows; rowIndex++){

                            String[] rowData = new String[numberOfColumns];

                            for(int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++){

                                row = sheet.getRow(rowIndex);
                                Cell stringData = row.getCell(columnIndex);
                                
                                switch (stringData.getCellType()){
                                    case Cell.CELL_TYPE_BLANK:
                                        rowData[columnIndex] = "";
                                        break;
                                    case Cell.CELL_TYPE_BOOLEAN:
                                        rowData[columnIndex] = "" + stringData.getBooleanCellValue();
                                        break;
                                    case Cell.CELL_TYPE_ERROR:
                                        rowData[columnIndex] = "ERROR";
                                        break;
                                    case Cell.CELL_TYPE_FORMULA:
                                        rowData[columnIndex] = "" + stringData.getCellFormula();
                                        break;
                                    case Cell.CELL_TYPE_NUMERIC:
                                        rowData[columnIndex] = "" + stringData.getNumericCellValue();
                                        break;
                                    case Cell.CELL_TYPE_STRING:
                                        rowData[columnIndex] = stringData.getStringCellValue();
                                        break;
                                    default:
                                        break;
                                }

                            }

                            String temp = "";

                            for(int i = 0; i < rowData.length; i++){

                                switch (fileType) {
                                    case "tab":
                                        temp += rowData[i] + "\t";
                                        break;
                                    case "comma":
                                        temp += rowData[i] + ",";
                                        break;
                                    case "pipe":
                                        temp += rowData[i] + "|";
                                        break;
                                    default:
                                        break;
                                }

                            }
                            
                            text.add(temp);

                        }
                        
                        text.add("");

                    }
                    
                }
                
            }
            
            wb.close();
            input.close();
            
        }catch(IOException io){
            
        }
        
        return text;
    }
    
}
