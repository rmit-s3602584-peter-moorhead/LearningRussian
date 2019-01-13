package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.Vocab;

@SuppressWarnings("serial")
public class LearnPanel extends JPanel {

	private ArrayList<Vocab> vocab1 = new ArrayList<Vocab>();
	
	private JLabel titleL = new JLabel("learning");
	
	private JButton alphaB = new JButton("Alphabet");
	private JButton pronounB = new JButton("Pronouns");
	private JButton directionsB = new JButton("Directions/Places");
	private JButton numbersB = new JButton("Mathematics");
	private JButton greetingsB = new JButton("Greetings");
	private JButton timeB = new JButton("Time");
	
	private GridLayout grid = new GridLayout(3, 2, 10, 20);
	private JPanel content = new JPanel();
	
	JScrollPane scroll;
	
	public LearnPanel(ArrayList<Vocab> vocab) {		
		
		this.add(titleL, BorderLayout.NORTH);
		
		scroll = new JScrollPane(content);
		scroll.setMinimumSize(new Dimension(400, 400));
		
		content.setLayout(grid);
		
		this.vocab1 = vocab;
		
		//this.setLayout(grid);
		
		content.add(alphaB);
		content.add(pronounB);
		content.add(directionsB);
		content.add(numbersB);
		content.add(greetingsB);
		content.add(timeB);
		
		this.add(content, BorderLayout.CENTER);
		
		
	}
	
	
	
}
