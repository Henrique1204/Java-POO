package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Departamento;
import entidades.HorasContrato;
import entidades.Trabalhador;
import entidades.enums.TrabalhadorLevel;

public class Program
{
	public static void main(String[] args) throws ParseException
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Digite o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();

		System.out.println("| Digite os dados do trabalhador |");

		System.out.print("  Nome: ");
		String nomeTrabalhador = sc.nextLine();

		System.out.print("  Level: ");
		String levelTrabalhador = sc.nextLine();

		System.out.print("  Salário Base: ");
		double salarioBaseTrabalhador = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, TrabalhadorLevel.valueOf(levelTrabalhador.toUpperCase()), salarioBaseTrabalhador, new Departamento(nomeDepartamento));

		System.out.printf("\nQuantos novos contratos para '%s'? ", trabalhador.getNome());
		int numeroContratos = sc.nextInt();

		for(int i = 0; i < numeroContratos; i++)
		{
			System.out.printf("coloque os dados do #%d contrato\n", (i + 1));

			System.out.print(" Data (DD/MM/AAAA): ");
			Date dataValor = sdf.parse(sc.next());

			System.out.print(" Valor por hora: ");
			double valorPorHora = sc.nextDouble();

			System.out.print(" Quantidade de horas: ");
			int horas = sc.nextInt();

			HorasContrato contrato = new HorasContrato(dataValor, valorPorHora, horas);
			trabalhador.addContrato(contrato);
		}

		System.out.print("\nEntre com a data para calcular a renda (MM/AAAA): ");
		String mesEAno = sc.next();

		int ano = Integer.parseInt(mesEAno.substring(3));
		int mes = Integer.parseInt(mesEAno.substring(0, 2));

		System.out.println(trabalhador);
		System.out.printf("Renda de %s: R$ %.2f\n", mesEAno, trabalhador.renda(ano, mes));

		sc.close();
	}
}