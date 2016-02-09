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
public class TipService {
       TipCalculator service;
       public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;

    public TipService(TipCalculator service, ServiceQuality serviceQuality) {
        this.service = service;
        this.serviceQuality = serviceQuality;
    }

    
    
    public double calculateBillWithTip(){
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = service.getBill() * 1.2;
                break;
            case FAIR:
                tip = service.getBill() * 1.15;
                break;
            case POOR:
                tip = service.getBill() * 1.1;
                break;
        }

        return tip;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public void setServiceQuality(ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }
    
    
    
}
