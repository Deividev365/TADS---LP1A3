package Aula_05;
import java.util.Scanner;

public class Exercicio_2_Main {

	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo();
		Circulo circulo = new Circulo();
		
		
		
		
		Scanner dadosUsuario = new Scanner(System.in);

		
		
		System.out.println("Digite 1 - Calcular �rea Triangulo, Digite 2 - Calcular �rea Circulo");
		int setMenu = dadosUsuario.nextInt();
		
		
		do {
			
			switch(setMenu) {
			
			
			
			case 1: 
				System.out.println("Insira o valor da BASE do Triangulo");
				double dadosBaseUsuario = dadosUsuario.nextDouble();
				
				System.out.println("Insira o valor da ALTURA do Triangulo");
				double dadosAlturaUsuario = dadosUsuario.nextDouble();
				
				System.out.println("Insira a COR do Triangulo");
				String dadosCorTrianguloUsuario = dadosUsuario.next();
				
				
				triangulo.setCorTriangulo(dadosCorTrianguloUsuario);
				
				double calcAreaTriangulo = triangulo.setCalcTriangulo(dadosBaseUsuario, dadosAlturaUsuario);
				
				
				
				System.out.println("A cor do triangulo � : " + triangulo.getCorTriangulo() + "Resultado C�lculo: " + calcAreaTriangulo);
				
	
				
				return;
				
				
			case 2: 
				System.out.println("Insira o valor do RAIO do Circulo");
				double dadosCirculoUsuario = dadosUsuario.nextDouble();
				
				System.out.println("Insira a COR do Circulo");
				String dadosCorCirculoUsuario = dadosUsuario.next();
				
				circulo.setCorCirculo(dadosCorCirculoUsuario);
				
				
				double calcAreaCirculo = circulo.setCalcCirculo(dadosCirculoUsuario);
				

				
				
				
				System.out.println("A cor do C�rculo �: " +  circulo.getCorCirculo() + " o valor do calculo �: " + calcAreaCirculo);
				
			
				
				return; 
			
			}
			
		} while(true);
		

	}

}
