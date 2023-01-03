/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        
        Customer customer;
        RegularCustomer regCustomer = new
        RegularCustomer("Nancy", 10000);
        
        SeniorCustomer senCustomer = new
        SeniorCustomer("Jenny", 20000);
        
        customer = regCustomer;
        System.out.println(regCustomer.name + " is a regular customer who has a total bill of " + regCustomer.calculateBill());
        
        customer = senCustomer;
        System.out.println(senCustomer.name + " is a senior customer who has a total bill of " + senCustomer.calculateBill());
    }
    
}
