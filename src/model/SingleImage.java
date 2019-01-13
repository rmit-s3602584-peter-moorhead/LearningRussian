package model;

import java.awt.Image;

import model.interfaces.ImageInt;

public class SingleImage implements ImageInt{
	
	private String iId;
	private Vocab iVoc;
	private Phrase iPhr;
	private Image iImg;
	
	public SingleImage() {}
	public SingleImage(String id, Vocab voc, Phrase phr, Image img) {
		iId = id;
		iVoc = voc;
		iPhr = phr;
		iImg = img;
	}
	
	
	@Override
	public String getId() {
		return iId;
	}


	@Override
	public void setId(String ID) {
		this.iId = ID;
	}

	@Override
	public void setImage(Image img) {
		this.iImg = img;
	}
	
	@Override
	public Vocab getVocab() {
		return iVoc;
	}
	
	@Override
	public Phrase getPhrase() {
		return iPhr;
	}
	
	@Override
	public void setVocab(Vocab voc) {
		this.iVoc = voc;
	}
	
	@Override
	public void setPhrase(Phrase phr) {
		this.iPhr = phr;
	}
	
	@Override
	public Image getImage() {
		return iImg;
	}

}
