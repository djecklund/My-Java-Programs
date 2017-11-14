/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author decklu
 */
public class Export {
    
    public void exportToFile(ArrayList<ClassInfo> classInfo, String export){
        
        // Check to see what selection the user has made in the export combo box.
        switch(export){
            // The user selected the newer version of excel to export to
            case "Excel (xlsx extension)":
                
                // Path where file will be written
                String resultsPath = "Exports/Class Info.xlsx";
                
                try{
                    
                    // Create workbook and sheet within workbook
                    XSSFWorkbook classInfoWB = new XSSFWorkbook();
                    XSSFSheet classSheet = classInfoWB.createSheet("Classes");

                    // Write the data into the spreadsheet
                    for(int i = 0; i < classInfo.size(); i++){
                        
                        // Create each row that the data will go into
                        XSSFRow classRow = classSheet.createRow(i + 1);
                        
                        // Create the cells for each row
                        XSSFCell subjectCell = classRow.createCell(0);
                        XSSFCell titleCell = classRow.createCell(1);
                        XSSFCell gradeCell = classRow.createCell(2);
                        XSSFCell creditHourCell = classRow.createCell(3);
                        XSSFCell qualityPointsCell = classRow.createCell(4);
                        
                        // Place the data in each cell of each row
                        subjectCell.setCellValue(classInfo.get(i).getSubject());
                        titleCell.setCellValue(classInfo.get(i).getTitle());
                        gradeCell.setCellValue(classInfo.get(i).getGrade());
                        creditHourCell.setCellValue(classInfo.get(i).getCreditHours());
                        qualityPointsCell.setCellValue(classInfo.get(i).getQualityPoints());
                        
                    }
                    
                    // Create the header row
                    XSSFRow classHeaders = classSheet.createRow(0);
                    
                    // Create the cells of the header row
                    XSSFCell subjectHeaderCell = classHeaders.createCell(0);
                    XSSFCell titleHeaderCell = classHeaders.createCell(1);
                    XSSFCell gradeHeaderCell = classHeaders.createCell(2);
                    XSSFCell creditHourHeaderCell = classHeaders.createCell(3);
                    XSSFCell qualityPointsHeaderCell = classHeaders.createCell(4);
                    
                    // Populate the cells of the header row
                    subjectHeaderCell.setCellValue("Subject");
                    titleHeaderCell.setCellValue("Title");
                    gradeHeaderCell.setCellValue("Grade");
                    creditHourHeaderCell.setCellValue("Credit Hours");
                    qualityPointsHeaderCell.setCellValue("Quality Points");
                    
                    FileOutputStream resultsOutputFile = new FileOutputStream(resultsPath);

                    // Resize each column to fit the data
                    classSheet.autoSizeColumn(0);
                    classSheet.autoSizeColumn(1);
                    classSheet.autoSizeColumn(2);
                    classSheet.autoSizeColumn(3);
                    classSheet.autoSizeColumn(4);
                    
                    //write this workbook to an OutputStream
                    classInfoWB.write(resultsOutputFile);
                    resultsOutputFile.flush();
                    resultsOutputFile.close();
                    
                }catch(IOException io){
                    
                }
                
                // Inform the user of export completion
                JOptionPane.showMessageDialog(null, "Data has been exported in " + export + " format");
                break;
            
            // User selected the older excel format
            case "Excel (xls extension)":
                
                try{
                    // Create the workbook and sheet
                    WritableWorkbook classInfoWB = Workbook.createWorkbook(new File("Exports/Class Info.xls"));
                    WritableSheet classInfoSheet = classInfoWB.createSheet("Classes", 0);
                    
                    // add the data to the spreadsheet
                    for(int i = 0; i < classInfo.size(); i++){
                        
                        Label subject = new Label(0, i + 1, classInfo.get(i).getSubject());
                        Label title = new Label(1, i + 1, classInfo.get(i).getTitle());
                        Label grade = new Label(2, i + 1, "" + classInfo.get(i).getGrade());
                        Label creditHours = new Label(3, i + 1, "" + classInfo.get(i).getCreditHours());
                        Label qualityPoints = new Label(4, i + 1, "" + classInfo.get(i).getQualityPoints());
                
                        classInfoSheet.addCell(subject);
                        classInfoSheet.addCell(title);
                        classInfoSheet.addCell(grade);
                        classInfoSheet.addCell(creditHours);
                        classInfoSheet.addCell(qualityPoints);
                        
                    }
                    
                    // Create the headers for each column
                    Label classSubject = new Label(0,0,"Subject");
                    Label classTitle = new Label(1,0,"Title");
                    Label classGrade = new Label(2,0,"Grade");
                    Label classCreditHours = new Label(3,0,"Credit Hours");
                    Label classQualityPoints = new Label(4,0,"Quality Points");

                    classInfoSheet.addCell(classSubject);
                    classInfoSheet.addCell(classTitle);
                    classInfoSheet.addCell(classGrade);
                    classInfoSheet.addCell(classCreditHours);
                    classInfoSheet.addCell(classQualityPoints);
                    // End of header creation

                    // Write the data into the excel spreadsheet and close it.
                    classInfoWB.write();
                    classInfoWB.close();
                    
                }catch(IOException | WriteException write){
                    
                }
                
                // Inform the user of export completion
                JOptionPane.showMessageDialog(null, "Data has been exported in " + export + " format");
                break;
            
            // The user selected the tab delimited file
            case "Text file (tab delimited)":
                
                try{
                    // Create the file to be written to
                    File file = new File("Exports/Class Info.tsv");
                    PrintWriter print_writer = new PrintWriter(file);
                    
                    // Create the header rows for the file
                    print_writer.println("Subject\tTitle\tGrade\tCredit Hours\tQuality Points");
                    print_writer.println("-------------------------------------------------------------------------------------------------");
                    
                    // Write the data into the file
                    for(int i = 0; i < classInfo.size(); i++){
                        print_writer.println(classInfo.get(i).getSubject() + "\t" + classInfo.get(i).getTitle()
                        + "\t" + classInfo.get(i).getGrade() + "\t" + classInfo.get(i).getCreditHours()
                        + "\t" + classInfo.get(i).getQualityPoints());
                    }
                    
                    // Close the file
                    print_writer.close();
                    
                }catch(IOException io){
                    
                }
                
                // Inform the user of export completion
                JOptionPane.showMessageDialog(null, "Data has been exported in " + export + " format");
                break;
            case "Text file (comma separated)":
                
                try{
                    // Create the file to be written to
                    File file = new File("Exports/Class Info.csv");
                    PrintWriter print_writer = new PrintWriter(file);
                    
                    // Create the header rows for the file
                    print_writer.println("Subject,Title,Grade,Credit Hours,Quality Points");
                    print_writer.println("-------------------------------------------------------------------------------------------------");
                    
                    // Write the data into the file
                    for(int i = 0; i < classInfo.size(); i++){
                        print_writer.println(classInfo.get(i).getSubject() + "," + classInfo.get(i).getTitle()
                        + "," + classInfo.get(i).getGrade() + "," + classInfo.get(i).getCreditHours()
                        + "," + classInfo.get(i).getQualityPoints());
                    }
                    
                    // Close the file
                    print_writer.close();
                    
                }catch(IOException io){
                    
                }
                
                // Inform the user of export completion
                JOptionPane.showMessageDialog(null, "Data has been exported in " + export + " format");
                break;
            case "Text file (pipe delimited)":
                
                try{
                    // Create the file to be written to
                    File file = new File("Exports/Class Info.pip");
                    PrintWriter print_writer = new PrintWriter(file);
                    
                    // Create the header rows for the file
                    print_writer.println("Subject|Title|Grade|Credit Hours|Quality Points");
                    print_writer.println("-------------------------------------------------------------------------------------------------");
                    for(int i = 0; i < classInfo.size(); i++){
                        print_writer.println(classInfo.get(i).getSubject() + "|" + classInfo.get(i).getTitle()
                        + "|" + classInfo.get(i).getGrade() + "|" + classInfo.get(i).getCreditHours()
                        + "|" + classInfo.get(i).getQualityPoints());
                    }
                    
                    // Close the file
                    print_writer.close();
                    
                }catch(IOException io){
                    
                }
                
                // Inform the user of export completion
                JOptionPane.showMessageDialog(null, "Data has been exported in " + export + " format");
                break;
            default:
                break;
        }
                
    }
    
    public String giveASample(ArrayList<ClassInfo> classInfo, String export){
        
        String sample = "";
        
        // Determine which file format the user wants
        switch(export){
            
            // If user selects any of the excel formats, tell the user that you cannot show them a sample
            case "Excel (xlsx extension)":
                sample = "No way to show a sample of what an excel spreadsheet would look like...";
                break;
            case "Excel (xls extension)":
                sample = "No way to show a sample of what an excel spreadsheet would look like...";
                break;
            
            // User selects tab delimited
            case "Text file (tab delimited)":
                
                // Create the header
                sample += "Subject\tTitle\tGrade\tCredit Hours\tQuality Points;";
                sample += "-------------------------------------------------------------------------------------------------------------;";
                
                // Create a sampling of the data - half the file
                for(int i = 0; i < classInfo.size() / 2; i++){
                    sample += classInfo.get(i).getSubject() + "\t" + classInfo.get(i).getTitle() + "\t" + classInfo.get(i).getGrade() + "\t" + classInfo.get(i).getCreditHours() 
                            + "\t" + classInfo.get(i).getQualityPoints() + ";";
                }
                
                break;
                
            // User selects comma separated
            case "Text file (comma separated)":
                
                // Create the header
                sample += "Subject,Title,Grade,Credit Hours,Quality Points;";
                sample += "-------------------------------------------------------------------------------------------------------------;";
                
                // Create a sampling of the data - half the file
                for(int i = 0; i < classInfo.size() / 2; i++){
                    sample += classInfo.get(i).getSubject() + "," + classInfo.get(i).getTitle() + "," + classInfo.get(i).getGrade() + "," + classInfo.get(i).getCreditHours() 
                            + "," + classInfo.get(i).getQualityPoints() + ";";
                }
                
                break;
                
            // User selected pip delimited
            case "Text file (pipe delimited)":
                
                // Create the header
                sample += "Subject|Title|Grade|Credit Hours|Quality Points;";
                sample += "-------------------------------------------------------------------------------------------------------------;";
                
                // Create a sampling of the data - half the file
                for(int i = 0; i < classInfo.size() / 2; i++){
                    sample += classInfo.get(i).getSubject() + "|" + classInfo.get(i).getTitle() + "|" + classInfo.get(i).getGrade() + "|" + classInfo.get(i).getCreditHours() 
                            + "|" + classInfo.get(i).getQualityPoints() + ";";
                }
                
                break;
            default:
                break;
            
        }
        
        return sample;
    }
    
}