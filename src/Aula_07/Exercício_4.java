package Aula_07;

import java.util.Scanner;


public class Exercício_4 {
	boolean menu = true;
    String pessoa1[] = {"a","b","c","d","e","f"};
    
    Conjunto c1 = new Conjunto();
    
    String pessoa2[] = {"aaa","aaa","aa","bbb","bbbb","ccc"};
    
    Conjunto c2 = new Conjunto();

    Scanner dadosUser = new Scanner(System.in);
    
    while (menu){
        System.out.println("1) Inserir produtos no 1º conjunto ,2) Inserir produtos no 2º conjunto,3) Consultar todos produtos dos dois conjuntos (união),4) Consultar apenas produtos em comum nos dois conjuntos (intersecção).,5) Consultar produtos do 1º conjunto que não existem no 2º conjunto (diferença),6) Consultar se o 1º conjunto está contido no 2º conjunto (verificação de subconjunto). 0-Sair");
        int setMenu = dadosUser.nextInt();
        
        
        switch(setMenu) {
        case 1:
        	 for (int i = 0; i <pessoa1.length ; i++) {
                 c1.addConjunto(pessoa1[i]);
             }
        	
        	break;
        	
        case 2:
        	
        	for (int i = 0; i <pessoa2.length ; i++) {
                c2.addConjunto(pessoa2[i]);
            }
        	break;
        	
        case 3:
        	 c1.getUniao(c2.getProduto());
             System.out.println(c1.getProduto());
        	break;
        	
        case 4:
        	 c1.getInterseccao(c2.getProduto());
             System.out.println(c1.getProduto());
        	break;
        	
        case 5:
        	c1.getDiferenca(c2.getProduto());
            System.out.println(c1);
        	break;
        	
        case 6:
            System.out.println(c1.getSubconjunto(c2.getProduto()));

        	break;
        	
        case 0:
        	menu = false;
        	
        }
        
        


    }
}
}
