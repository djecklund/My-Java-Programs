/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuitems;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author Dillon
 */
public class Open {
    
    private String fullPath;
    public String fileName;
    private String[] temp;
    private ArrayList<String> text;
    
    public Open(){
        fullPath = fileName = "";
        text = new ArrayList<>();
    }
    
    // Select a document and get the full path of the document to use when opening and 
    // saving document's contents to ArrayList.
    public ArrayList<String> selectDocument(){
        
        // Set up the different types of files the user can open
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter textFilter = new FileNameExtensionFilter("Text", "txt");
        FileNameExtensionFilter csvFilter = new FileNameExtensionFilter("CSV", "csv");
        FileNameExtensionFilter tsvFilter = new FileNameExtensionFilter("TSV", "tsv");
        FileNameExtensionFilter pipeFilter = new FileNameExtensionFilter("PIPE", "pip");
        FileNameExtensionFilter xlsFilter = new FileNameExtensionFilter("XLS", "xls");
        FileNameExtensionFilter xlsxFilter = new FileNameExtensionFilter("XLSX", "xlsx");
        
        // Add the filters to the File Chooser.
        chooser.setFileFilter(textFilter);
        chooser.addChoosableFileFilter(csvFilter);
        chooser.addChoosableFileFilter(tsvFilter);
        chooser.addChoosableFileFilter(pipeFilter);
        chooser.addChoosableFileFilter(xlsFilter);
        chooser.addChoosableFileFilter(xlsxFilter);
        
        // Open the file chooser, let the user select a file and get the file's
        // full path.
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            fullPath = chooser.getSelectedFile().getAbsolutePath();
            
            // Split up the full path by it's backslashes in order to determine what the
            // file name is. The file name will be placed at the top of the document editor.
            // This will help the user by showing them what document they are working on.
            temp = fullPath.split("\\\\");
            
            // Add the extension to the file name
            String fileExtension = chooser.getFileFilter().getDescription();
            switch(fileExtension){
                case "Text":
                    if(fullPath.endsWith(".txt")){
                        fileName = temp[temp.length - 1];
                    }
                    else{
                        fileName = temp[temp.length - 1] + ".txt";
                    }
                    break;
                case "CSV":
                    if(fullPath.endsWith(".csv")){
                        fileName = temp[temp.length - 1];
                    }
                    else{
                        fileName = temp[temp.length - 1] + ".csv";
                    }
                    break;
                case "TSV":
                    if(fullPath.endsWith(".tsv")){
                        fileName = temp[temp.length - 1];
                    }
                    else{
                        fileName = temp[temp.length - 1] + ".tsv";
                    }
                    break;
                case "PIPE":
                    if(fullPath.endsWith(".pip")){
                        fileName = temp[temp.length - 1];
                    }
                    else{
                        fileName = temp[temp.length - 1] + ".pip";
                    }
                    break;
                case "XLS":
                    if(fullPath.endsWith(".xls")){
                        fileName = temp[temp.length - 1];
                    }
                    else{
                        fileName = temp[temp.length - 1] + ".xls";
                    }
                    break;
                case "XLSX":
                    if(fullPath.endsWith(".xlsx")){
                        fileName = temp[temp.length - 1];
                    }
                    else{
                        fileName = temp[temp.length - 1] + ".xlsx";
                    }
                    break;
            }
            
        }
        
        // Determine what kind of document the user selected and get the data from
        // the file 
        if(fullPath.endsWith(".txt") || fullPath.endsWith(".csv") || fullPath.endsWith(".tsv")
                || fullPath.endsWith(".xml") || fullPath.endsWith(".pip")){
            openTextDocument();
        }
        else if(fullPath.endsWith(".xls")){
            openXlsDocument();
        }
        else if(fullPath.endsWith(".xlsx")){
            openXlsxDocument();
        }
        
        return text;
    }
    
    // Open the selected document and save it's contents to the ArrayList
    public void openTextDocument(){
        
        // Get the full path to the file
        File file = new File(fullPath);
        
        try{
            
            Scanner scan = new Scanner(file);
            
            // While there is data available, read each line of the file into
            // the ArrayList.
            while(scan.hasNextLine()){
                text.add(scan.nextLine());
            }
            
        }catch(FileNotFoundException f){
            
        }
        
    }
    
    // Open a document with extension .xls
    public void openXlsDocument(){
        
        try{
            
            // Get the full pathway
            File file = new File(fullPath);
            
            // Determine if it exists
            if(file.exists()){
                
                // Ask the user how they want the data displayed
                String fileType = JOptionPane.showInputDialog("Enter what separates the data: (EX: tab, comma, pipe)");
                
                if(fileType.equals("tab") || fileType.equals("comma") || fileType.equals("pipe")){
                    
                    Workbook wb = Workbook.getWorkbook(file);
                    
                    // Determine the number of sheets in the excel spreadsheet
                    int numberOfSheets = wb.getNumberOfSheets();
                    
                    // Loop through each sheet the collect it's data.
                    for(int sheetNum = 0; sheetNum < numberOfSheets; sheetNum++){
                        
                        // Display the sheet name to show the user which sheet each piece of data
                        // came from.
                        text.add("Sheet # " + sheetNum);
                        
                        Sheet sheet = wb.getSheet(sheetNum);
                        
                        // Get the number of rows and columns for each sheet
                        int rows = sheet.getRows();
                        int columns = sheet.getColumns();

                        // Loop through the spreadsheet and collect the
                        // data from each row.
                        for(int i = 0; i < rows; i ++){
                            
                            // Store the data for each row into a string array.
                            // This data will later be concatenated together 
                            // to store into an ArrayList of Strings.
                            String[] rowData = new String[columns];

                            for(int j = 0; j < columns; j++){

                                Cell stringData = sheet.getCell(j,i);

                                rowData[j] = stringData.getContents();

                            }
                            
                            // Temporary string to hold the concatenated row data.
                            String temp = "";
                            
                            // Loop through the row data and concatenate it to 
                            // the temp string.
                            for(int l = 0; l < rowData.length; l++){

                                switch (fileType) {
                                    case "tab":
                                        if(i < columns - 1){
                                            temp += rowData[i] + "\t";
                                        }
                                        else{
                                            temp += rowData[i];
                                        }
                                        break;
                                    case "comma":
                                        if(i < columns - 1){
                                            temp += rowData[i] + ",";
                                        }
                                        else{
                                            temp += rowData[i];
                                        }
                                        break;
                                    case "pipe":
                                        if(i < columns - 1){
                                            temp += rowData[i] + "|";
                                        }
                                        else{
                                            temp += rowData[i];
                                        }
                                        break;
                                    default:
                                        break;
                                }

                            }
                            
                            // Add the string to the ArrayList
                            text.add(temp);

                        }
                        
                        // Separate each sheet by a new line.
                        text.add("");
                    }
            }
            else{
                JOptionPane.showMessageDialog(null, fileType + " is not a valid option, please pick from the following: tab, comma, or pipe.");
            }
                    
        }
        }catch(IOException | BiffException biff){

        }
        
    }
    
    public void openXlsxDocument(){
        exceldatacollection.OpenExcel open = new exceldatacollection.OpenExcel();
        text = open.openXlsxDocument(fullPath);
    }
    
}
