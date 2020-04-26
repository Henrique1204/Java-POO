package entidades;

import interfaces.Caixa;
import java.util.Scanner;

public class Conta implements Caixa
{
	Scanner sc = new Scanner(System.in);

	private String titular, numeroConta;
	private double saldo;

	//Contrutor
	public Conta(String numeroConta, String titular)
	{
		this.setTitular(titular);
		this.setNumeroConta(numeroConta);
		this.setSaldo(0);
	}

	public Conta(String numeroConta, String titular, double depositoIni)
	{
		this.setTitular(titular);
		this.setNumeroConta(numeroConta);
		this.depositar(depositoIni);
	}

	//Getters
	public String getTitular()
	{
		return titular;
	}

	public String getNumeroConta()
	{
		return numeroConta;
	}

	public double getSaldo()
	{
		return saldo;
	}

	//Setters
	public void setTitular(String titular)
	{
		this.titular = titular;
	}

	private void setNumeroConta(String numeroConta)
	{
		this.numeroConta = numeroConta;
	}

	private void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}

	//M�todos sobrescrevidos
	public String toString()
	{
		return "N�mero da conta: " + this.getNumeroConta() + " | Titular: " + this.getTitular() + " | Saldo: $ " + String.format("%.2f", this.getSaldo());
	}

	//M�todos da interface
	@Override
	public void sacar()
	{
		System.out.print("\nDigiete o valor que deseja sacar: ");
		double valor = sc.nextDouble();

		if(this.getSaldo() > 0)
		{
			this.setSaldo(this.getSaldo() - (valor + 5));
			System.out.println("\nAtualiza��o da conta:");
		}
		else
		{
			System.out.println("\nSaldo insuficiente, imposs�vel sacar!");
			System.out.println("Status da conta:");
		}

		System.out.println(toString());
	}

	@Override
	public void depositar()
	{
		System.out.print("\nDigite o valor que deseja depositar: ");
		double valor = sc.nextDouble();

		this.setSaldo(this.getSaldo() + valor);
		System.out.println("\nAtualiza��o da conta:");
		System.out.println(toString());
	}

	public void depositar(double valor)
	{
		this.setSaldo(this.getSaldo() + valor);
	}
}
