/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

/**
 * model of payed MainTax
 * @author andre
 */
public class MainTax implements Comparable<MainTax>, Taxable{
    final private String name; // reason for payment
    final private int sum; // how much
    final private int taxOnSum; // part that was taken
    final private int year; // of payment

    public MainTax(String name, int sum, int taxOnSum, int year) {
        this.name = name;
        this.sum = sum;
        this.taxOnSum = taxOnSum;
        this.year = year;
    }

  
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getSum() {
        return sum;
    }

    /**
     * calculates sum of payed tax
     * @return tax entered as specified value
     */
    @Override
    public int getTaxOnSum() {
        return taxOnSum;
    }

    @Override
    public int getYearOfPayment() {
        return year;
    }

    @Override
    public int compareTo(MainTax t) {
        return this.taxOnSum - t.taxOnSum;
    }
    
}
