/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecklundcorp.mortgagecalculator;

/**
 *
 * @author Dillon
 */
public class Calculations {
    
    public boolean determineIfNumber(String housePrice, String interest, String lifeOfLoan, String utilities, String taxes, String insurance, String HOA, String person1, String person2, String extraIncome){
        
        try{
            double hp = Double.parseDouble(housePrice);
            double in = Double.parseDouble(interest);
            double lol = Double.parseDouble(lifeOfLoan);
            double util = Double.parseDouble(utilities);
            double tax = Double.parseDouble(taxes);
            double insu = Double.parseDouble(insurance);
            double ha = Double.parseDouble(HOA);
            double p1 = Double.parseDouble(person1);
            double p2 = Double.parseDouble(person2);
            double e1 = Double.parseDouble(extraIncome);
        }catch(Exception e){
            return false;
        }
        
        if(lifeOfLoan.equals("0")){
            return false;
        }
        
        return true;
    }
    
    public double getDownPayment(String housePrice){
        
        double downPayment = 0.00;
        
        try{
            
            downPayment = 0.2 * Double.parseDouble(housePrice);
            
        }catch(Exception e){
            return 0.00;
        }
        
        return downPayment;
    }
    
    public double getLoanAmount(String housePrice, double downPayment){
        
        double loanPayment = 0.00;
        
        loanPayment = Double.parseDouble(housePrice) - downPayment;
        
        return loanPayment;
        
    }
    
    public double getPaymentPerPeriod(int numYears, int numMonths, double percent, double loanAmt){
        
        double paymentPerPeriod = 0.00;
        
        int amtMonths = numYears * numMonths;
        double percentInterestPerMonth = (percent / 100) / 12;
        double d = ((Math.pow((1 + percentInterestPerMonth), amtMonths)) - 1) / (percentInterestPerMonth * (Math.pow(1 + (percentInterestPerMonth), amtMonths)));
        
        paymentPerPeriod = loanAmt / d ;
        
        return paymentPerPeriod;
    }
    
    public double getSumOfPayments(double pymtPerPeriod, int numYears, int numPaymentPerYear){
        
        double sumPayment = 0.00;
        
        sumPayment = pymtPerPeriod * numYears * numPaymentPerYear;
        
        return sumPayment;
    }
    
    public double getInterestCost(double sumPayments, double loanAmt){
        return sumPayments - loanAmt;
    }
    
    public double getTotalMonthlyMortgage(double paymentPerPeriod, double insurance, double tax, double HOA){
        
        double total = paymentPerPeriod + (insurance / 12) + (tax / 12) + HOA;
        
        return total;
    }
    
    public double getGrossIncome(double p1, double p2, double e1){
        return p1 + p2 + e1;
    }
    
    public double getTotalNetIncome(double gross){
        return gross * 0.69;
    }
    
}
