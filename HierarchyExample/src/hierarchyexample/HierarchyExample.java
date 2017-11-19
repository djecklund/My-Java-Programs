/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hierarchyexample;

import java.util.ArrayList;

/**
 *
 * @author Dillon
 */
public class HierarchyExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Perishables> perishables = new ArrayList<>();
        ArrayList<Meat> steaks = new ArrayList<>();
        ArrayList<NonPerishables> nonPerishables = new ArrayList<>();
        
        // Create a steak
        Meat steak = new Meat();
        steak.setName("Ribeye");
        steak.setExpirationDate("1/27/2018");
        steak.setPrice(12.88);
        steak.setQuantity(2);
        steak.setCalories(800);
        steak.setTemperatureNeededToCookAt(200);
        steaks.add(steak);
        
        // Display the details of the steak
        System.out.println(steaks.get(0).getName() + "\n"
        + steaks.get(0).getExpirationDate() + "\n"
        + steaks.get(0).getPrice() + "\n" 
        + steaks.get(0).getQuantity() + "\n"
        + steaks.get(0).getCalories() + "\n"
        + steaks.get(0).getTemperatureNeededToCookAt());
        
        System.out.println();
        System.out.println();
        
        // Create a Salad
        Perishables salad = new Perishables();
        salad.setName("Salad");
        salad.setExpirationDate("12/24/2017");
        salad.setPrice(2.00);
        salad.setCalories(0);
        salad.setQuantity(1);
        perishables.add(salad);
        
        // Display the details of the salad
        System.out.println(perishables.get(0).getName() + "\n"
        + perishables.get(0).getExpirationDate() + "\n"
        + perishables.get(0).getPrice() + "\n" 
        + perishables.get(0).getQuantity() + "\n"
        + perishables.get(0).getCalories());
        
        System.out.println();
        System.out.println();
        
        // Create a bottle of water
        NonPerishables water = new NonPerishables();
        water.setName("Aquafina");
        water.setFluidOz(16);
        water.setPrice(1.00);
        water.setQuantity(1);
        water.setCalories(0);
        nonPerishables.add(water);
        
        // Display the details about the water
        System.out.println(nonPerishables.get(0).getName() + "\n"
        + nonPerishables.get(0).getFluidOz() + "\n"
        + nonPerishables.get(0).getPrice() + "\n" 
        + nonPerishables.get(0).getQuantity() + "\n"
        + nonPerishables.get(0).getCalories() + "\n");        
    }
    
}
