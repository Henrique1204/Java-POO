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

		//lista.forEach(new AtualizacaoPreco()); Maneira um -> implementa��o de interface
		//lista.forEach(Produto::atualizarPrecoStatic); Maneira dois -> refer�ncia de m�todo (statico)
		//lista.forEach(Produto::atualizarPrecoNaoStatic); Maneira tr�s -> refer�ncia de m�todo (n�o statico)
		//Consumer<Produto> con = p -> p.setPreco(p.getPreco() * 1.1); Maneira quatro -> express�o lambda com refer�ncia
		//lista.forEach(con);

		lista.forEach(p -> p.setPreco(p.getPreco() * 1.1)); //Maneira cinco -> express�o lambda inline
		lista.forEach(System.out::println);
	}
}