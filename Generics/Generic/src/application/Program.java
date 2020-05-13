package application;

import java.util.Scanner;

import model.servico.ServicoImpressao;

public class Program
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		ServicoImpressao<String> servico = new ServicoImpressao<>();

		System.out.print("Digite o número de valores a ser adicionado: ");
		int numeros = sc.nextInt();

		for(int i = 0; i < numeros; i++)
		{
			System.out.print("Digite o valor " + (i + 1) +  ": ");
			servico.addValores(sc.next());
		}

		servico.imprimir();
		System.out.println("Primeiro: " + servico.checarPrimeiro());

		sc.close();
	}
}