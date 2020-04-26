package application;

import java.util.Scanner;
import java.util.Locale;
import entidades.Conta;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta novaConta;

		System.out.print("Digite o número da conta: ");
		String numeroConta = sc.nextLine();

		System.out.print("Digite o nome do titular: ");
		String titular = sc.nextLine();

		System.out.print("Deseja iniciar a conta com um depósito? [s/n] ");
		char op = sc.next().charAt(0);

		if(op == 's' || op == 'S')
		{
			System.out.print("Digite o valor do depósito inicial: ");
			double depositoIni = sc.nextDouble();

			novaConta = new Conta(numeroConta, titular, depositoIni);
		}
		else
		{
			novaConta = new Conta(numeroConta, titular);
		}

		System.out.println("\nSatus da conta:");
		System.out.println(novaConta.toString());

		novaConta.depositar();

		novaConta.sacar();

		sc.close();
	}
}