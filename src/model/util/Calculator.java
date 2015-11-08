/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import java.util.List;
import model.entities.Taxable;

/**
 * for calculations
 *
 * @author andre
 */
final public class Calculator {

    /**
     * disable instance creation
     */
    private Calculator() {
        throw new UnsupportedOperationException("can't create instance of the class");
    }

    /**
     * count sum of given list of operations
     *
     * @param operations - list of taxable operation
     * @return sum of payed taxes
     */
    final public static int countSum(List<Taxable> operations) {
        int sum = 0;
        for (Taxable operation : operations) {
            sum += operation.getTaxOnSum();
        }
        return sum;
    }
}
