package controller;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class TextAreaGreyController implements FocusListener{

	
	JTextField jta1 = new JTextField();
	String string1 = new String();
	
	
	public TextAreaGreyController(JTextField jta, String string) {
		this.jta1 = jta;
		this.string1 = string;
	}


	@Override
	public void focusGained(FocusEvent arg0) {
		jta1.setText("");
		
	}


	@Override
	public void focusLost(FocusEvent arg0) {
		jta1.setText(string1);
		
	}
	


}
