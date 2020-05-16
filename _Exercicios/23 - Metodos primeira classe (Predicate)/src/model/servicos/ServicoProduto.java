package model.servicos;

import java.util.List;
import java.util.function.Predicate;

import model.entidades.Produto;

public class ServicoProduto
{
	public double somaFiltrada(List<Produto> lista, Predicate<Produto> criterio)
	{
		double soma = 0.0;
		for(Produto p : lista)
		{
			soma += (criterio.test(p)) ? p.getPreco() : 0;
		}

		return soma;
	}
}