package model;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Model implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Vocab> vocabList = new ArrayList<Vocab>();
	private List<Phrase> phraseList = new ArrayList<Phrase>();
	
	public void addVocab(String id, String eng, String rus){
		Vocab v = new Vocab(id, eng, rus);
		vocabList.add(v);
		//vocabList.get(vocabList.size() - 1)
	}
	
	/*initial test 
	public void start() {
		Vocab newV = new Vocab("1", "", "кгыышфт");
		//vocabList.add(newV);
		//System.out.println(newV.getEng());
		
	}*/
	
	public void printLists(List<Vocab> vL){
		//System.out.println(vocabList);
		System.out.println(vL);
		
		System.out.println(phraseList);
		
		
	}
	
	public void addPhrase(String id, String eng, String rus){
		Phrase p = new Phrase(id, eng, rus);
		phraseList.add(p);
	}
	
	public void loadVocabList(List<Vocab> vL) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		File file = new File("vocab.dat");
		try{
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			while(true){
				Object obj = ois.readObject();
				Vocab v = (Vocab)obj;
				vL.add(v);
				//System.out.println(v);
			}
		}
		catch(EOFException eof){
			System.out.println(eof.getMessage());
	       }
	      catch(Exception e){
	        System.out.println(e.getMessage());
	      }
	      finally{
	        try{
	          fis.close();
	          ois.close();
	        }
	        catch(Exception e){
	           System.out.println(e.getMessage());
	        }
	      }
	}
	
	public void loadPhraseList() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		File file = new File("phrase.dat");
		try{
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			while(true){
				Object obj = ois.readObject();
				Phrase p = (Phrase)obj;
				phraseList.add(p);
			}
		}
		catch(EOFException eof){
			System.out.println(eof.getMessage());
	       }
	      catch(Exception e){
	        System.out.println(e.getMessage());
	      }
	      finally{
	        try{
	          fis.close();
	          ois.close();
	        }
	        catch(Exception e){
	           System.out.println(e.getMessage());
	        }
	      }
	}
	
	
	public void saveVocabList(List<Vocab> vL) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		File file = new File("vocab.dat");
		try{
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
				for(Vocab v: vL){
					oos.writeObject(v);
				}
			fos.close();
			oos.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public void savePhraseList() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		File file = new File("phrase.dat");
		try{
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
				for(Phrase p: phraseList){
					oos.writeObject(p);
				}
			fos.close();
			oos.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
