/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package top100earners;

/**
 *
 * @author dillon
 */
public class PersonalInfo {
    
    private String name;
    private double income;
    
    public PersonalInfo(){
        name = "";
        income = 0.00;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public void setIncome(double i){
        income = i;
    }
    
    public double getIncome(){
        return income;
    }
    
}
