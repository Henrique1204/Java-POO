package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItemPedido;
import entidades.Pedido;
import entidades.Produto;
import entidades.enums.StatusPedido;

public class Program
{
	public static void main(String[] args) throws ParseException
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados do cliente:");

		System.out.print("Nome: ");
		String nomeCliente = sc.nextLine();

		System.out.print("E-mail: ");
		String emailCliente = sc.nextLine();

		System.out.print("Data do aniversário (DD/MM/AAAA): ");
		Date dataAniversario = sdf.parse(sc.next());

		Cliente c1 = new Cliente(nomeCliente, emailCliente, dataAniversario);

		System.out.println("\nEntre com os dados do pedido:");

		System.out.print("Status:");
		String statusPedido = sc.next();

		Pedido p1 = new Pedido(c1, StatusPedido.valueOf(statusPedido.toUpperCase()));

		System.out.print("Quantos itens você quer? ");
		int numeroPedidos = sc.nextInt();

		for(int i = 0; i < numeroPedidos; i++)
		{
			System.out.println("\nEntre com os dados do item #" + (i + 1));

			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();

			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();

			System.out.print("Quantidade: ");
			int quantidadeItem = sc.nextInt();

			Produto produto = new Produto(nomeProduto, precoProduto);
			ItemPedido itemPedido = new ItemPedido(produto, quantidadeItem);

			p1.addItem(itemPedido);
		}

		System.out.println("\n" + p1.toString());

		sc.close();
	}
}
