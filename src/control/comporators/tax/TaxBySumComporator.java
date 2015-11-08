/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.comporators.tax;

import model.entities.Taxable;

/**
 * standart comporator by sum of Taxes
 * @author andre
 */
public class TaxBySumComporator implements TaxComporator{

    @Override
    public int compare(Taxable t, Taxable t1) {
        return t1.getTaxOnSum()-t.getTaxOnSum();
    }
    
}
