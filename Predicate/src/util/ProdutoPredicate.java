package util;

import java.util.function.Predicate;

import model.entidades.Produto;

public class ProdutoPredicate implements Predicate<Produto>
{
	//Métodos sobrescrevidos
	@Override
	public boolean test(Produto p)
	{
		return p.getPreco() >= 100.00;
	}
	
}