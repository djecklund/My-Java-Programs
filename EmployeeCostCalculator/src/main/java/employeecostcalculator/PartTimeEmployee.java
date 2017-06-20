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
public class PartTimeEmployee extends Employee{
    
    private String empName;
    private String jobTitle;
    private String empID;
    private double hourlyPay;
    private int hoursWorked;
    private double biweeklyPay;
    
    public PartTimeEmployee(){
        empName = "";
        jobTitle = "";
        empID = "";
        hourlyPay = 0.00;
        hoursWorked = 0;
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
        empID = "PT-" + ID;
    }

    @Override
    public String getEmployeeID() {
        return empID;
    }
    
    public void setHourlyPay(double hourly){
        hourlyPay = hourly;
    }
    
    public double getHourlyPay(){
        return hourlyPay;
    }
    
    public void setHoursWorked(int hours){
        hoursWorked = hours;
    }
    
    public int getHoursWorked(){
        return hoursWorked;
    }

    
    public void setBiweeklyPay(double hourly, double numHoursWorked) {
        biweeklyPay = (hourlyPay * hoursWorked) * 2;
    }

    
    public double getBiweeklyPay() {
        return biweeklyPay;
    }
    
}
