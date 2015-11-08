/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.initializer;

import java.util.ArrayList;
import java.util.List;
import model.entities.Person;
import model.entities.MainTax;
import model.entities.SideTax;
import model.entities.Taxable;
import model.util.Calculator;

/**
 * talker between view and database
 * @author andre
 */
public class Initializer {
    List<Person> taxPayers = new ArrayList<>();
     
    private Initializer() {
        introduceHipster();
        introduceMayhem();
        introduceSomeDude();
    }


    /**
     * standart object static factory
     * @return Initializer object
     */
    public static Initializer createStandartInit() {
        return new Initializer();
    }

    /**
     * find all payed by person(found by id) 
     * and find every tax he payed in a given year
     * @param id of person
     * @param year of payment
     * @return List of payed taxes
     */
    public List<Taxable> findTaxes(int id, int year) {
        List<Taxable> found = new ArrayList<>();
        Person payer = taxPayers.get(id);
        for (Taxable tax : payer.getPayed()){
            if(tax.getYearOfPayment() == year){
                found.add(tax);
            }
        }
        return found;
    }

    /**
     * some hipster person
     */
    private void introduceHipster() {
        Person hipster = new Person("Sam");
        MainTax tax = new MainTax("child Help", 0, -1000, 1994);
        hipster.pay(tax);
        tax = new MainTax("car payment", 2000, 200, 1994);
        hipster.pay(tax);
        tax = new MainTax("Popcorn", 200, 10, 1993);
        hipster.pay(tax);
        SideTax sidetax = new SideTax("weakend", 4000, 1994);
        hipster.pay(sidetax);
        taxPayers.add(hipster);
    }
    
    
    /**
     * some mayhem person
     */
    private void introduceMayhem() {
        Person mayhem = new Person("Clown");
        MainTax tax = new MainTax("Forking", 1000, 0, 1994);
        mayhem.pay(tax);
        tax = new MainTax("cabel TV", 2134, 412, 1994);
        mayhem.pay(tax);
        tax = new MainTax("Popcorn", 200, 10, 1994);
        mayhem.pay(tax);
        SideTax sidetax = new SideTax("weakend", 3000, 1994);
        mayhem.pay(sidetax);
        taxPayers.add(mayhem);
    }

    /**
     * some dude :(
     */
    private void introduceSomeDude() {
        Person someDude = new Person("Egoist");
        MainTax tax = new MainTax("Job", -1000, 1000, 1990);
        someDude.pay(tax);
        tax = new MainTax("Amsterdam", 2134, 412, 1990);
        someDude.pay(tax);
        tax = new MainTax("Local", 200, 10, 1990);
        someDude.pay(tax);
        SideTax sidetax = new SideTax("weakend", 4000, 1990);
        someDude.pay(sidetax);
        taxPayers.add(someDude);
    }


    /**
     * asks calculator to count sum
     * @param payedTaxes - list of taxable operations
     * @return sum of payed taxes
     */
    public int countSum(List<Taxable> payedTaxes) {
        return Calculator.countSum(payedTaxes);
    }
    
}
