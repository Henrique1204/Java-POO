package application;

import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();

		System.out.print("Digite o nome do produto: ");
		produto.nome = sc.next();

		System.out.print("Digite o preço do produto: ");
		produto.preco = sc.nextDouble();

		System.out.print("Digite a quantidade de produtos: ");
		produto.quant = sc.nextInt();

		System.out.println(produto);
		
		System.out.print("Deseja atualizar os dados?[s/n]");
		char res = sc.next().charAt(0);

		while(res == 's' || res == 's')
		{
			System.out.println("ESCOLHA A OPERAÇÂO ABAIXO");
			System.out.println("(a) Adicionar  ||   (b) Remover");
			char escolha = sc.next().charAt(0);

			System.out.print("Digite o valor da mudança: ");
			int valor = sc.nextInt();
			String opcao = escolha == 'a' ? "add" : "rm";
			produto.atualizarEstoque(valor, opcao);

			System.out.print("Deseja atualizar os dados?[s/n]");
			res = sc.next().charAt(0);
		}

		sc.close();
	}
}