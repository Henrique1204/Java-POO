package entidades;

public class Conta
{
	protected Integer numero;
	protected String titular;
	protected Double saldo;

	//Construtores
	public Conta() {}

	public Conta(Integer numero, String titular, Double saldo)
	{
		this.setNumero(numero);
		this.setTitular(titular);
		this.setSaldo(saldo);
	}

	//Getters
	public Integer getNumero()
	{
		return this.numero;
	}

	public String getTitular()
	{
		return this.titular;
	}

	public Double getSaldo()
	{
		return this.saldo;
	}

	//Setters
	public void setNumero(Integer numero)
	{
		this.numero = numero;
	}

	public void setTitular(String titular)
	{
		this.titular = titular;
	}

	public void setSaldo(Double saldo)
	{
		this.saldo = saldo;
	}

	//Métodos comuns
	public void sacar(double valor)
	{
		this.setSaldo(this.getSaldo() - (valor + 5));
	}

	public void depositar(double valor)
	{
		this.setSaldo(this.getSaldo() + valor);
	}
}