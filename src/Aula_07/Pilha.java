package Aula_07;

import java.util.LinkedList;


	public class Pilha {
		
	    private String livro;
	    private LinkedList<String> titulo;

	    public Pilha(){
	        this.titulo = new LinkedList<>();
	    }
	    
	    public void addLivro(String p){
	        titulo.add(p);
	    }
	    
	    public void removeLivro(String p){
	        titulo.remove(p);
	    }

	    public void pilhaMove(){
	        titulo.pollLast();
	    }

	    public LinkedList<String> getTitulo() {
	        return titulo;
	    }


	    public String toString() {
	        return "Pilha{" +
	                "titulo=" + getTitulo() +
	                '}';
	        
	    }
	    
}
