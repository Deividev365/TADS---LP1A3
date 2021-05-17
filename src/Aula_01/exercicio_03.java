package Aula_01;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		
		float calculoMedia;
		
		Scanner primeiroDado = new Scanner(System.in);
		float nota1;
		System.out.println("Digite a primeira nota: ");
		nota1 = primeiroDado.nextFloat();
		
		
		Scanner segundoDado = new Scanner(System.in);
		float nota2;
		System.out.println("Digite a segunda nota: ");
		nota2 = segundoDado.nextFloat();
		
		
		calculoMedia = (nota1 + nota2) / 2;
		
		
		System.out.println("A media final das notas é: " + calculoMedia);
		
		
		primeiroDado.close();
		segundoDado.close();
		
		

	}

}
