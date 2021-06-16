package Aula_04;

public class Cliente extends Conta {
	
	
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	
	
	public String getTitular() {
		
		return( " Nome: "  + this.nome + " cpf: " + this.cpf + " Endereço: " + this.endereco + " E-mail: " + this.email);
				
	}
	
	
	public void setTitular(String nome, String cpf, String endereco, String email) {
		
		
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
	}
	
	
	
	
	
	

}
