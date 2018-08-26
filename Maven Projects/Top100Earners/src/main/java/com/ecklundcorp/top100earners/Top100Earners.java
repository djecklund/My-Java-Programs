/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecklundcorp.top100earners;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dillon
 */
public class Top100Earners {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        // ArrayList for the personal data
        ArrayList<PersonalInfo> personalData = new ArrayList<>();
        
        // Populate the arraylist with data from the ClientData.xlsx spreadsheet
        ReadFromExcel reader = new ReadFromExcel();
        reader.read();
        personalData = reader.getPersonalData();
        
        // Find all the duplicate incomes throughout the arraylist and add them up
        FindDuplicatePeople add = new FindDuplicatePeople(personalData);
        add.addUpCounts();
        personalData = add.getClientData();
        
        // Sort the people by their end total income. Sort from largest to smallest
        SortTheData sorter = new SortTheData();
        sorter.sort(personalData);
        personalData = sorter.getPersonalData();
        
        // Finish up by writing the results to the results.xlsx spreadsheet
        WriteToExcel writer = new WriteToExcel();
        writer.writeData(personalData);
        
    }
    
}
