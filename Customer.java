/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public abstract class Customer {
    
    protected String name;
    protected double amount;
    
    public Customer (String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    abstract double calculateBill();
}
