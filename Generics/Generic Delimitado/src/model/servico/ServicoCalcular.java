package model.servico;

import java.util.List;

public class ServicoCalcular
{
	public static <Tipo extends Comparable<? super Tipo>> Tipo maior(List<Tipo> lista)
	{
		if(lista.isEmpty())
		{
			throw new IllegalStateException("A lista ta vazia");
		}

		Tipo maior = lista.get(0);

		for(Tipo item : lista)
		{
			maior = (item.compareTo(maior) > 0 ? item : maior);
		}

		return maior;
	}
}