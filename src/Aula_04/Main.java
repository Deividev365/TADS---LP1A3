package Aula_04;

public class Main {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		Cliente cliente = new Cliente();
		
		
		conta.setIdConta(1);
		conta.setAgencia(01);
		conta.setNumeroConta("123456789");
		conta.setTitular("Deivid", "50577777", "rua  dos paes", "deivid@hotmail.com");
		
		
		System.out.println(cliente.getTitular());
		

	}

}


