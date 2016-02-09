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
    private double baseTipPerBag;
    private int bagCount;

    
    
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags, double baseTipPerBag) {
        this.setServiceQuality(q);
        this.setBagCount(bags);
        this.setBaseTipPerBag(baseTipPerBag);
    }
    
    @Override
     public double calculateTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * 1.2;
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * 1.15;
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * 1.1;
                break;
        }

        return tip;
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

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public void setServiceQuality(ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }
    
    
    
}
