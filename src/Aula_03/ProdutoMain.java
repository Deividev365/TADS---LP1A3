package Aula_03;
import java.util.Scanner;

public class ProdutoMain {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		Scanner dadosUsuario = new Scanner(System.in);
		Scanner dadosUsuario2 = new Scanner(System.in);
		
		
		System.out.println("Digite o código do produto");
		int codigoProd = dadosUsuario2.nextInt();
		
		System.out.println("Digite a descrição do produto");
		String descricaoProd = dadosUsuario.nextLine();
		
		System.out.println("Digite o preco do produto");
		float precoProd = dadosUsuario2.nextFloat();
		
		
		
		produto.setCodigo(codigoProd);
		produto.setDescricao(descricaoProd);
		produto.setPreco(precoProd);
		produto.setAtivo(true);
		
		
		
		System.out.println("O código do produto é: " + produto.getCodigo() + " A descrição do produto: " + produto.getDescricao() + " O preço do produto é: " + produto.getPreco() + " E o produto está ativo?: " + produto.isAtivo());
		
		
		
		dadosUsuario.close();
		dadosUsuario2.close();
		

	}

}
