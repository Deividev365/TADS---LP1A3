package Aula_04;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		Ex2_Cliente cliente = new Ex2_Cliente();
		PessoaFisica[] pessoaFisica = new PessoaFisica[1];
		PessoaJuridica[] pessoaJuridica = new PessoaJuridica[1];
		
		Scanner dadosUsuario = new Scanner(System.in);

		
		
		
		
		while(true) {
				
				System.out.println("Digite 1 -> para Inserir Cliente\n\n Digite 2 -> para remover cliente\n\n 3 -> consultar todos clientes");
				int setMenu = dadosUsuario.nextInt();
						
			
			switch(setMenu) {
			
			case 1:
				
				
				System.out.println("Digite **1** para pessoa Física OU **2** para pessoa Jurídica");
				
				int isPessoaFisica = dadosUsuario.nextInt();
				
				if(isPessoaFisica == 1) {
					
					
					for(int i = 0; i < pessoaFisica.length; i++) {
						
						pessoaFisica[i] = new PessoaFisica();
						
						
						System.out.println("Digite o " + (1 + i) + " nome");
						String nomeUsuario = dadosUsuario.next();
						
						
						pessoaFisica[i].setNome(nomeUsuario);
						
						
						System.out.println("Digite o seu CPF: ");
						String cpfUsuario = dadosUsuario.next();
						
						
						pessoaFisica[i].setCpf(cpfUsuario);
						
						
						
						System.out.println("Digite o seu telefone: ");
						String telefoneUsuario = dadosUsuario.next();
						
						pessoaFisica[i].setTelefone(telefoneUsuario);
						
						
						
						System.out.println("Cadastrado com sucesso!!");
						
								
						//cliente.setMenu();
						
						
						
					}
					
					
				} else if(isPessoaFisica == 2) {
					
					
					for(int i = 0; i < pessoaJuridica.length; i++) {
						
						
						
						pessoaJuridica[i] = new PessoaJuridica();
						
						
						
						System.out.println("Digite a razão social da sua Empresa: ");
						String razaoSocialUsuario = dadosUsuario.next();
						
						
						pessoaJuridica[i].setRazaoSocial(razaoSocialUsuario);
						
						
						System.out.println("Digite o CNPJ da Empresa");
						String cnpjUsuario = dadosUsuario.next();
						
						
						pessoaJuridica[i].setCnpj(cnpjUsuario);
						
						
						System.out.println("Digite o endereço: ");
						String enderecoUsuario = dadosUsuario.next();
						
						
						pessoaJuridica[i].setEndereco(enderecoUsuario);
						
						
						System.out.println("Digite o Telefone: ");
						String telefoneUsuario = dadosUsuario.next();
						
						
						pessoaJuridica[i].setTelefone(telefoneUsuario);
						
						
						System.out.println("Cadastrado com sucesso!!");
						
						
						//cliente.setMenu();
						
						
					}				
				}	
				
				break;
			
			
			case 2:
				
				System.out.println("Opção para remover cliente");
				
				
				
				
				
				
				
				
				break;
				
			case 3:
				
				
					for(int i = 0; i < pessoaFisica.length; i++) {
						
						System.out.println("DADOS PESSOA FÍSICA:\n ");
						System.out.println(pessoaFisica[i].getNome() + " - " + pessoaFisica[i].getCpf() + " - " + pessoaFisica[i].getTelefone() + "\n");
						
						
					}
					
					for(int i = 0; i < pessoaJuridica.length; i++) {
						System.out.println("DADOS PESSOA JURÍDICA:\n ");
						System.out.println(pessoaJuridica[i].getRazaoSocial() + " - " + pessoaJuridica[i].getCnpj() + " - " + pessoaJuridica[i].getEndereco() + " - " + pessoaJuridica[i].getTelefone() + "\n");
					
					
				}

				break;
			}
			
			
			
		}
		
		
		
		
		
		
		

	}

}
