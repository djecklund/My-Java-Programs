/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecklundcorp.mortgagecalculator;

import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Dillon
 */
public class MortgageReport {
    
    double currentLoanAmount;
    double totalPrinciple;
    double totalInterest;
    
    public MortgageReport(){
        currentLoanAmount = totalPrinciple = totalInterest = 0.00;
    }
    
    public void createReport(double startingLoan, double percent, int numYears, double paymentPerPeriod){
        
        currentLoanAmount = startingLoan;
        
        DecimalFormat moneyFormat = new DecimalFormat("$###,##0.00");
        DecimalFormat percentFormat = new DecimalFormat("###,##0.00%");
        
        File f = new File("Export Files/Mortgage Report.xlsx");
        
        XSSFWorkbook wb = null;
        FileOutputStream fis = null;
        
        try{
            
            wb = new XSSFWorkbook();
            
            XSSFSheet mortgageReportSheet = wb.createSheet("Mortgage Report");
            
            XSSFFont font = wb.createFont();
            font.setBold(true);
            
            XSSFCellStyle yellowDecorationStyle = wb.createCellStyle();
            yellowDecorationStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.YELLOW));
            yellowDecorationStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            
            // Top Rows
            XSSFCellStyle loanStyle = wb.createCellStyle();
            loanStyle.setFont(font);
            
            XSSFRow topRow = mortgageReportSheet.createRow(0);
            XSSFRow topInterestRow = mortgageReportSheet.createRow(1);
            
            XSSFCell startingLoanCell = topRow.createCell(0);
            XSSFCell topInterestCell = topInterestRow.createCell(0);
            
            startingLoanCell.setCellStyle(loanStyle);
            startingLoanCell.setCellValue("Starting house loan (after down payment): " + moneyFormat.format(startingLoan));
            
            topInterestCell.setCellStyle(loanStyle);
            topInterestCell.setCellValue("Annual Interest Rate: " + percentFormat.format(percent));
            
            // End of top rows
            
            XSSFCell decorationCell = null;
            
            int rowNum = 0;
            int currYear = 0;
            
            for(int rowIndex = 2; rowIndex < (numYears * 4) + 4; rowIndex++){
              
                XSSFRow decorationRow = mortgageReportSheet.createRow(rowIndex);
                
                for(int columnIndex = 1; columnIndex < 18; columnIndex++){
                    
                    if(rowNum >= 0){
                        
                        decorationCell = decorationRow.createCell(columnIndex);
                        decorationCell.setCellStyle(yellowDecorationStyle);
                        
                        if(rowNum == 0){
                            
                            if(columnIndex == 3 && rowIndex != 2){
                                
                                if(rowIndex == 6){
                                    
                                    XSSFCellStyle principleStyle = wb.createCellStyle();
                                    principleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
                                    principleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                    
                                    double principle = paymentPerPeriod - ((startingLoan * percent) / 12);
                                    
                                    decorationCell.setCellValue(moneyFormat.format(principle));
                                    decorationCell.setCellStyle(principleStyle);
                                    
                                }
                                else{
                                    
                                    XSSFCellStyle principleStyle = wb.createCellStyle();
                                    principleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
                                    principleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                    
                                    double principle = paymentPerPeriod - ((currentLoanAmount * percent) / 12);
                                    decorationCell.setCellValue(moneyFormat.format(principle));
                                    decorationCell.setCellStyle(principleStyle);

                                }
                                
                            }
                            else if(columnIndex == 4 && rowIndex != 2){
                                
                                XSSFCellStyle principleStyle = wb.createCellStyle();
                                principleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
                                principleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                principleStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM(" + paymentPerPeriod + "-((D" + rowIndex + "*" + percent + ") / 12))";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(principleStyle);
                                
                            }
                            else if(columnIndex == 5 && rowIndex != 2){
                                
                                XSSFCellStyle principleStyle = wb.createCellStyle();
                                principleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
                                principleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                principleStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM(" + paymentPerPeriod + "-((E" + rowIndex + "*" + percent + ") / 12))";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(principleStyle);
                                
                            }
                            else if(columnIndex == 6 && rowIndex != 2){
                                
                                XSSFCellStyle principleStyle = wb.createCellStyle();
                                principleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
                                principleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                principleStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM(" + paymentPerPeriod + "-((F" + rowIndex + "*" + percent + ") / 12))";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(principleStyle);
                                
                            }
                            else if(columnIndex == 7 && rowIndex != 2){
                                
                                XSSFCellStyle principleStyle = wb.createCellStyle();
                                principleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
                                principleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                principleStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM(" + paymentPerPeriod + "-((G" + rowIndex + "*" + percent + ") / 12))";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(principleStyle);
                                
                            }
                            else if(columnIndex == 8 && rowIndex != 2){
                                
                                XSSFCellStyle principleStyle = wb.createCellStyle();
                                principleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
                                principleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                principleStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM(" + paymentPerPeriod + "-((H" + rowIndex + "*" + percent + ") / 12))";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(principleStyle);
                                
                            }
                            else if(columnIndex == 9 && rowIndex != 2){
                                
                                XSSFCellStyle principleStyle = wb.createCellStyle();
                                principleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
                                principleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                principleStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM(" + paymentPerPeriod + "-((I" + rowIndex + "*" + percent + ") / 12))";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(principleStyle);
                                
                            }
                            else if(columnIndex == 10 && rowIndex != 2){
                                
                                XSSFCellStyle principleStyle = wb.createCellStyle();
                                principleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
                                principleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                principleStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM(" + paymentPerPeriod + "-((J" + rowIndex + "*" + percent + ") / 12))";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(principleStyle);
                                
                            }
                            else if(columnIndex == 11 && rowIndex != 2){
                                
                                XSSFCellStyle principleStyle = wb.createCellStyle();
                                principleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
                                principleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                principleStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM(" + paymentPerPeriod + "-((K" + rowIndex + "*" + percent + ") / 12))";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(principleStyle);
                                
                            }
                            else if(columnIndex == 12 && rowIndex != 2){
                                
                                XSSFCellStyle principleStyle = wb.createCellStyle();
                                principleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
                                principleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                principleStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM(" + paymentPerPeriod + "-((L" + rowIndex + "*" + percent + ") / 12))";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(principleStyle);
                                
                            }
                            else if(columnIndex == 13 && rowIndex != 2){
                                
                                XSSFCellStyle principleStyle = wb.createCellStyle();
                                principleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
                                principleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                principleStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM(" + paymentPerPeriod + "-((M" + rowIndex + "*" + percent + ") / 12))";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(principleStyle);
                                
                            }
                            else if(columnIndex == 14 && rowIndex != 2){
                                
                                XSSFCellStyle principleStyle = wb.createCellStyle();
                                principleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
                                principleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                principleStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM(" + paymentPerPeriod + "-((N" + rowIndex + "*" + percent + ") / 12))";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(principleStyle);

                            }
                            
                        }
                        else if(rowNum == 1){
                            
                            if(columnIndex == 3 && rowIndex != 3){
                                                                
                                if(rowIndex == 7){
                                    
                                    XSSFCellStyle interestStyle = wb.createCellStyle();
                                    interestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
                                    interestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                    
                                    double interest = (startingLoan * percent) / 12;
                                    
                                    decorationCell.setCellValue(moneyFormat.format(interest));
                                    decorationCell.setCellStyle(interestStyle);
                                    
                                }
                                else{
                                    
                                    XSSFCellStyle interestStyle = wb.createCellStyle();
                                    interestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
                                    interestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                    
                                    double interest = (currentLoanAmount * percent) / 12;
                                    decorationCell.setCellValue(moneyFormat.format(interest));
                                    decorationCell.setCellStyle(interestStyle);

                                }
                                
                            }
                            else if(columnIndex == 4 && rowIndex != 3){
                                
                                XSSFCellStyle interestStyle = wb.createCellStyle();
                                interestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
                                interestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                interestStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM((D" + (rowIndex - 1) + "*" + percent + ") / 12)";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(interestStyle);
                                
                            }
                            else if(columnIndex == 5 && rowIndex != 3){
                                
                                XSSFCellStyle interestStyle = wb.createCellStyle();
                                interestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
                                interestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                interestStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM((E" + (rowIndex - 1) + "*" + percent + ") / 12)";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(interestStyle);
                                
                            }
                            else if(columnIndex == 6 && rowIndex != 3){
                                
                                XSSFCellStyle interestStyle = wb.createCellStyle();
                                interestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
                                interestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                interestStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM((F" + (rowIndex - 1) + "*" + percent + ") / 12)";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(interestStyle);
                                
                            }
                            else if(columnIndex == 7 && rowIndex != 3){
                                
                                XSSFCellStyle interestStyle = wb.createCellStyle();
                                interestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
                                interestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                interestStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM((G" + (rowIndex - 1) + "*" + percent + ") / 12)";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(interestStyle);
                                
                            }
                            else if(columnIndex == 8 && rowIndex != 3){
                                
                                XSSFCellStyle interestStyle = wb.createCellStyle();
                                interestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
                                interestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                interestStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM((H" + (rowIndex - 1) + "*" + percent + ") / 12)";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(interestStyle);
                                
                            }
                            else if(columnIndex == 9 && rowIndex != 3){
                                
                                XSSFCellStyle interestStyle = wb.createCellStyle();
                                interestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
                                interestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                interestStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM((I" + (rowIndex - 1) + "*" + percent + ") / 12)";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(interestStyle);
                                
                            }
                            else if(columnIndex == 10 && rowIndex != 3){
                                
                                XSSFCellStyle interestStyle = wb.createCellStyle();
                                interestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
                                interestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                interestStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM((J" + (rowIndex - 1) + "*" + percent + ") / 12)";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(interestStyle);
                                
                            }
                            else if(columnIndex == 11 && rowIndex != 3){
                                
                                XSSFCellStyle interestStyle = wb.createCellStyle();
                                interestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
                                interestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                interestStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM((K" + (rowIndex - 1) + "*" + percent + ") / 12)";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(interestStyle);
                                
                            }
                            else if(columnIndex == 12 && rowIndex != 3){
                                
                                XSSFCellStyle interestStyle = wb.createCellStyle();
                                interestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
                                interestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                interestStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM((L" + (rowIndex - 1) + "*" + percent + ") / 12)";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(interestStyle);
                                
                            }
                            else if(columnIndex == 13 && rowIndex != 3){
                                
                                XSSFCellStyle interestStyle = wb.createCellStyle();
                                interestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
                                interestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                interestStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM((M" + (rowIndex - 1) + "*" + percent + ") / 12)";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(interestStyle);
                                
                            }
                            else if(columnIndex == 14 && rowIndex != 3){
                                
                                XSSFCellStyle interestStyle = wb.createCellStyle();
                                interestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
                                interestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                                
                                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                                interestStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                                
                                String formula = "SUM((N" + (rowIndex - 1) + "*" + percent + ") / 12)";
                                decorationCell.setCellType(CellType.FORMULA);
                                decorationCell.setCellFormula(formula);
                                decorationCell.setCellStyle(interestStyle);

                            }
                        }
                        
                        totalPrinciple = 0.00;
                        totalInterest = 0.00;
                        
                    }
                    else{
                        
                        if(rowNum == -2){
                            
                            createTitleRows(wb, decorationRow, columnIndex);
                            
                        }
                        else if (rowNum == -1){
                            
                            totalPrinciple += paymentPerPeriod - ((currentLoanAmount * percent) / 12);
                            totalInterest += (currentLoanAmount * percent) / 12;
                            createCalculationRows(wb, decorationRow, columnIndex, currYear, paymentPerPeriod - ((currentLoanAmount * percent) / 12), rowIndex);

                        }
                        
                        XSSFCell altDecorationCell1 = decorationRow.createCell(1);
                        XSSFCell altDecorationCell2 = decorationRow.createCell(17);
                        
                        altDecorationCell1.setCellStyle(yellowDecorationStyle);
                        altDecorationCell2.setCellStyle(yellowDecorationStyle);
                        
                    }
                    
                }
                
                rowNum++;
                
                if(rowNum == 2){
                    rowNum = -2;
                    currYear++;
                }
            }
                        
            fis = new FileOutputStream(f);
            
            mortgageReportSheet.autoSizeColumn(1);
            mortgageReportSheet.autoSizeColumn(2);
            mortgageReportSheet.autoSizeColumn(3);
            mortgageReportSheet.autoSizeColumn(4);
            mortgageReportSheet.autoSizeColumn(5);
            mortgageReportSheet.autoSizeColumn(6);
            mortgageReportSheet.autoSizeColumn(7);
            mortgageReportSheet.autoSizeColumn(8);
            mortgageReportSheet.autoSizeColumn(9);
            mortgageReportSheet.autoSizeColumn(10);
            mortgageReportSheet.autoSizeColumn(11);
            mortgageReportSheet.autoSizeColumn(12);
            mortgageReportSheet.autoSizeColumn(13);
            mortgageReportSheet.autoSizeColumn(14);
            mortgageReportSheet.autoSizeColumn(15);
            mortgageReportSheet.autoSizeColumn(16);
            mortgageReportSheet.autoSizeColumn(17);
            
            wb.write(fis);
            JOptionPane.showMessageDialog(null, "The Mortgage report has been created.");
            
        }catch(Exception e){
            Logger.getLogger(MortgageReport.class.getName()).log(Level.SEVERE, null, e);
        }
        finally{
            
            if(fis != null){
                try {
                    fis.flush();
                } catch (IOException ex) {
                    Logger.getLogger(MortgageReport.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(MortgageReport.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(wb != null){
                try {
                    wb.close();
                } catch (IOException ex) {
                    Logger.getLogger(MortgageReport.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
    }
    
    private void createTitleRows(XSSFWorkbook wb, XSSFRow row, int col){
        
        XSSFFont font = wb.createFont();
        font.setBold(true);
        
        XSSFCellStyle style = wb.createCellStyle();
        style.setFont(font);
        
        XSSFCellStyle totalPrincipleStyle = wb.createCellStyle();
        totalPrincipleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
        totalPrincipleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        totalPrincipleStyle.setFont(font);
        
        XSSFCellStyle totalInterestStyle = wb.createCellStyle();
        totalInterestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
        totalInterestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        totalInterestStyle.setFont(font);
        
        XSSFCell titleCell = row.createCell(col);
        titleCell.setCellStyle(style);
        
        switch(col){
            case 3:
                titleCell.setCellValue("" + Title.January);
                break;
            case 4:
                titleCell.setCellValue("" + Title.Febuary);
                break;
            case 5:
                titleCell.setCellValue("" + Title.March);
                break;
            case 6:
                titleCell.setCellValue("" + Title.April);
                break;
            case 7:
                titleCell.setCellValue("" + Title.May);
                break;
            case 8:
                titleCell.setCellValue("" + Title.June);
                break;
            case 9:
                titleCell.setCellValue("" + Title.July);
                break;
            case 10:
                titleCell.setCellValue("" + Title.August);
                break;
            case 11:
                titleCell.setCellValue("" + Title.September);
                break;
            case 12:
                titleCell.setCellValue("" + Title.October);
                break;
            case 13:
                titleCell.setCellValue("" + Title.November);
                break;
            case 14:
                titleCell.setCellValue("" + Title.December);
                break;
            case 15:
                titleCell.setCellValue("Principle paid for the year");
                titleCell.setCellStyle(totalPrincipleStyle);
                break;
            case 16:
                titleCell.setCellValue("Interest paid for the year");
                titleCell.setCellStyle(totalInterestStyle);
                break;
            default:
                break;
        }
        
    }
    
    private void createCalculationRows(XSSFWorkbook wb, XSSFRow row, int col, int year, double paymentPerPeriod, int rowIndex){
        
        DecimalFormat moneyFormat = new DecimalFormat("$###,##0.00");
        
        XSSFFont font = wb.createFont();
        font.setBold(true);
        
        XSSFCellStyle style = wb.createCellStyle();
        style.setFont(font);
        
        XSSFCellStyle totalPrincipleStyle = wb.createCellStyle();
        totalPrincipleStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.GREEN));
        totalPrincipleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        totalPrincipleStyle.setFont(font);
        
        XSSFCellStyle totalInterestStyle = wb.createCellStyle();
        totalInterestStyle.setFillForegroundColor(new XSSFColor(java.awt.Color.RED));
        totalInterestStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        totalInterestStyle.setFont(font);
        
        XSSFCell titleCell = row.createCell(col);
        titleCell.setCellStyle(style);
        
        switch(col){
            case 2:
                titleCell.setCellValue("Year " + year);
                break;
            case 3:
                currentLoanAmount =  currentLoanAmount - paymentPerPeriod;
                if(currentLoanAmount > 0)
                    titleCell.setCellValue(moneyFormat.format(currentLoanAmount));
                break;
            case 4:
                currentLoanAmount =  currentLoanAmount - paymentPerPeriod;
                if(currentLoanAmount > 0)
                    titleCell.setCellValue(moneyFormat.format(currentLoanAmount));
                break;
            case 5:
                currentLoanAmount =  currentLoanAmount - paymentPerPeriod;
                if(currentLoanAmount > 0)
                    titleCell.setCellValue(moneyFormat.format(currentLoanAmount));
                break;
            case 6:
                currentLoanAmount =  currentLoanAmount - paymentPerPeriod;
                if(currentLoanAmount > 0)
                    titleCell.setCellValue(moneyFormat.format(currentLoanAmount));
                break;
            case 7:
                currentLoanAmount =  currentLoanAmount - paymentPerPeriod;
                if(currentLoanAmount > 0)
                    titleCell.setCellValue(moneyFormat.format(currentLoanAmount));
                break;
            case 8:
                currentLoanAmount =  currentLoanAmount - paymentPerPeriod;
                if(currentLoanAmount > 0)
                    titleCell.setCellValue(moneyFormat.format(currentLoanAmount));
                break;
            case 9:
                currentLoanAmount =  currentLoanAmount - paymentPerPeriod;
                if(currentLoanAmount > 0)
                    titleCell.setCellValue(moneyFormat.format(currentLoanAmount));
                break;
            case 10:
                currentLoanAmount =  currentLoanAmount - paymentPerPeriod;
                if(currentLoanAmount > 0)
                    titleCell.setCellValue(moneyFormat.format(currentLoanAmount));
                break;
            case 11:
                currentLoanAmount =  currentLoanAmount - paymentPerPeriod;
                if(currentLoanAmount > 0)
                    titleCell.setCellValue(moneyFormat.format(currentLoanAmount));
                break;
            case 12:
                currentLoanAmount =  currentLoanAmount - paymentPerPeriod;
                if(currentLoanAmount > 0)
                    titleCell.setCellValue(moneyFormat.format(currentLoanAmount));
                break;
            case 13:
                currentLoanAmount =  currentLoanAmount - paymentPerPeriod;
                if(currentLoanAmount > 0)
                    titleCell.setCellValue(moneyFormat.format(currentLoanAmount));
                break;
            case 14:
                currentLoanAmount =  currentLoanAmount - paymentPerPeriod;
                if(currentLoanAmount > 0)
                    titleCell.setCellValue(moneyFormat.format(currentLoanAmount));
                break;
            case 15:
                String formula = "SUM(D" + "" + (rowIndex + 2) + ":O" + "" + (rowIndex + 2) + ")";
                titleCell.setCellType(CellType.FORMULA);
                
                String format = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                totalPrincipleStyle.setDataFormat(wb.createDataFormat().getFormat(format.replace("<ccy>", "$")));
                
                titleCell.setCellFormula(formula);
                titleCell.setCellStyle(totalPrincipleStyle);
                break;
            case 16:
                
                String formula2 = "SUM(D" + "" + (rowIndex + 3) + ":O" + "" + (rowIndex + 3) + ")";
                titleCell.setCellType(CellType.FORMULA);
                
                String format2 = "_(<ccy>* #,##0.00_);_(<ccy>* (#,##0.00);_(<ccy>* \\\"-\\\"??_);_(@_)";
                totalInterestStyle.setDataFormat(wb.createDataFormat().getFormat(format2.replace("<ccy>", "$")));
                
                titleCell.setCellFormula(formula2);
                titleCell.setCellStyle(totalInterestStyle);
                break;
            default:
                break;
        }
        
    }
    
}
