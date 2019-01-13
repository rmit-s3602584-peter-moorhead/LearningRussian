package model;

import java.io.Serializable;

import model.interfaces.PhraseInt;

@SuppressWarnings("serial")
public class Phrase implements PhraseInt, Serializable{
	
	private String pID;
	private String pEng;
	private String pRus;
	
	public Phrase() {}
	public Phrase(String id, String eng, String rus){
		pID = id;
		pEng = eng;
		pRus = rus;
	}

	@Override
	public String getId() {
		return pID;
	}

	@Override
	public String getEng() {
		return pEng;
	}

	@Override
	public String getRus() {
		return pRus;
	}

	@Override
	public void setId(String ID) {
		this.pID = ID;
	}

	@Override
	public void setEng(String eng) {
		this.pEng = eng;
	}

	@Override
	public void setRus(String rus) {
		this.pRus = rus;
	}
	
	@Override
	public String toString() {
		String str = "ID: " + pID + ", English: " + pEng + ", Russian: " + pRus;
		return str;
	}
	
}
