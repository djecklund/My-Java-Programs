/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hierarchyexample;

/**
 *
 * @author Dillon
 */
public class Meat extends Perishables{
    
    public Meat(){
        temp = 0.0;
    }
    
    // Determine the safe temperature to cook the meat at
    public void setTemperatureNeededToCookAt(double t) {
        temp = t;
    }

    public double getTemperatureNeededToCookAt() {
        return temp;
    }
    
}
