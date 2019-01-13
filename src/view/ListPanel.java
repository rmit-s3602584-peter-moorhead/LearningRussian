package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import controller.AddVocabController;
import controller.DeleteVocabController;
import controller.TextAreaGreyController;
import model.Vocab;

@SuppressWarnings("serial")
public class ListPanel extends JPanel{
	
	ArrayList<Vocab> vocab1 = new ArrayList<Vocab>();
	JTable table;
	JScrollPane scroll;
	
	String engS = new String("English...");
	String rusS = new String("Russian...");
	String idS = new String("ID...");
	
	String engT = new String();
	String rusT = new String();
	String idT = new String();
	
	
	Color g = new Color(44, 47, 51);
	Color bl = new Color(35, 39, 42);
	Color lg = new Color(153,170,181);
	
	
	JLabel filler = new JLabel();
	JLabel filler1 = new JLabel();
	JTextField id = new JTextField(5);
	JTextField english = new JTextField(10);
	JTextField russian = new JTextField(10);
	
	JTextField idD = new JTextField(5);
	JButton delete = new JButton("Delete");
	
	JButton add = new JButton("Add");
	
	BorderLayout border = new BorderLayout();
	GridLayout grid = new GridLayout(2, 4);
	JPanel south = new JPanel(grid);
	JPanel center = new JPanel();
	
	TextAreaGreyController tAGC = new TextAreaGreyController(id, idS);
	
	
	public ListPanel(ArrayList<Vocab> vocab) {
		this.vocab1 = vocab;
		this.setBackground(Color.green);
		this.setLayout(border);
		
		
		id.setText(idS);
		english.setText(engS);
		russian.setText(rusS);
		
		
		add(south, BorderLayout.SOUTH);
		add(center, BorderLayout.CENTER);
		center.setBackground(g);
		
		String[] columnNames = {"ID", "English", "Russian"};
		
		
		DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
		JTable table1 = new JTable(tableModel);
		
		
		table1.setFont(new Font("Tahoma", Font.BOLD, 18));
		table1.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 18));
		table1.setRowHeight(25);
		
		
		TableColumnModel columnModel = table1.getColumnModel();
		
		columnModel.getColumn(0).setPreferredWidth(400);
		columnModel.getColumn(1).setPreferredWidth(400);
		columnModel.getColumn(2).setPreferredWidth(400);
		
		//not allow user to edit table
		table1.setEnabled(false);
		table1.getTableHeader().setReorderingAllowed(false);
		
		table1.setBackground(bl);
		table1.setForeground(lg);
		
		
		
		//fill table with vocab data
		for(int i = 0; i<vocab1.size(); i++) {
			String english = vocab1.get(i).getEng();
			String russian = vocab1.get(i).getRus();
			String id = vocab1.get(i).getId();
			
			String[] data1 = {id, english, russian};
			
			tableModel.addRow(data1);
		}

		scroll = new JScrollPane(table1);

		scroll.setPreferredSize(new Dimension(800, 620));
		
		
		scroll.setBackground(bl);
		scroll.setForeground(bl);
		
		
		center.add(scroll);
		
		id.addFocusListener(new FocusListener(){

			@Override
			public void focusGained(FocusEvent e) {
				if(id.getText().equals("ID...")) {
					id.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(id.getText().equals("")) {
					id.setText("ID...");
				}
			}
			
		});
		
		english.addFocusListener(new FocusListener(){

			@Override
			public void focusGained(FocusEvent e) {
				if(english.getText().equals("English...")) {
					english.setText("");
				}
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(english.getText().equals("")) {
					english.setText("English...");
				}
			}
			
		});
		
		russian.addFocusListener(new FocusListener(){

			@Override
			public void focusGained(FocusEvent e) {
				if(russian.getText().equals("Russian...")) {
					russian.setText("");
				}
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(russian.getText().equals("")) {
					russian.setText("Russian...");
				}
				
			}
			
		});
		
		
		south.add(id);
		south.add(english);
		south.add(russian);
		south.add(add);
		south.add(filler);
		south.add(filler1);
		south.add(idD);
		south.add(delete);
		
		idT = id.getText();
		engT = english.getText();
		rusT = russian.getText();
		System.out.println(idT);
		
		delete.addActionListener(new DeleteVocabController(vocab1, idD));
		add.addActionListener(new AddVocabController(vocab1, id, english, russian));
		
		
		
	}
	
}
