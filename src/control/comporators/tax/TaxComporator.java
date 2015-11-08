/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.comporators.tax;

import java.util.Comparator;
import model.entities.Taxable;

/**
 * ensures sorting Taxable operations
 * @author andre
 */
public interface TaxComporator extends Comparator<Taxable>{
    @Override
    public int compare(Taxable t, Taxable t1);
}
