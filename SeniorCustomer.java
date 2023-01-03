/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class SeniorCustomer extends Customer {
    
    double staticDiscount, finalDiscount;
    
    SeniorCustomer (String name, double amount) {
        super(name, amount);
    }
    
    double calculateBill() {
        staticDiscount = amount * 0.20;
        finalDiscount = amount - staticDiscount;
        
        return finalDiscount;
    }
}
