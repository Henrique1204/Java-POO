package util;

import java.util.function.Consumer;

import model.entidades.Produto;

public class AtualizacaoPreco implements Consumer<Produto>
{
	//M�todos sobrescrevidos
	@Override
	public void accept(Produto p)
	{
		p.setPreco(p.getPreco() * 1.1);
	}	
}