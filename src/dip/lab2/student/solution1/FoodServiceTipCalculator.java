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
public class FoodServiceTipCalculator implements TipService{
    private double bill;

    public FoodServiceTipCalculator(double bill) {
        this.bill = bill;
    }

    
   
    @Override
    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        if(bill < 0) {
            throw new IllegalArgumentException("Error: bill must be greater than or equal to 0.");
        }
        bill = bill;
    }

    
    
    
}
