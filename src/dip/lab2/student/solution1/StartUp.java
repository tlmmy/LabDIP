/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;



/**
 *
 * @author L152Student
 */
public class StartUp {
      public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
 
    public static void main(String[] args) {
        TipCalculator tip = new BaggageServiceTipCalculator(2, 2);
        TipService calc = new TipService(tip, TipService.ServiceQuality.FAIR);
        
        System.out.println(calc.calculateBillWithTip());
    }
}
