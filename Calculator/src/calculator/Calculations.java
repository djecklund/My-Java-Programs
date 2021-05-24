/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author dillo
 */
public class Calculations {
    
    public double calculate(double num1, String operator, double num2){
        
        switch(operator){
            case "/":
                return num1 / num2;
            case "X":
                return num1 * num2;
            case "-":
                return num1 - num2;
            case "+":
                return num1 + num2;
            default:
                break;
        }
        return 0;
    }
    
}
