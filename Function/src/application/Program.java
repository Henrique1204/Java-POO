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

		//List<String> nomes = lista.stream().map(new UpperCaseNome()).collect(Collectors.toList()); Maneira um -> implementação da interface
		//List<String> nomes = lista.stream().map(Produto::UpperCaseNomeStatic).collect(Collectors.toList()); Maneira dois -> referência de método (statico)
		//List<String> nomes = lista.stream().map(Produto::UpperCaseNomeNaoStatic).collect(Collectors.toList()); Maneira três -> referência de método (Não statico)
		//Function<Produto, String> fun = p -> p.getNome().toUpperCase();
		//List<String> nomes = lista.stream().map(fun).collect(Collectors.toList()); Maneira quatro -> expressão lambda declarada
		List<String> nomes = lista.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList()); // Maneira cinco -> expressão lambda inline

		nomes.forEach(System.out::println);
	}
}