package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();

		System.out.print("Digite a quantidade de pessoas: ");
		int n = sc.nextInt();

		for(int i = 0; i < n; i++)
		{
			System.out.println("\nDados da primeira pessoa #" + (i + 1));

			System.out.print("Pessoa física ou jurídica? (f/j) ");
			char res = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();

			switch(res)
			{
				case 'f':
				case 'F':
					System.out.print("Gastos com saúde: ");
					double gastosSaude = sc.nextDouble();

					pessoas.add(new PessoaFisica(nome, rendaAnual, gastosSaude));

					break;
				case 'j':
				case 'J':
					System.out.print("Número de funcionários: ");
					int numeroFuncionarios = sc.nextInt();

					pessoas.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));

					break;
				default:
					System.out.println("Resposta inválida!");
					break;
			}
		}

		System.out.println("\nInmpostos:");
		double somaImpostos = 0.0;

		for(Pessoa pessoa : pessoas)
		{
			System.out.printf("%s: R$ %.2f\n", pessoa.getNome(), pessoa.calcularImposto());
			somaImpostos += pessoa.calcularImposto();
		}

		System.out.printf("\nValor total dos impostos: R$ %.2f", somaImpostos);

		sc.close();
	}
}