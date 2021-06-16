package Aula_04;
import java.util.Scanner;

public class Ex2_Cliente {
	
	Scanner dadosUsuario = new Scanner(System.in);

	
	private int codigo;
	private String endereco;
	private String telefone;
	
	
	public int getCodigo() {
		
		return codigo;
		
	}
	
	public void setCodigo(int codigo) {
		
		this.codigo = codigo;
		
	}
	
	public String getEndereco() {
		
		return endereco;
		
	}
	
	public void setEndereco(String endereco) {
		
		this.endereco = endereco;
		
	}
	
	public String getTelefone() {
		
		return telefone;
		
	}
	
	public void setTelefone(String telefone) {
		
		this.telefone = telefone;
		
	}
	
	
	
	public void setMenu() {
		
		System.out.println("Voltando para o menu...");

		System.out.println("Digite 1 -> para Inserir Cliente\n\n Digite 2 -> para remover cliente\n\n 3 -> consultar todos clientes");
		
		int setMenu = dadosUsuario.nextInt();
	}
	
	

}
