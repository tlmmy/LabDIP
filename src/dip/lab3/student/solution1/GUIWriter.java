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
public class GUIWriter implements MessengerOutput{
    @Override
    public void outputMessage( String line ) {
            JOptionPane.showMessageDialog(null, line);
	}
}
