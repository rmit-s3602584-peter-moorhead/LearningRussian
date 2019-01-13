package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import model.Vocab;

public class AddVocabController implements ActionListener{

	ArrayList<Vocab> v1 = new ArrayList<Vocab>();
	private JTextField id1 = new JTextField(5);
	private JTextField eng1 = new JTextField(10);
	private JTextField rus1 = new JTextField(10);
		
	
	public AddVocabController(ArrayList<Vocab> v, JTextField id, JTextField eng, JTextField rus) {
		this.v1 = v;
		this.id1 = id;
		this.eng1 = eng;
		this.rus1 = rus;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println(id1.getText() + " " + eng1.getText() + " " + rus1.getText());
		Vocab vocab = new Vocab(id1.getText(), eng1.getText(), rus1.getText());
		v1.add(vocab);
		id1.setText("");
		eng1.setText("");
		rus1.setText("");
		
	}
	
}
