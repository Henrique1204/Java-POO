package application;

import entidades.Conta;
import entidades.ContaNegocio;
import entidades.ContaPoupanca;

public class Program
{
	public static void main(String[] args)
	{
		Conta c1 = new Conta(1001, "Alex", 1000.0);
		Conta c2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
		Conta c3 = new ContaNegocio(1003, "Bob", 1000.0, 500.0);

		c1.sacar(200.00);
		c2.sacar(200.00);
		c3.sacar(200.00);

		System.out.println("Conta: " + c1.getSaldo());
		System.out.println("Conta poupança: " + c2.getSaldo());
		System.out.println("Conta negócio: " + c3.getSaldo());
	}
}