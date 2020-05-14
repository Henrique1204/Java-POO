package application;

import java.util.Comparator;

import model.entidades.Produto;

public class MeuComparador implements Comparator<Produto>
{
	//Métodos sobrescrevidos
	@Override
	public int compare(Produto p1, Produto p2) {
		
		return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
	}
	
}
