package entidades;

public abstract class Pessoa
{
	private String nome;
	private Double rendaAnual;

	//Construtores
	public Pessoa() {}

	public Pessoa(String nome, Double rendaAnual)
	{
		this.setNome(nome);
		this.setRendaAnual(rendaAnual);
	}

	//Getters
	public String getNome()
	{
		return this.nome;
	}

	public Double getRendaAnual()
	{
		return this.rendaAnual;
	}

	//Setters
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setRendaAnual(Double rendaAnual)
	{
		this.rendaAnual = rendaAnual;
	}

	//Métedos abstratos
	public abstract Double calcularImposto();
}
