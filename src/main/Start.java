package main;

import java.util.ArrayList;

import model.Model;
import model.Vocab;
import view.RusGUI;

public class Start {
	

	public static void main(String args[] ) {
		
		
		final ArrayList<Vocab> v = new ArrayList<Vocab>();
		
		/*Vocab v1 = new Vocab("1", "Eng1", "фцуа");
		Vocab v2 = new Vocab("2", "Eng2", "ветртр");
		Vocab v3 = new Vocab("3", "Eng3", "унео");
		Vocab v4 = new Vocab("4", "Eng4", "ьгееее");
		Vocab v5 = new Vocab("5", "Eng5", "дльльдлть");

		v.add(v1);
		v.add(v2);
		v.add(v3);
		v.add(v4);
		v.add(v5);*/
		
		Model m = new Model();
		//m.start();
		//m.saveVocabList(v);
		m.loadVocabList(v);
		
		RusGUI g = new RusGUI(v, m);
		
		g.run();		
		
	}
}