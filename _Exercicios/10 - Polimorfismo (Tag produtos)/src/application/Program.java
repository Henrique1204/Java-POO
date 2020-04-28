package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Program
{
	public static void main(String[] args) throws ParseException
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> produtos = new ArrayList<>();

		System.out.print("Digiet a quantidade de produtos: ");
		int n = sc.nextInt();

		for(int i = 0; i < n; i++)
		{
			System.out.println("Dados do produto #" + (i + 1));

			System.out.print("Novo, usado ou importado? (n/u/i) ");
			char res = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Preço: ");
			double preco = sc.nextDouble();

			switch(res)
			{
				case 'u':
				case 'U':
					System.out.print("Data de criação (dd/mm/aaaa): ");
					Date dataCriacao = sdf.parse(sc.next());

					Produto produtoUsado = new ProdutoUsado(nome, preco, dataCriacao);
					produtos.add(produtoUsado);

					break;
				case 'i':
				case 'I':
					System.out.print("Taxa de importação: ");
					double taxaImportacao = sc.nextDouble();

					Produto produtoImportado = new ProdutoImportado(nome, preco, taxaImportacao);
					produtos.add(produtoImportado);

					break;
				case 'n':
				case 'N':
					Produto produto = new Produto(nome, preco);
					produtos.add(produto);

					break;
				default:
					System.out.println("Resposta inválida!");
					break;
			}
		}

		System.out.println("\nPreços Tag:");

		for(Produto produto : produtos)
		{
			System.out.println(produto.precoTag());
		}

		sc.close();
	}
}