/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author L152Student
 */
public class ConsoleOutput implements MessengerOutput{
    
    @Override
    public void outputMessage(String input) {
        System.out.println(input);
    }
    
}
