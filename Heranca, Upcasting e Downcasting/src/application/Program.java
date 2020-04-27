package application;

import entidades.Conta;
import entidades.ContaNegocio;
import entidades.ContaPoupanca;

public class Program
{
	public static void main(String[] args)
	{
		Conta c = new Conta(1001, "Alex", 0.0);
		ContaNegocio cn = new ContaNegocio(1002, "Maria", 0.0, 500.0);

		//UPCASTING
		Conta c1 = cn;
		Conta c2 = new ContaNegocio(1003, "Bob", 0.0, 200.00);
		Conta c3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);

		//DOWNCASTING
		ContaNegocio c4 = (ContaNegocio) c2;

		if(c3 instanceof ContaNegocio)
		{
			System.out.println("Emprestou!");
			ContaNegocio c5 = (ContaNegocio) c3;
			c5.emprestar(200.0);
		}

		if(c3 instanceof ContaPoupanca)
		{
			System.out.println("Atualizaou!");
			ContaPoupanca c5 = (ContaPoupanca) c3;
			c5.atualizarSaldo();
		}
	}
}