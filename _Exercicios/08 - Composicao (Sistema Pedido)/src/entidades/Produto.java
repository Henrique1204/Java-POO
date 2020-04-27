package entidades;

public class Produto
{
	private String nome;
	private Double preco;

	//Construtores
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

	//Métodos sobrescrevido
	public String toString()
	{
		return this.getNome() + String.format(", R$ %.2f", this.getPreco());
	}
}
