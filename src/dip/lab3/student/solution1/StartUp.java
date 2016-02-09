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
public class StartUp {
    public static void main(String[] args) {
        MessengerOutput output = new ConsoleWriter();
        MessengerInput input = new GUIReader();
        
        Messenger messenger = new Messenger(input, output);
        
        messenger.sendMessage();
    }
}
