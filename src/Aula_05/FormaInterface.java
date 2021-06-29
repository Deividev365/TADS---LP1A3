package Aula_05;
import java.util.Scanner;

public interface FormaInterface {
	
	public String getCor(String dadosCor);
	
	
	public static void main(String[] args) {
		
		Scanner dadosUsuario = new Scanner(System.in);

		System.out.println("Digite a cor: ");
		String dadosCor = dadosUsuario.next();
		
		
		System.out.println("Output cor: " + dadosCor);
		
		
		
		
		
		
	}

	
}
