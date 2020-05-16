package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entidades.Produto;
import model.servicos.ServicoProduto;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		List<Produto> lista = new ArrayList<>();

		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("HD case", 80.90));

		ServicoProduto sp = new ServicoProduto();

		double soma = sp.somaFiltrada(lista, p -> p.getPreco() < 100.00);

		System.out.printf("Soma: %.2f%n", soma);
	}
}