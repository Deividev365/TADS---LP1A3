package Exercicio_09;

import Aula_09.Retangulo;

public class RetanguloMainTest {

	public static void main(String[] args) {
		RetanguloTest  teste = new RetanguloTest();

		
		boolean resultado;
		
		resultado = teste.testCalcularArea();
		System.out.println("Área: " + resultado);
		
		resultado = teste.testCalcularPerimetro();
		System.out.println("Perimetro "+ resultado);


		
	}

}
