package ultil;

import java.util.function.Function;

import model.entidades.Produto;

public class UpperCaseNome implements Function<Produto, String>
{
	//M�todos sobrescrevidos
	@Override
	public String apply(Produto p)
	{
		return p.getNome().toUpperCase();
	}	
}