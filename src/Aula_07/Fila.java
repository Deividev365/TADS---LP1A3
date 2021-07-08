package Aula_07;

import java.util.ArrayList;
import java.util.LinkedList;

public class Fila {
	
	
	private String person;
	private LinkedList<String> per;
	
	
	public Fila() {
		
		
		this.per = new LinkedList<>();
		
		
	}
	
	public void addPerson(String person) {
		per.add(person);
	}
	
	
	public void removePerson(String person) {
		
		per.remove(person);
	}
	
	
	public void moverFila() {
		
		per.pollFirst();
	}
	
	
	public LinkedList<String> getPerson() {
		return per;
	}
	
    
	  public String toString() {
	        return "Fila{" +
	                "pes=" + getPerson() +
	                '}';
	  }	
	
	
}
