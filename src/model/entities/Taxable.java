/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

/**
 * operations that can pay tax
 * @author andre
 */
public interface Taxable {
    /**
     * name of operation 
     * @return name
     */
    public String getName();
    /**
     * tax payed from sum
     * @return tax
     */
    public int getTaxOnSum();
    /**
     * sum in operation
     * @return sum
     */
    public int getSum();
    /**
     * year of payment
     * @return year
     */
    public int getYearOfPayment();
}
