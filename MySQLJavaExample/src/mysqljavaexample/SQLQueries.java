/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqljavaexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Dillon
 */
public class SQLQueries {
    
    Connection databaseConnection;
    Statement myStatement;
    ResultSet queryResults;
    
    public SQLQueries(int index){
        
        try{
            // Connect to the database
            databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_clinic?autoReconnect=true&useSSL=false", "My_User_Name", "My_Password");
            
            // Create the statement
            myStatement = databaseConnection.createStatement();
            
            // Execute the SQL query
            queryResults = myStatement.executeQuery(determineTheQuery(index));
            
        }catch(Exception ex){
            
        }
            
    }
    
    // Determine which query the user wants based on what the selected index was
    // in the combo box.
    private String determineTheQuery(int index){
        
        String query = "";
        
        switch(index){
            case 0:
                query = "select * from employee";
                break;
            case 1:
                query = "select * from patient";
                break;
            case 2: 
                query = "select * from has";
                break;
            case 3:
                query = "select * from insurance";
                break;
            case 4:
                query = "select * from diagnosis";
                break;
            case 5:
                query = "select * from medication";
                break;
            case 6:
                query = "select * from procedures";
                break;
            case 7:
                query = "select * from visits";
                break;
            case 8:
                query = "select * from visitmed";
                break;
            case 9:
                query = "select * from visitpro";
                break;
            case 10:
                query = "select p.fname, p.lname, a.med_name, m.dosage, m.duration from patient p, visitmed m, medication a, visits v "
                        + "where p.pat_id = 10017 and v.patient_id = p.pat_id and v.vid = m.vid and a.med_num = m.med_num";
                break;
            case 11:
                query = "select fname, lname, i.Iname, i.Copay, i.Percent_of_pay\n" +
                        "from patient p, has h, insurance i\n" +
                        "where p.Policy_num = h.Policy_num and h.Iname = i.Iname";
                break;
        }
        
        return query;
    }
    
    // Return the query results so they can be displayed in the text area.
    public StringBuilder gatherDataFromQuery(int index){
        
        StringBuilder results = new StringBuilder();
        
        try{
            
            while(queryResults.next()){
                
                switch(index){
                
                case 0:
                    results.append(queryResults.getString("eid")).append("\t");
                    results.append(queryResults.getString("fname")).append("\t");
                    results.append(queryResults.getString("lname")).append("\t");
                    results.append(queryResults.getString("sex")).append("\t");
                    results.append(queryResults.getString("dob")).append("\t");
                    results.append(queryResults.getString("job_title")).append("\t");
                    results.append(queryResults.getString("salary")).append("\t");
                    results.append("\n");
                    break;
                case 1:
                    results.append(queryResults.getString("pat_id")).append("\t");
                    results.append(queryResults.getString("fname")).append("\t");
                    results.append(queryResults.getString("lname")).append("\t");
                    results.append(queryResults.getString("sex")).append("\t");
                    results.append(queryResults.getString("dob")).append("\t");
                    results.append(queryResults.getString("phone_num")).append("\t");
                    results.append(queryResults.getString("policy_num")).append("\t");
                    results.append("\n");
                    break;
                case 2: 
                    results.append(queryResults.getString("iname")).append("\t");
                    results.append(queryResults.getString("policy_num")).append("\t");
                    results.append("\n");
                    break;
                case 3:
                    results.append(queryResults.getString("iname")).append("\t");
                    results.append(queryResults.getString("copay")).append("\t");
                    results.append(queryResults.getString("percent_of_pay")).append("\t");
                    results.append(queryResults.getString("accept")).append("\t");
                    results.append("\n");
                    break;
                case 4:
                    results.append(queryResults.getString("diag_num")).append("\t");
                    results.append(queryResults.getString("diagnosis")).append("\t");
                    results.append("\n");
                    break;
                case 5:
                    results.append(queryResults.getString("med_num")).append("\t");
                    results.append(queryResults.getString("med_name")).append("\t");
                    results.append(queryResults.getString("cost_per_dosage")).append("\t");
                    results.append("\n");
                    break;
                case 6:
                    results.append(queryResults.getString("pro_num")).append("\t");
                    results.append(queryResults.getString("pro_name")).append("\t");
                    results.append(queryResults.getString("pcost")).append("\t");
                    results.append("\n");
                    break;
                case 7:
                    results.append(queryResults.getString("vid")).append("\t");
                    results.append(queryResults.getString("vdate")).append("\t");
                    results.append(queryResults.getString("vtime")).append("\t");
                    results.append(queryResults.getString("eid")).append("\t");
                    results.append(queryResults.getString("patient_id")).append("\t");
                    results.append(queryResults.getString("diag_num")).append("\t");
                    results.append(queryResults.getString("total_cost")).append("\t");
                    results.append("\n");
                    break;
                case 8:
                    results.append(queryResults.getString("vid")).append("\t");
                    results.append(queryResults.getString("med_num")).append("\t");
                    results.append(queryResults.getString("dosage")).append("\t");
                    results.append(queryResults.getString("duration")).append("\t");
                    results.append("\n");
                    break;
                case 9:
                    results.append(queryResults.getString("vid")).append("\t");
                    results.append(queryResults.getString("pro_num")).append("\t");
                    results.append("\n");
                    break;
                case 10:
                    results.append(queryResults.getString("fname")).append("\t");
                    results.append(queryResults.getString("lname")).append("\t");
                    results.append(queryResults.getString("med_name")).append("\t");
                    results.append(queryResults.getString("dosage")).append("\t");
                    results.append(queryResults.getString("duration")).append("\t");
                    results.append("\n");
                    break;
                case 11:
                    results.append(queryResults.getString("fname")).append("\t");
                    results.append(queryResults.getString("lname")).append("\t");
                    results.append(queryResults.getString("iname")).append("\t");
                    results.append(queryResults.getString("copay")).append("\t");
                    results.append(queryResults.getString("percent_of_pay")).append("\t");
                    results.append("\n");
                    break;
                
            }
            
            }
            
        }catch(Exception ex){
            
        }
        
        return results;
    }
    
}
