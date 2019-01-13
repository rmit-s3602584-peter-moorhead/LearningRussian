package model.interfaces;

public interface VocabInt {
	
	//gets word id
	public abstract String getId();
	//gets word in english
	public abstract String getEng();
	//gets word in russian
	public abstract String getRus();
	//sets word id
	public abstract void setId(String ID);
	//sets english word
	public abstract void setEng(String eng);
	//sets russian word
	public abstract void setRus(String rus);
	
	//returns human readable string
	@Override
	public abstract String toString();
}
