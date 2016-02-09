/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import javax.swing.JOptionPane;
/**
 *
 * @author L152Student
 */
public class GUIReader implements MessengerInput{
    private String input;
    
    @Override
    public String inputMessage() {
        return input = JOptionPane.showInputDialog(null, "Please enter your message:");
       
        
    }
}
