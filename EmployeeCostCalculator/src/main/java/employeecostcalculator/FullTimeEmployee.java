/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeecostcalculator;

/**
 *
 * @author dillon
 */
public class FullTimeEmployee extends Employee{
    
    private String empName;
    private String jobTitle;
    private String empID;
    private double salary;
    private double biweeklyPay;
    
    public FullTimeEmployee(){
        empName = "";
        jobTitle = "";
        empID = "";
        salary = 0.00;
        biweeklyPay = 0.00;
    }
    
    @Override
    public void setName(String name) {
        empName = name;
    }

    @Override
    public String getName() {
        return empName;
    }
    
    @Override
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    @Override
    public String getJobTitle() {
        return jobTitle;
    }
    
    @Override
    public void setEmployeeID(int ID) {
        empID = "FT-" + ID;
    }

    @Override
    public String getEmployeeID() {
        return empID;
    }
    
    public void setSalary(double sal){
        salary = sal;
    }
    
    public Double getSalary(){
        return salary;
    }

    
    public void setBiweeklyPay(double sal) {
        biweeklyPay = sal / 26;
    }

    
    public double getBiweeklyPay() {
        return biweeklyPay;
    }
    
}
