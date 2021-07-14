package Aula_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.nio.*;

import Aula_07.Lista;


public class MainConjunto {

	public static void main(String[] args) {
		
		
		 Scanner dadosUsuario = new Scanner(System.in);
		 
		 int posicao = 0;
		 
		 boolean setMenu = true;

	     Lista lista = new Lista();
	     
	     

			
	     	while(setMenu) {
	            System.out.println("1 - Inserir produto, 2) Inserir produto em posição específica, 3) Consultar produto (pelo nome), 4) Consultar produto (pela posição), 5) Substituir produto, 6) Remover produto (pelo nome),7) Remover produto (pela posição) 8- mostrar td 0- sair");
	     		
	            int menu = dadosUsuario.nextInt();
	            
	            
	            
	            switch(menu) {
	            
	            case 1:
	            	
	            	try {
	            		
	            	File arq = new File("registro-log.txt");
	            	
	            	
	            	if(arq.exists() == false) {
	            		
	            		arq.createNewFile();
	            		System.out.println("Arquivo criado!");
	            	}
	            	
	            		
	           		 System.out.println("Inserir Produto: ");
	        		 String produto = dadosUsuario.next();

	        			        				
	        		 FileWriter escrever = new FileWriter(arq);
	        		 BufferedWriter escreverBuffer = new BufferedWriter(escrever);
	        		
	        		 
	        		 
	        			
	        			 escreverBuffer.write(produto);
	        		 

	        			
	        			escreverBuffer.close();
	        			escrever.close();
	            	
	        			
	        			
	            	} catch(IOException e) {
	            		
	            		System.out.println(e.getMessage());
	            	}
	        			

	            	break;
	            	
	            case 2:
	            	break;
	            	
	            case 3:
	            	break;
	            	
	            case 4:
	            	break;
	            	
	            case 5:
	            	break;
	            	
	            case 6:
	            	break;
	            	
	            case 7:
	            	break;
	            	
	            case 8:
	            	
	            	setMenu = false;
	            	
	           }

	            
	     	}
		

	}
}
