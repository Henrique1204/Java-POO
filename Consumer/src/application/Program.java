package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

		//lista.forEach(new AtualizacaoPreco()); Maneira um -> implementação de interface
		//lista.forEach(Produto::atualizarPrecoStatic); Maneira dois -> referência de método (statico)
		//lista.forEach(Produto::atualizarPrecoNaoStatic); Maneira três -> referência de método (não statico)
		//Consumer<Produto> con = p -> p.setPreco(p.getPreco() * 1.1); Maneira quatro -> expressão lambda com referência
		//lista.forEach(con);

		lista.forEach(p -> p.setPreco(p.getPreco() * 1.1)); //Maneira cinco -> expressão lambda inline
		lista.forEach(System.out::println);
	}
}