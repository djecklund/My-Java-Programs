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

// Products that don't expire
public class NonPerishables extends Product implements Food, Drink{
    
    public int calories, fluidOz;
    public double temp;
    
    public NonPerishables(){
        productName = "";
        productPrice = 0.00;
        quantity = calories = fluidOz = 0;
    }
    
    @Override
    public void setName(String n) {
        productName = n;
    }

    @Override
    public String getName() {
        return productName;
    }

    @Override
    public void setPrice(double p) {
        productPrice = p;
    }

    @Override
    public double getPrice() {
        return productPrice;
    }

    @Override
    public void setQuantity(int q) {
        quantity = q;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setCalories(int c) {
        calories = c;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public void setFluidOz(int f) {
        fluidOz = f;
    }

    @Override
    public int getFluidOz() {
        return fluidOz;
    }

}
