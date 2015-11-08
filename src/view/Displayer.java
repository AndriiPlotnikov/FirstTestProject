/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.initializer.Initializer;
import control.comporators.tax.TaxBySumComporator;
import java.util.List;
import model.entities.MainTax;
import model.entities.Taxable;
import model.util.Calculator;

/**
 * main view, shows all payed taxes, applicable for filters
 * @author andre
 */
public class Displayer {

    /**
     * entry point
     * @param id - search value by number of entry
     * @param year - year of tax payment
     */
    public void start(int id, int year) {
        Initializer init = Initializer.createStandartInit();
        try{
            List<Taxable> payedTaxes = init.findTaxes(id, year);
            payedTaxes.sort(new TaxBySumComporator());
            for(Taxable tax : payedTaxes){
                System.out.println(tax.getName() + " entry: " + tax.getSum()+ " ; tax: " + tax.getTaxOnSum() + " ; year: " + tax.getYearOfPayment()); 
            }
            System.out.println("sum is : " + init.countSum(payedTaxes));
        } catch (IndexOutOfBoundsException iobe){
            System.out.println("No such index");
            //System.out.println(iobe);
        }
    }
    
}
