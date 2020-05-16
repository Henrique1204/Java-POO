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

	//Referência de método statico
	public static String UpperCaseNomeStatic(Produto p)
	{
		return p.getNome().toUpperCase();
	}

	//Referência de método não statico
	public String UpperCaseNomeNaoStatic()
	{
		return this.getNome().toUpperCase();
	}

	//Métodos sobrescritos
	@Override
	public String toString()
	{
		return this.getNome() + String.format(",%.2f", this.getPreco());
	}
}