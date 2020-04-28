package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto
{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataCriacao;

	//Construtores
	public ProdutoUsado()
	{
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date dataCriacao)
	{
		super(nome, preco);
		this.setDataCriacao(dataCriacao);
	}

	//Getters
	public Date getDataCriacao()
	{
		return this.dataCriacao;
	}

	//Setters
	public void setDataCriacao(Date dataCriacao)
	{
		this.dataCriacao = dataCriacao;
	}

	//M�todos sobrescrevidos
	@Override
	public String precoTag()
	{
		return this.getNome() + "( usado ) " + String.format("R$ %.2f", this.getPreco()) + " ( Data de cria��o: " + sdf.format(this.getDataCriacao()) + " )";
	}
}
