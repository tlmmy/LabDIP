/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author L152Student
 */
public class BaggageServiceTipCalculator implements TipService{
    private double baseTipPerBag;
    private int bagCount;
    private double bill;

    public BaggageServiceTipCalculator(double baseTipPerBag, int bagCount) {
        this.baseTipPerBag = baseTipPerBag;
        this.bagCount = bagCount;
    }

    
    
    
    @Override
    public double getBill(){
        return bill = baseTipPerBag * bagCount;
    }
     

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag <= 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }


    
    
}
