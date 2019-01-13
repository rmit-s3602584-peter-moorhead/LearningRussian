package model;

import java.io.Serializable;

import model.interfaces.VocabInt;

@SuppressWarnings("serial")
public class Vocab implements VocabInt, Serializable{

	private String vID;
	private String vEng;
	private String vRus;
	
	public Vocab() {}
	public Vocab(String id, String eng, String rus){
		vID = id;
		vEng = eng;
		vRus = rus;
	}

	@Override
	public String getId() {
		return vID;
	}

	@Override
	public String getEng() {
		return vEng;
	}

	@Override
	public String getRus() {
		return vRus;
	}

	@Override
	public void setId(String ID) {
		this.vID = ID;
	}

	@Override
	public void setEng(String eng) {
		this.vEng = eng;
	}

	@Override
	public void setRus(String rus) {
		this.vRus = rus;
	}
	
	@Override
	public String toString() {
		String str = "ID: " + vID + ", English: " + vEng + ", Russian: " + vRus;
		return str;
	}
	
}
