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
public abstract class Product {
    
    public String productName;
    public double productPrice;
    public int quantity;
    
    // Setting up product names
    public abstract void setName(String n);
    public abstract String getName();
    
    // Set up the price of the product
    public abstract void setPrice(double p);
    public abstract double getPrice();
    
    // Determine how many of each product is sold
    public abstract void setQuantity(int q);
    public abstract int getQuantity();
    
}
