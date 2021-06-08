package Aula_03;
import java.util.Scanner;

public class CadastroClienteMain {

	public static void main(String[] args) {
		
		Scanner dadosUsuario = new Scanner(System.in);
		
		
		Cliente[] cliente = new Cliente[3];
		
		while(true) {
		
		System.out.println("Digite 1 -> para Inserir Cliente\n\n Digite 2 -> para Consultar cliente especifico\n\n 3 -> consultar todos clientes");
		int setMenu = dadosUsuario.nextInt();
		
		
		switch(setMenu) {
		   case 1:
			   
			   for(int i = 0; i < cliente.length; i++) {
				   
				   cliente[i] = new Cliente(i + 1);
				   
				   System.out.println("Insira o nome do cliente " + (1 + i));
				   String nomeCliente = dadosUsuario.next();
				   
				   cliente[i].setNome(nomeCliente);
				   
				   
				   System.out.println("Digite o seu cpf: ");
				   String cpfCliente = dadosUsuario.next();
				   
				   
				   if(cpfCliente.length() < 11) {
					   System.out.println("CPF INVÁLIDO - DIGITE 11 DIGITOS");
					   return;
				   }
				   
				   cliente[i].setCpf(cpfCliente);
				   
			   }
			   
			   break;
		   
		   case 2:
			  int codigoUsuario = 0;
			  
			  System.out.println("Insira o codigo do cliente: ");
			  
			  codigoUsuario = dadosUsuario.nextInt();
			  
			  
			  System.out.println(cliente[codigoUsuario].getNome());
			  System.out.println(cliente[codigoUsuario].getCpf());
			   
		      break; 
		   
		      
		   case 3:
			   for(int i = 0; i < cliente.length; i++) {
				   
				   System.out.println(cliente[i]);
			   }

		   default:
			   

		}
		
		
		}
	}

}
