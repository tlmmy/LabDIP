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
public class BaggageServiceTipCalculator implements TipCalculator{
   private double minBILL = 0.00;
    private double maxBILL = 100.00;
    private String billENTRY_ERR =
            "Error: bill must be between " + minBILL + " and "
            + maxBILL;
    private double goodRATE = 0.20;
    private double fairRATE = 0.15;
    private double poorRATE = 0.10;

    private double baseTipPerBag;
    private int bagCount;
    
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }
    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + goodRATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRATE);
                break;
        }

        return tip;
    }

    public double getGoodRATE() {
        return goodRATE;
    }

    public void setGoodRATE(double goodRATE) {
        this.goodRATE = goodRATE;
    }

    public double getFairRATE() {
        return fairRATE;
    }

    public void setFairRATE(double fairRATE) {
        this.fairRATE = fairRATE;
    }

    public double getPoorRATE() {
        return poorRATE;
    }

    public void setPoorRATE(double poorRATE) {
        this.poorRATE = poorRATE;
    }
    
    
    
    @Override
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }


    
    
}
