/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

/**
 * any side operations that can be Taxed
 * @author andre
 */
public class SideTax implements Taxable {
    private final String name;
    private final int sum;
    private final int year;
    private double taxPart = .20; // part to be paid on tax
    

    public SideTax(String name, int sum, int year) {
        this.name = name;
        this.sum = sum;
        this.year = year;
    }
    
    public SideTax(String name, int sum, int year, double taxPart) {
        this.name = name;
        this.sum = sum;
        this.year = year;
        this.taxPart = taxPart;
    }

    /**
     * calculates sum of taxes
     * @return payed taxes, calculated as part of payed in operation
     */
    @Override
    public int getTaxOnSum() {
        return (int)(sum * taxPart);
    }

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYearOfPayment() {
        return year;
    }
    
}
