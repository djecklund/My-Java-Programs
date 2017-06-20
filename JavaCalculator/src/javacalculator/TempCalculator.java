/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalculator;

/**
 *
 * @author Dillon
 */
public class TempCalculator {
    
    private double temp;
    
    public TempCalculator(){
        
        temp = 0.0;
        
    }
    
    public void convertTemp(String from, String to, double temperature){
        
        if(from.equals("Fahrenheit") && to.equals("Fahrenheit")){
            temp = temperature;
        }
        else if(from.equals("Fahrenheit") && to.equals("Celsius")){
            temp = (temperature - 32) * 5.0/9.0;
        }
        else if(from.equals("Fahrenheit") && to.equals("Kelvin")){
            temp = (temperature + 459.67) * 5.0/9.0;
        }
        else if(from.equals("Celsius") && to.equals("Fahrenheit")){
            temp = temperature * 9.0/5.0 + 32;
        }
        else if(from.equals("Celsius") && to.equals("Celsius")){
            temp = temperature;
        }
        else if(from.equals("Celsius") && to.equals("Kelvin")){
            temp = temperature + 273.15;
        }
        else if(from.equals("Kelvin") && to.equals("Fahrenheit")){
            temp = temperature * 9.0/5.0 - 459.67;
        }
        else if(from.equals("Kelvin") && to.equals("Celsius")){
            temp = temperature - 273.15;
        }
        else if(from.equals("Kelvin") && to.equals("Kelvin")){
            temp = temperature;
        }
        
    }
    
    // Returns the temp value after one of the above calculations are done to it.
    public double getTempConversion(){
        return temp;
    }
    
}
