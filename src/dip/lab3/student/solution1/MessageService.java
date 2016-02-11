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
public class MessageService {
    private MessageInput input;
    private MessageOutput output;

    public MessageService(MessageInput input, MessageOutput output) {
        this.input = input;
        this.output = output;
    }

    public MessageInput getInput() {
        return input;
    }

    public void setInput(MessageInput input) {
        this.input = input;
    }

    public MessageOutput getOutput() {
        return output;
    }

    public void setOutput(MessageOutput output) {
        this.output = output;
    }

    
    
    public void sendMessage(){
        String line = input.inputMessage();
            output.outputMessage( line );
    }
}
