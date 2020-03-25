package it.polito.tdp.spellchecker.model;

import java.io.*;
import java.util.*;

public class Dictionary {
	
	List<RichWord> dizionarioInglese = new LinkedList<RichWord>();
	List<RichWord> dizionarioItaliano = new LinkedList<RichWord>();
	
	public void loadDictionary(String language) {
		
		if (language.compareTo("English")==0) {
			
			try {
				FileReader fr = new FileReader("English.txt");
				BufferedReader br = new BufferedReader(fr);
				String word;
				while ((word = br.readLine()) != null) {
					// Aggiungere parola alla struttura dati
					this.dizionarioInglese.add(new RichWord(word));
				}
				br.close();
				} catch (IOException e){
				System.out.println("Errore nella lettura del file");
				}
			
		}
		
		else
			if (language.compareTo("Italiano")==0) {
				
				try {
					FileReader fr = new FileReader("Italian.txt");
					BufferedReader br = new BufferedReader(fr);
					String word;
					while ((word = br.readLine()) != null) {
						// Aggiungere parola alla struttura dati
						this.dizionarioItaliano.add(new RichWord(word));
					}
					br.close();
					} catch (IOException e){
					System.out.println("Errore nella lettura del file");
					}
				
			}
			else 
				System.out.println("Non è stata selezionata correttamente una lingua!");
		
	}
	
	public List<RichWord> spellCheckText(List<String> inputTextList){
		
		//inputTextList.replaceAll(“[.,\\/#!$%\\^&\\*;:{}=\\-_`~()\\[\\]\as]" "");
		
	//	inputTextList.rep
		List<RichWord> daRitornare = new LinkedList<RichWord>();
		
		
		return daRitornare;
		
	}


	
}
