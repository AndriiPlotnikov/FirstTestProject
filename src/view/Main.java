/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * 
 * @author andre
 */
public class Main {

    /**
     * starting instructions
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id = 2;
        int year = 1990;
        Displayer display = new Displayer();
        display.start(id, year);
    }
    
}
