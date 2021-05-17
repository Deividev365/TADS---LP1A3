package Aula_01;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		
		double calculoDoDesconto;
		double calcDif;
		
		Scanner produto1 = new Scanner(System.in);
		float precoProduto1;
		
		System.out.println("Digite o preço do produto: ");
		precoProduto1 = produto1.nextFloat();
		
		
		Scanner desconto = new Scanner(System.in);
		double descontoProduto1;
		
		System.out.println("Digite o desconto desse produto: ");
		
		descontoProduto1 = desconto.nextDouble();
		
		
		calculoDoDesconto = precoProduto1 * (descontoProduto1 /100);
		
		calcDif = precoProduto1 - calculoDoDesconto;
		
		System.out.println("O preco do produto final com desconto é: " + calcDif);
		
		
		produto1.close();
		desconto.close();
		
		
				
		

	}

}
