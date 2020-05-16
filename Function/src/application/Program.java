package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import model.entidades.Produto;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		List<Produto> lista = new ArrayList<>();

		lista.add(new Produto("TV", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.00));
		lista.add(new Produto("HD Case", 80.90));

		//List<String> nomes = lista.stream().map(new UpperCaseNome()).collect(Collectors.toList()); Maneira um -> implementa��o da interface
		//List<String> nomes = lista.stream().map(Produto::UpperCaseNomeStatic).collect(Collectors.toList()); Maneira dois -> refer�ncia de m�todo (statico)
		//List<String> nomes = lista.stream().map(Produto::UpperCaseNomeNaoStatic).collect(Collectors.toList()); Maneira tr�s -> refer�ncia de m�todo (N�o statico)
		//Function<Produto, String> fun = p -> p.getNome().toUpperCase();
		//List<String> nomes = lista.stream().map(fun).collect(Collectors.toList()); Maneira quatro -> express�o lambda declarada
		List<String> nomes = lista.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList()); // Maneira cinco -> express�o lambda inline

		nomes.forEach(System.out::println);
	}
}