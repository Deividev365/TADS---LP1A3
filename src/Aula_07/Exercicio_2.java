package Aula_07;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		boolean setMenu = true;
		
		Fila pessoa = new Fila();
		
        Scanner dadosUsuario = new Scanner(System.in);
               
        
        while(setMenu) {
        	
           System.out.println("Digite 1 - para Inserir pessoa, 2 para Remover pessoa, 3 - Imprimir fila,  0 - Sair ");
           int userData = dadosUsuario.nextInt();
           
           
           
           
           switch(userData) {
           
           
           case 1:
        	   
        	   System.out.println("Insira um nome: ");
        	   String p = dadosUsuario.next();
        	   
        	   pessoa.addPerson(p);
        	   
        	   break;
        	   
           case 2:
        	   
        	   System.out.println("Insira um nome: ");

        	   p = dadosUsuario.next();
        	   pessoa.removePerson(p);
        	   
        	   break;
        	   
           case 3: 
        	   
        	   pessoa.moverFila();
        	   System.out.println(pessoa.getPerson().toString());
        	   
        	   break;
        	   
        	   
           case 0: 
        	   System.out.println("Obrigado!!");
        	   setMenu = false;
           }

        	
        	
        	
        	
        	
        }
		
	}

}
