package entidades;

public class Empregado
{
	protected String nome;
	protected Integer horas;
	protected Double valorHora;

	//Contrutor
	public Empregado() {}

	public Empregado(String nome, Integer horas, Double valorHora)
	{
		this.setNome(nome);
		this.setHoras(horas);
		this.setValorHora(valorHora);
	}

	//Getters
	public String getNome()
	{
		return this.nome;
	}

	public Integer getHoras()
	{
		return this.horas;
	}

	public Double getValorHora()
	{
		return this.valorHora;
	}

	//Setters
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setHoras(Integer horas)
	{
		this.horas = horas;
	}

	public void setValorHora(Double valorHora)
	{
		this.valorHora = valorHora;
	}

	//Métodos sobrescrevidos
	@Override
	public String toString()
	{
		return this.getNome() + " - " + String.format("R$ %.2f", this.pagar());
	}

	//Métodos comuns
	public double pagar()
	{
		return this.getValorHora() * this.getHoras();
	}
}
