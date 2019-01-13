package controller;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JPanel;

import model.Vocab;

public class ListController implements ActionListener{

	private JPanel card1;
	JPanel test1 = new JPanel();
	JPanel test2 = new JPanel();
	JPanel test3 = new JPanel();
	
	CardLayout test = new CardLayout();
	
	//private CardLayout lay = (CardLayout)(card1.getLayout());
	
	
	public ListController(List<Vocab> vocab, CardLayout lay, JPanel card) {
		this.card1 = card;
		card1.add(test1);
		card1.add(test2);
		card1.add(test3);
		
		card1 = new JPanel(test);
		
		
		this.test = lay;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		card1.setBackground(Color.green);
		test.next(card1);
	}
	
}
