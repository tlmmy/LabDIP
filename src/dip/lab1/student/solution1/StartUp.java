/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

import dip.lab1.instructor.solution1.HourlyPlusIncentiveEmployee;

/**
 *
 * @author L152Student
 */
public class StartUp {
    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployeeWithBonus(10, 2220, 500);
        Employee emp2 = new SalariedEmployee(48000, 2250);
        Employee emp3 = new SalariedEmployee(90000,0);
        
        Employee[] employees = {emp1, emp2, emp3};
        
        HRService hr = new HRService();
        
        for(int i=0; i < employees.length; i++) {
            System.out.println("Employee " + (i+1) + " compensation:" +
            hr.getAnnualCompensationForEmployee(employees[i]));
        }
    }
}
