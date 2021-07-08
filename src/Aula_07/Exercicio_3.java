package Aula_07;

import java.util.Scanner;


public class Exercicio_3 {

	public static void main(String[] args) {
boolean setMenu = true;
		
		Pilha titulo = new Pilha();
		
        Scanner dadosUsuario = new Scanner(System.in);
               
        
        while(setMenu) {
        	
           System.out.println("Digite 1 - para Inserir livro, 2 para Remover livro, 3 - Imprimir pilha,  0 - Sair ");
           int userData = dadosUsuario.nextInt();
           
           
           
           
           switch(userData) {
           
           
           case 1:
        	   
        	   System.out.println("Insira um livro: ");
        	   String p = dadosUsuario.next();
        	   
        	   titulo.addLivro(p);
        	   
        	   break;
        	   
           case 2:
        	   
        	   System.out.println("Insira um nome: ");

        	   p = dadosUsuario.next();
        	   titulo.removeLivro(p);
        	   
        	   break;
        	   
           case 3: 
        	   
        	   titulo.pilhaMove();
        	   System.out.println(titulo.getTitulo().toString());
        	   
        	   break;
        	   
        	   
           case 0: 
        	   System.out.println("Obrigado!!");
        	   setMenu = false;
           }       	
 	
        }
		
	}

}
