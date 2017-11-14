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
        
        switch(export){
            case "Excel 2007 & up (xlsx extension)":
                
                String resultsPath = "Exports/Class Info.xlsx";
                
                try{
                    
                    XSSFWorkbook classInfoWB = new XSSFWorkbook();
                    XSSFSheet classSheet = classInfoWB.createSheet("Classes");

                    // Write the data into the spreadsheet
                    
                    for(int i = 0; i < classInfo.size(); i++){

                        XSSFRow classRow = classSheet.createRow(i + 1);
                                                
                        XSSFCell subjectCell = classRow.createCell(0);
                        XSSFCell titleCell = classRow.createCell(1);
                        XSSFCell gradeCell = classRow.createCell(2);
                        XSSFCell creditHourCell = classRow.createCell(3);
                        XSSFCell qualityPointsCell = classRow.createCell(4);
                        
                        subjectCell.setCellValue(classInfo.get(i).getSubject());
                        titleCell.setCellValue(classInfo.get(i).getTitle());
                        gradeCell.setCellValue(classInfo.get(i).getGrade());
                        creditHourCell.setCellValue(classInfo.get(i).getCreditHours());
                        qualityPointsCell.setCellValue(classInfo.get(i).getQualityPoints());
                        
                    }
                    
                    XSSFRow classHeaders = classSheet.createRow(0);
                        
                    XSSFCell subjectHeaderCell = classHeaders.createCell(0);
                    XSSFCell titleHeaderCell = classHeaders.createCell(1);
                    XSSFCell gradeHeaderCell = classHeaders.createCell(2);
                    XSSFCell creditHourHeaderCell = classHeaders.createCell(3);
                    XSSFCell qualityPointsHeaderCell = classHeaders.createCell(4);
                        
                    subjectHeaderCell.setCellValue("Subject");
                    titleHeaderCell.setCellValue("Title");
                    gradeHeaderCell.setCellValue("Grade");
                    creditHourHeaderCell.setCellValue("Credit Hours");
                    qualityPointsHeaderCell.setCellValue("Quality Points");

                    
                    FileOutputStream resultsOutputFile = new FileOutputStream(resultsPath);

                    // Resize the columns of both sheets to fit the data
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
                
                JOptionPane.showMessageDialog(null, "Data has been exported in " + export + " format");
                break;
            case "Excel older (xls extension)":
                
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
                
                JOptionPane.showMessageDialog(null, "Data has been exported in " + export + " format");
                break;
            case "Text file (tab delimited)":
                
                try{
                    FileWriter file_writer = new FileWriter("Exports/Class Info.tsv");
                    PrintWriter print_writer = new PrintWriter(file_writer);
                    
                    print_writer.println("Subject\tTitle\tGrade\tCredit Hours\tQuality Points");
                    print_writer.println("-------------------------------------------------------------------------------------------------");
                    for(int i = 0; i < classInfo.size(); i++){
                        print_writer.println(classInfo.get(i).getSubject() + "\t" + classInfo.get(i).getTitle()
                        + "\t" + classInfo.get(i).getGrade() + "\t" + classInfo.get(i).getCreditHours()
                        + "\t" + classInfo.get(i).getQualityPoints());
                    }
                    
                    print_writer.close();
                    
                }catch(IOException io){
                    
                }
                
                JOptionPane.showMessageDialog(null, "Data has been exported in " + export + " format");
                break;
            case "Text file (comma separated)":
                
                try{
                    FileWriter file_writer = new FileWriter("Exports/Class Info.csv");
                    PrintWriter print_writer = new PrintWriter(file_writer);
                    
                    print_writer.println("Subject,Title,Grade,Credit Hours,Quality Points");
                    for(int i = 0; i < classInfo.size(); i++){
                        print_writer.println(classInfo.get(i).getSubject() + "," + classInfo.get(i).getTitle()
                        + "," + classInfo.get(i).getGrade() + "," + classInfo.get(i).getCreditHours()
                        + "," + classInfo.get(i).getQualityPoints());
                    }
                    
                    print_writer.close();
                    
                }catch(IOException io){
                    
                }
                
                JOptionPane.showMessageDialog(null, "Data has been exported in " + export + " format");
                break;
            case "Text file (pipe delimited)":
                
                try{
                    FileWriter file_writer = new FileWriter("Exports/Class Info.pip");
                    PrintWriter print_writer = new PrintWriter(file_writer);
                    
                    print_writer.println("Subject|Title|Grade|Credit Hours|Quality Points");
                    print_writer.println("-------------------------------------------------------------------------------------------------");
                    for(int i = 0; i < classInfo.size(); i++){
                        print_writer.println(classInfo.get(i).getSubject() + "|" + classInfo.get(i).getTitle()
                        + "|" + classInfo.get(i).getGrade() + "|" + classInfo.get(i).getCreditHours()
                        + "|" + classInfo.get(i).getQualityPoints());
                    }
                    
                    print_writer.close();
                    
                }catch(IOException io){
                    
                }
                
                JOptionPane.showMessageDialog(null, "Data has been exported in " + export + " format");
                break;
            default:
                break;
        }
                
    }
    
    public String giveASample(ArrayList<ClassInfo> classInfo, String export){
        
        String sample = "";
        
        switch(export){
            
            case "Excel 2007 & up (xlsx extension)":
                sample = "No way to show a sample of what an excel spreadsheet would look like...";
                break;
            case "Excel older (xls extension)":
                sample = "No way to show a sample of what an excel spreadsheet would look like...";
                break;
            case "Text file (tab delimited)":
                
                sample += "Subject\tTitle\tGrade\tCredit Hours\tQuality Points;";
                sample += "-------------------------------------------------------------------------------------------------------------;";
                
                for(int i = 0; i < 11; i++){
                    sample += classInfo.get(i).getSubject() + "\t" + classInfo.get(i).getTitle() + "\t" + classInfo.get(i).getGrade() + "\t" + classInfo.get(i).getCreditHours() 
                            + "\t" + classInfo.get(i).getQualityPoints() + ";";
                }
                
                break;
            case "Text file (comma separated)":
                
                sample += "Subject,Title,Grade,Credit Hours,Quality Points;";
                sample += "-------------------------------------------------------------------------------------------------------------;";
                
                for(int i = 0; i < 11; i++){
                    sample += classInfo.get(i).getSubject() + "," + classInfo.get(i).getTitle() + "," + classInfo.get(i).getGrade() + "," + classInfo.get(i).getCreditHours() 
                            + "," + classInfo.get(i).getQualityPoints() + ";";
                }
                
                break;
            case "Text file (pipe delimited)":
                
                sample += "Subject|Title|Grade|Credit Hours|Quality Points;";
                sample += "-------------------------------------------------------------------------------------------------------------;";
                
                for(int i = 0; i < 11; i++){
                    sample += classInfo.get(i).getSubject() + "|" + classInfo.get(i).getTitle() + "|" + classInfo.get(i).getGrade() + "|" + classInfo.get(i).getCreditHours() 
                            + "|" + classInfo.get(i).getQualityPoints() + ";";
                }
                
                break;
            default:
                break;
            
        }
        
        for(int i = 0; i < classInfo.size(); i++){
            
        }
        
        return sample;
    }
    
}