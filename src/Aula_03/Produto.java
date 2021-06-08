package Aula_03;

public class Produto {

	// attributes refered to my class produto 
	
	private int codigo;
	private String descricao;
	private float preco;
	private boolean ativo;
	
	
	// get and setters method //
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	// constructor method // 
	public void produto(int codigo, String descricao, float preco, boolean ativo ) {
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.ativo = ativo;
		
	}
	
	
	
	
}
