package application;

import java.util.ArrayList;
import java.util.List;

import model.entidades.Produto;

public class Program
{
	public static void main(String[] args)
	{
		List<Produto>  lista = new ArrayList<>();

		lista.add(new Produto("TV", 900.0));
		lista.add(new Produto("Notebook", 1200.0));
		lista.add(new Produto("Tablet", 450.00));

		//lista.sort(new MeuComparador()); Maneira um

		/*Maneira dois
		Comparator<Produto> comp = new Comparator<Produto>()
		{
			//Métodos sobrescrevidos
			@Override
			public int compare(Produto p1, Produto p2)
			{
				return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
			}
			
		};

		lista.sort(comp);
		*/

		/*Maneira três
		Comparator<Produto> comp = (p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());

		lista.sort(comp);
		*/

		//Maneira quatro
		lista.sort( (p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()) );

		for(Produto produto : lista)
		{
			System.out.println(produto);
		}
	}
}