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
public class FoodServiceTipCalculator implements TipCalculator{
    private double bill;

    @Override
    public double calculateTip() {
       double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill* 1.2;
                break;
            case FAIR:
                tip = bill * 1.15;
                break;
            case POOR:
                tip = bill * 1.1;
                break;
        }

        return tip;
    }
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(double bill, ServiceQuality serviceQuality) {
        this.bill = bill;
        this.serviceQuality = serviceQuality;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        if(bill < 0) {
            throw new IllegalArgumentException("Error: bill must be greater than or equal to 0.");
        }
        bill = bill;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public void setServiceQuality(ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }
    
    
}
