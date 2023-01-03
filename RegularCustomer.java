/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class RegularCustomer extends Customer {
    
    RegularCustomer (String name, double amount) {
        super(name, amount);
    }
    
    @Override
    double calculateBill() {
        return amount;
    }
}
