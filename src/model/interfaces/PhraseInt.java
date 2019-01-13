package model.interfaces;

public interface PhraseInt {
	
	//gets phrase id
	public abstract String getId();
	//gets phrase in english
	public abstract String getEng();
	//gets phrase in russian
	public abstract String getRus();
	//sets phrase id
	public abstract void setId(String ID);
	//sets english phrase
	public abstract void setEng(String eng);
	//sets russian phrase
	public abstract void setRus(String rus);
	
	//returns human readable string
	@Override
	public abstract String toString();
	
}
