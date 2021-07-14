package Aula_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.nio.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


import Aula_07.Lista;


public class MainConjunto {

	public static void main(String[] args) throws IOException {
		
		
		 Scanner dadosUsuario = new Scanner(System.in);
		 
		 int posicao = 0;
		 
		 Lista lista = new Lista();
		 String caminho = "registro-log.txt";
		 
		 File arq = new File(caminho);
		 
	     LocalDateTime ld = LocalDateTime.now();
	     
	     ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	     
	     try {
	            if (arq.createNewFile()) {
	                System.out.println("arquivo criado com sucesso");
	            }
	            
	        } catch (IOException e){
	        	
	            System.out.println(e.getMessage());
	            
	        }
	     
	     
	     RegistroLog registroLog = new RegistroLog();
	     
	  
		 
		 boolean setMenu = true;
	     
	     

			
	     	while(setMenu) {
	            System.out.println("1 - Inserir produto, 2) Inserir produto em posição específica, 3) Consultar produto (pelo nome), 4) Consultar produto (pela posição), 5) Substituir produto, 6) Remover produto (pelo nome),7) Remover produto (pela posição) 8- mostrar td 0- sair");
	     		
	            int menu = dadosUsuario.nextInt();
	            
	            
	            
	            switch(menu) {
	            
	            case 1:
	            	
	            	System.out.println("Inserir Produto: ");
	            	String produto = dadosUsuario.next();
	            	lista.addProduto(produto);
	            	
	            	registroLog.escreveArq(caminho, ld, posicao, produto);
	            	
	            	
	            
	            	break;
	            	
	              	
	            case 2:
	            	
	            	System.out.println("Inserir produto em posição específica: ");
	            	produto = dadosUsuario.next();
	            	lista.addProduto(produto);
	            	
	            	registroLog.escreveArq(caminho, ld, posicao, produto);
	            	
	            	break;
	            	
	            case 3:
	            	
	            	System.out.println("Consultar produto (pelo nome)");
	            	produto = dadosUsuario.next();
	            	if(lista.consultaNome(produto)) {
	                    System.out.println("item disponível" + produto);

	            	} else {
	                    System.out.println("item não disponíel");

	            	}
	            	
	            case 4:
	            	
	                posicao = dadosUsuario.nextInt();
	                System.out.println(lista.consultaPos(posicao));
	                
	                
	            case 5:
	            	
	            	System.out.println("Substituir produto: ");
	            	produto = dadosUsuario.next();
	            	lista.addProduto(produto);
	            	
	            	lista.subProduto(posicao, produto);
	            	
	            	break;
	            	
	            case 6:
	            	
	            	System.out.println("Remover Produto: ");
	            	produto = dadosUsuario.next();
	            	lista.rmvProduto(produto);
	            	
	            	break;
	            	
	            case 7:
	            	
	            	System.out.println("Remover produto (pela posição): ");
	            	produto = dadosUsuario.next();
	            	lista.rmvPosicao(posicao);
	            	break;
	            	
	            case 8:
	            	
	            	System.out.println("Mostrar tudo!");
	            	produto = dadosUsuario.next();
	            	System.out.println(lista.getProd());
	            	
	            	break;
	            	
	            	
	          
	            case 0: 
	            	
	            	setMenu = false;
	            	
	           }
	            

	            
	     	}
		

	}
}
