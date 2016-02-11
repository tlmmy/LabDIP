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
       
    

    public TipService(TipCalculator service) {
        this.service = service;
        
    }

    
    
    public double getTip(){
        return service.getTip();
    }

    public TipCalculator getService() {
        return service;
    }

    public void setService(TipCalculator service) {
        this.service = service;
    }

   
    
    
    
}
