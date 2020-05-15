package model.entidades;

public class Produto
{
	private String nome;
	private Double preco;

	//Contrutores
	public Produto() {}

	public Produto(String nome, Double preco)
	{
		this.setNome(nome);
		this.setPreco(preco);
	}

	//Getters
	public String getNome()
	{
		return this.nome;
	}

	public Double getPreco()
	{
		return this.preco;
	}

	//Setters
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setPreco(Double preco)
	{
		this.preco = preco;
	}

	//Refer�ncia de m�todo statico
	public static void atualizarPrecoStatic(Produto p)
	{
		p.setPreco(p.getPreco() * 1.1);
	}

	//Refer�ncia de m�todo n�o statico
	public void atualizarPrecoNaoStatic()
	{
		this.setPreco(this.getPreco() * 1.1);
	}

	//M�todos sobrescritos
	@Override
	public String toString()
	{
		return this.getNome() + String.format(",%.2f", this.getPreco());
	}
}