package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

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

		//lista.removeIf(new ProdutoPredicate()); Maneira um -> criando uma classe que implementa a interface
		//lista.removeIf(Produto::produdotoPredicateStatic); Maneira dois -> referência para método (Statico)
		//lista.removeIf(Produto::produdotoPredicateNaoStatic); Maneira três -> referência para métodos (Não staticos)

		//Predicate<Produto> pred = p -> p.getPreco() >= 100.00; Maneira quatro -> expressão lambda declarada
		//lista.removeIf(pred);

		lista.removeIf(p -> p.getPreco() >= 100.0); //Maneira cinco -> expressão lambda inline

		for(Produto item : lista)
		{
			System.out.println(item);
		}
	}
}