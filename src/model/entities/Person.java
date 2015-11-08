/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * tax payer
 * @author andre
 */
public class Person {
    final private String name; // this persons name
    final private List<Taxable> payed; // everything this person payed

    public Person(String name) {
        this.name = name;
        this.payed = new ArrayList<>();
    }
    
    public Person(String name, List<Taxable> payed) {
        this.name = name;
        this.payed = payed;
    }

    public String getName() {
        return name;
    }

    /**
     * all paid operations
     * @return list of Taxable operations
     */
    public List<Taxable> getPayed() {
        return payed;
    }

    /**
     * add to list of payed Taxable operations
     * @param tax - Taxable operation
     */
    public void pay(Taxable tax) {
        payed.add(tax);
    }    
}
