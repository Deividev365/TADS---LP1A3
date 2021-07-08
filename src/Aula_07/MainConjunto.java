package Aula_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainConjunto {
	
	
	 Scanner dadosUsuario = new Scanner(System.in);
     int posicao=0;
     boolean setMenu = true;
     Lista l = new Lista();
     
    while(setMenu) {
    	
    	
    	
        System.out.println("1 - Inserir produto, 2) Inserir produto em posição específica, 3) Consultar produto (pelo nome), 4) Consultar produto (pela posição), 5) Substituir produto, 6) Remover produto (pelo nome),7) Remover produto (pela posição) 8- mostrar td 0- sair");
         int n = 99;
        int menu = dadosUsuario.nextInt();
         
         
         
         switch(menu) {
        	 case 1:
        		 
        		 System.out.println("Inserir Produto: ");
        		 String produto = dadosUsuario.next();
        		 l.addProduto(produto);
        		 
        		 break;
        		 
        	 case 2:
        		 
        		 System.out.println("Inserir Produto: ");
        		 produto = dadosUsuario.next();
        		 l.addPosicao(produto, posicao);
        		 break;
        		 
        	 case 3:
        		 
        		 System.out.println("Inserir Produto: ");
        		 produto = dadosUsuario.next();
        		 break;
        		 
        	 case 4:
        		 System.out.println("Inserir Produto: ");
        		 posicao = dadosUsuario.nextInt();
                 System.out.println(l.consultaPos(posicao));
        		 
        	 case 5:
        		 
        		 System.out.println("Inserir Produto: ");
        		 posicao= dadosUsuario.nextInt();
                 produto = dadosUsuario.next();
                  l.subProduto(posicao,produto);
        		 
        	 case 6:
        		 
        		 System.out.println("Inserir Produto: ");
        		 produto =dadosUsuario.next();
                 l.rmvProduto(produto);
        		 
        	 case 7:
        		 
        		 System.out.println("Inserir Produto: ");
        		  posicao = dadosUsuario.nextInt();
                  l.rmvPosicao(posicao);
        		 
        	 case 8:
        		 
        		 System.out.println("Inserir Produto: ");
                 System.out.println(l.getProd());
        		 break;
        		 
        	 case 0: 
        		 setMenu = false;
         }
         
    }
 }

}
