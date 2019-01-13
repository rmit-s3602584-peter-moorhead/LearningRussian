package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import model.Vocab;

public class DeleteVocabController implements ActionListener {

	private ArrayList<Vocab> vocab1 = new ArrayList<Vocab>();
	private JTextField idD = new JTextField(5);
	private int idN = 0;
	
	public DeleteVocabController(ArrayList<Vocab> vocab, JTextField id) {
		this.vocab1 = vocab;
		this.idD = id;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//convert idD to idN then use to remove vocab from list
		idN = Integer.parseInt(idD.getText());
		System.out.println(idN);
		//-1 for array offset
		vocab1.remove(idN-1);
		idD.setText("");
		
	}

}
