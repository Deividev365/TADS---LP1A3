package Aula_02;

import java.util.Scanner;


public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner entradaDeDados = new Scanner(System.in);
		//Scanner valorDecimal = new Scanner(System.in);
		
		System.out.println("Digite um numero  entre 1 e 3: ");
		int numero = entradaDeDados.nextInt();
		
		
		
		switch(numero) {
		  case 1:
			  
			  System.out.println("Digite um valor decimal");
			  double numeroUsuario = entradaDeDados.nextDouble();
			  			  
			  System.out.println("valor inteiro mais proximo " + Math.round(numeroUsuario));
		    break;
		  case 2:
			 System.out.println("Digite um numero maior ou igual a zero");
			 int calcRaizQuadrada = entradaDeDados.nextInt();
			 
			 System.out.println("O valor é igual a: " + Math.sqrt(calcRaizQuadrada));
			 
			 
			  break;
		  case 3:
			  System.out.println("Digite a base");
			  int baseNumber = entradaDeDados.nextInt();
			  
			  System.out.println("Digite o expoente");
			  int expoenteNumber = entradaDeDados.nextInt();
			  
			 System.out.println("o resultado do calculo é: " + Math.pow(baseNumber,expoenteNumber ));
			  
		    break;
		  default:
		    return;
		}
		
		
		
		
		entradaDeDados.close();		
		
		
	

	}

}
