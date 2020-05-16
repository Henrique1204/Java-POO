package ultil;

import java.util.function.Function;

import model.entidades.Produto;

public class UpperCaseNome implements Function<Produto, String>
{
	//Métodos sobrescrevidos
	@Override
	public String apply(Produto p)
	{
		return p.getNome().toUpperCase();
	}	
}