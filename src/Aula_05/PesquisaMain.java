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
			System.out.println(" 5 - Finalizar Opera��o \n  ");
			
			
			
			int setMenu = setOpcaoMenu.nextInt();
			
			
			
			
			 switch (setMenu){
	         case 1:
	        	 
	        	 
	        	 pesquisa.setTexto(textoUsuario);
	        	 
	        	 System.out.println("Cadeia de Caracteres Usuario: >>" + pesquisa.getTexto());
				
				
	        	 break;
	            
	         
				
	         case 2: 
	        	 
	        	 System.out.println("Fazer a busca da cadeia de caracteres: ");
	        	 String buscaUsuario = dadosUsuario.next();
	        	 
	        	 System.out.println(buscaUsuario);
	        	 
	        	 if(buscaUsuario.indexOf(textoUsuario.indexOf(ch))) {
	        		 
	        	 }
	        	
	        	
		
	        	 break;
			
			
	         case 3:
	        	 
	        	 System.out.println("Buscar String no IN�CIO: ");
	      
	        	 break;
	        	 
	        	 
	        	 
	         case 4: 
	        	 
	        	 
	        	 System.out.println("Buscar String no FIM: ");
	        	 
	        	 break;
	        	 
	        	 
	         case 5: 
	        	 System.out.println("Obrigado, finalizando sistema :D");
	        		 return;
			
			
			 }
			
	
		} while(true);
			
	}
}
