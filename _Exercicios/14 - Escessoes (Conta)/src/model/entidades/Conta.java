package model.entidades;

import model.exception.DomainException;

public final class Conta
{
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;

	//Contrutores
	public Conta() {}

	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque)
	{
		this.setNumero(numero);
		this.setTitular(titular);
		this.setSaldo(saldo);
		this.setLimiteSaque(limiteSaque);
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

	public Double getLimiteSaque()
	{
		return this.limiteSaque;
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

	public void setLimiteSaque(Double limiteSaque)
	{
		this.limiteSaque = limiteSaque;
	}

	//Métodos comuns
	public final void sacar(double valor)
	{
		if(valor > this.getLimiteSaque())
		{
			throw new DomainException("valor acima do limite permitido.");
		}
		if(valor > this.getSaldo())
		{
			throw new DomainException("sem saldo suficiente.");
		}
		else
		{
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque realizado com sucesso!");
		}
	}

	public final void depositar(double valor)
	{
		this.setSaldo(this.getSaldo() + valor);
	}
}