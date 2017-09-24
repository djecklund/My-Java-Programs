/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vabenefits;


/**
 *
 * @author Dillon
 */
public class Calculations {
    
    public double CalculateDisability(boolean add, boolean subtract, double current, double change){
                    
            double currentPercent = current;
            double changePercent = change;
            double tempPercent = 0.00;
            
            if(add == true && currentPercent > 0 && currentPercent <= 100){
                    
                tempPercent = currentPercent / 100;
                currentPercent = (tempPercent + ((changePercent / 100) * tempPercent)) * 100;

            }
            else if(subtract == true && currentPercent > 0){

                tempPercent = currentPercent / 100;
                currentPercent = (tempPercent - ((changePercent / 100) * tempPercent)) * 100;

            }
            
            
            if(currentPercent > 100){
                return 100;
            }
            else if(currentPercent < 0){
                return 0;
            }
            else{
                return currentPercent;
            }
            
        
    }
}
