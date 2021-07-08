package Aula_07;

import java.util.TreeSet;

public class Conjunto {
	
	 	private String nome;
	    private TreeSet<String> produto;

	    public Conjunto(){
	    	
	        this.produto = new TreeSet<>();
	    
	    }
	    
	    public void addConjunto(String p){
	    	
	        produto.add(p);
	        
	    }

	    public TreeSet<String> getUniao(TreeSet<String > p){
	    	
	        produto.addAll(p);
	        return produto;
	        
	    }

	    public TreeSet<String> getInterseccao(TreeSet<String> p){
	    	
	        produto.retainAll(p);
	        return produto;
	        
	    }
	    
	    public TreeSet<String> getDiferenca(TreeSet<String> p){
	    	
	        produto.removeAll(p);
	        return produto;
	        
	    }
	    
	    
	    public boolean getSubconjunto(TreeSet<String>p){
	        // condição se tem tudo // 
	    	if (produto.containsAll(p)){
	            return true;
	            
	        }
	    	
	    	return false;
	    }
	    public TreeSet<String> getProduto() {
	        return produto;
	    }

	
	    public String toString() {
	        return "Conjunto{" +
	                "produto=" + getProduto() +
	                '}';
	    }
}
