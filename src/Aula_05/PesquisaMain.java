package Aula_05;
import java.util.Scanner;
public class PesquisaMain {

	public static void main(String[] args) {
		
		Pesquisa pesquisa = new Pesquisa();
		
		
		
		Scanner dadosUsuario = new Scanner(System.in);
	
		Scanner setOpcaoMenu = new Scanner(System.in);

		
		
		
		
			System.out.println("Digite uma cadeia de caracteres");
			String textoUsuario = dadosUsuario.next();
			
			
			do {
			
			
			System.out.println(" 1 - Informar Texto Escrito:\n");
			System.out.println(" 2 - Buscar String: \n");
			System.out.println(" 3 - Buscar String no inicio: \n ");
			System.out.println(" 4 - Buscar String no fim: \n  ");
			
			
			
			int setMenu = setOpcaoMenu.nextInt();
			
			
			
			
			 switch (setMenu){
	         case 1:
	        	 
	        	 
	        	 pesquisa.setTexto(textoUsuario);
	        	 
	        	 System.out.println("Cadeia de Caracteres Usuario: >>" + pesquisa.getTexto());
				
				
	        	 break;
	            
	         
				
	         case 2: 
	        	 
	        	 System.out.println("Buscar String funcao: >>");
		
	        	 break;
			
			
	         case 3:
	        	 
	        	 System.out.println("Buscar String no INÍCIO: ");
	      
	        	 break;
	        	 
	        	 
	        	 
	         case 4: 
	        	 
	        	 
	        	 System.out.println("Buscar String no FIM: ");
	        	 
	        	 break;
	        	 
	        	 
	        	 default: 
	        		 
	        		 return;
			
			
			 }
			
	
		} while(true);
			
	}
}
