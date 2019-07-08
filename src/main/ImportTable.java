package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ImportTable {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\peter\\Desktop\\python_webscraping\\x1.txt");
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			
			String st;
			while ((st = br.readLine()) != null) {
				System.out.println(st);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
