/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import java.util.Scanner;
/**
 *
 * @author L152Student
 */
public class ConsoleReader implements MessengerInput {
    private String input;
    private Scanner key = new Scanner(System.in);

    

    @Override
    public String inputMessage() {
        System.out.println("Please enter a message:");
        return input = key.nextLine();
        
    }
    
    
}
