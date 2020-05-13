package model.servico;

import java.util.ArrayList;
import java.util.List;

public class ServicoImpressao<Tipo>
{
	private List<Tipo> lista = new ArrayList<>();

	//construtor
	public ServicoImpressao() {}

	//Métodos implementados
	public void addValores(Tipo valor)
	{
		this.lista.add(valor);
	}

	public Tipo checarPrimeiro()
	{
		if(lista.isEmpty())
		{
			throw new IllegalStateException("Lista vazia");
		}

		return this.lista.get(0);
	}

	public void imprimir()
	{
		if(!lista.isEmpty())
		{
			System.out.println(this.lista);
		}
	}
}
