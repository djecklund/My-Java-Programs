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
public class RegCalculator {
    
    private double result;
    
    public RegCalculator(){
        
        result = 0.0;
        
    }
    
    public void calculation(double n1, String op, double n2){
        
        if(op.equals("+")){
            result = n1 + n2;
        }
        else if(op.equals("-")){
            result = n1 - n2;
        }
        else if(op.equals("*")){
            result = n1 * n2;
        }
        else if(op.equals("/")){
            result = n1 / n2;
        }
        
    }
    
    public double getCalculation(){
        
        return result;
        
    }
    
}
