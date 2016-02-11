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
public class MessengerService {
    private MessengerInput input;
    private MessengerOutput output;

    public MessengerService(MessengerInput input, MessengerOutput output) {
        this.input = input;
        this.output = output;
    }
    
    public void sendMessage(){
        String line = input.inputMessage();
            output.outputMessage( line );
    }
}
