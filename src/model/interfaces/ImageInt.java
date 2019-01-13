package model.interfaces;

import java.awt.Image;

import model.Phrase;
import model.Vocab;

public interface ImageInt {
	
	//gets phrase id
	public abstract String getId();
	//gets vocab for image
	public abstract Vocab getVocab();
	//gets phrase for image
	public abstract Phrase getPhrase();
	//get image
	public abstract Image getImage();
	//sets phrase id
	public abstract void setId(String ID);
	//sets image
	public abstract void setImage(Image img);
	//sets image phrase
	public abstract void setVocab(Vocab eng);
	//sets image phrase
	public abstract void setPhrase(Phrase pRus);
	
	//returns human readable string
	@Override
	public abstract String toString();
}
