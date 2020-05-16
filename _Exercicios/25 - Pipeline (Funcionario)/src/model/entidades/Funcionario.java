package model.entidades;

public class Funcionario
{
	private String nome, email;
	private Double salario;

	//Construtores
	public Funcionario() {}

	public Funcionario(String nome, String email, Double salario)
	{
		this.setNome(nome);
		this.setEmail(email);
		this.setSalario(salario);
	}

	//Getters
	public String getNome()
	{
		return this.nome;
	}

	public String getEmail()
	{
		return this.email;
	}

	public Double getSalario()
	{
		return this.salario;
	}

	//Setters
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setSalario(Double salario)
	{
		this.salario = salario;
	}

	//Métodos sobrescrevidos
	@Override
	public String toString()
	{
		return "Funcionáiro: " + this.getNome() + " | E-mail: " + this.getEmail() + " | Salário: " + String.format("%.2f", this.getSalario());
	}
}
