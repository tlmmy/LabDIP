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
        MessengerOutput output = new GUIOutput();
        MessengerInput input = new ConsoleInput();
        
        MessengerService messenger = new MessengerService(input, output);
        
        messenger.sendMessage();
    }
}
