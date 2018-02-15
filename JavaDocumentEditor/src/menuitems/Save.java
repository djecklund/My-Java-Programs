/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuitems;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Dillon
 */
public class Save {
    
    private String fullPath;
    public String fileName;
    private String[] temp;
    
    public Save(){
        fullPath = fileName = "";
    }
    
    public void saveDocument(String text){
        
        JFileChooser saveAs = new JFileChooser();
        saveAs.setApproveButtonText("Save");
        
        FileNameExtensionFilter textFilter = new FileNameExtensionFilter("Text", "txt");
        FileNameExtensionFilter csvFilter = new FileNameExtensionFilter("CSV", "csv");
        FileNameExtensionFilter tsvFilter = new FileNameExtensionFilter("TSV", "tsv");
        FileNameExtensionFilter pipeFilter = new FileNameExtensionFilter("PIPE", "pip");
        FileNameExtensionFilter xlsFilter = new FileNameExtensionFilter("XLS", "xls");
        FileNameExtensionFilter xlsxFilter = new FileNameExtensionFilter("XLSX", "xlsx");
        
        saveAs.setFileFilter(textFilter);
        saveAs.addChoosableFileFilter(csvFilter);
        saveAs.addChoosableFileFilter(tsvFilter);
        saveAs.addChoosableFileFilter(pipeFilter);
        saveAs.addChoosableFileFilter(xlsFilter);
        saveAs.addChoosableFileFilter(xlsxFilter);
        
        int returnVal = saveAs.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            fullPath = saveAs.getSelectedFile().getAbsolutePath();
            saveTextDocument(text, saveAs.getFileFilter().getDescription());
        }
        
        System.out.println("The file pathway is: " + fullPath);
    }
    
    public void saveTextDocument(String text, String fileExtension){
        
        File file = new File("");
        temp = fullPath.split("\\\\");
        fileName = temp[temp.length - 1];
        
        switch(fileExtension){
            case "Text":
                if(fullPath.endsWith(".txt")){
                    file = new File(fullPath);
                    fileName = temp[temp.length - 1];
                }
                else{
                    file = new File(fullPath + ".txt");
                    fileName = temp[temp.length - 1] + ".txt";
                }
                break;
            case "CSV":
                if(fullPath.endsWith(".csv")){
                    file = new File(fullPath);
                    fileName = temp[temp.length - 1];
                }
                else{
                    file = new File(fullPath + ".csv");
                    fileName = temp[temp.length - 1] + ".csv";
                }
                break;
            case "TSV":
                if(fullPath.endsWith(".tsv")){
                    file = new File(fullPath);
                    fileName = temp[temp.length - 1];
                }
                else{
                    file = new File(fullPath + ".tsv");
                    fileName = temp[temp.length - 1] + ".tsv";
                }
                break;
            case "PIPE":
                if(fullPath.endsWith(".pip")){
                    file = new File(fullPath);
                    fileName = temp[temp.length - 1];
                }
                else{
                    file = new File(fullPath + ".pip");
                    fileName = temp[temp.length - 1] + ".pip";
                }
                break;
        }
        
        try{
            
            PrintWriter writer = new PrintWriter(file);
            writer.println(text);
            
            writer.close();
            
        }catch(FileNotFoundException n){
            
        }
        
    }
    
    public void saveXLSDocument(){
        
        
        
    }
    
}
