/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahashmapexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author dillon
 */
public class Main {
    
    public static void main(String[] args){
        
        // Create a HashMap, the Integer object will be a mock employee id
        HashMap<Integer, Employee> employees = new HashMap<>();
        
        // This is a file I created with 10,000 randomly generated employees
        /*
            It contains these attributes:
            
            1.) Employee First Name
            2.) Employee Last Name
        `   3.) Job Type (Part or Full Time)
            4.) Job Title
            5.) Salary
        */
        File f = new File("Employee File/Employee Info.txt");
        
        try(Scanner scan = new Scanner(f)){
            
            // Unique Employee id
            int id = 1;
            
            while(scan.hasNext()){
                
                String line[] = scan.nextLine().split("\\|");
                
                Employee employeeData = new Employee();
                employeeData.setFname(line[0]);
                employeeData.setLname(line[1]);
                employeeData.setJobType(line[2]);
                employeeData.setJobTitle(line[3]);
                employeeData.setSalary(Double.parseDouble(line[4]));
                
                employees.put(id, employeeData);
                id++;
                
            }
            
        }catch(FileNotFoundException fnf){
            
        }
        
        // Print out the employee details and format the salary
        DecimalFormat moneyFormat = new DecimalFormat("$###,###.00");
        for(Integer empId: employees.keySet()){
            
            System.out.println("Employee First Name: " + employees.get(empId).getFname());
            System.out.println("Employee Last Name: " + employees.get(empId).getLname());
            System.out.println("Employee Job Type: " + employees.get(empId).getJobType());
            System.out.println("Employee Job Title: " + employees.get(empId).getJobTitle());
            System.out.println("Employee Salary: " + moneyFormat.format(employees.get(empId).getSalary()));
            System.out.println();
            System.out.println();
        }
        
        
        // Calculate the cost of all full time and part time employees
        // Give a break down of each job type
        
        double totalPartSalary = 0.00;
        double totalFullSalary = 0.00;
        
        for(Integer empId: employees.keySet()){
            
            if(employees.get(empId).getJobType().equals("Full Time")){
                totalFullSalary += employees.get(empId).getSalary();
            }
            else{
                totalPartSalary += employees.get(empId).getSalary();
            }
            
        }
        
        System.out.println("Total cost of Full Time Employees: " + moneyFormat.format(totalFullSalary));
        System.out.println("Total cost of Part Time Employees: " + moneyFormat.format(totalPartSalary));
        System.out.println("Total cost of all Employees: " + moneyFormat.format((totalFullSalary + totalPartSalary)));
        
    }
    
}
