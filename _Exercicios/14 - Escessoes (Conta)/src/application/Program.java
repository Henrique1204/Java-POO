package application;

import java.util.Locale;
import java.util.Scanner;

import model.entidades.Conta;
import model.exception.DomainException;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Entre com os dados da conta:");

			System.out.print("Numero: ");
			int numero = sc.nextInt();

			System.out.print("Titular: ");
			sc.nextLine();
			String titular = sc.nextLine();

			System.out.print("Saldo inicial: ");
			double saldo = sc.nextDouble();

			System.out.print("Limite do saque: ");
			double limiteSaque = sc.nextDouble();

			Conta conta = new Conta(numero, titular, saldo, limiteSaque);

			System.out.print("\nEntre com o valor de saque: ");
			double valor = sc.nextDouble();
			conta.sacar(valor);
		}
		catch(DomainException e)
		{
			System.out.println("Erro no saque: " + e.getMessage());
		}

		sc.close();
	}
}