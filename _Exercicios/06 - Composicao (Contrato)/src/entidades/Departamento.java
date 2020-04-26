package entidades;

public class Departamento
{
	private String nome;

	//Contrutores
	public Departamento() {}

	public Departamento(String nome)
	{
		this.setNome(nome);
	}

	//Getters
	public String getNome()
	{
		return this.nome;
	}

	//Setters
	public void setNome(String nome)
	{
		this.nome = nome;
	}	
}