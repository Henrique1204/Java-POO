package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;
import entidades.EmpregadoTercerizado;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Empregado> empregados = new ArrayList<>();

		System.out.print("Quantos funcionário? ");
		int n = sc.nextInt();

		for(int i = 0 ; i < n; i++)
		{
			System.out.println("\nDados do funcionário: #" + (i + 1));

			System.out.print("É tercerizado? [s/n] ");
			char res = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Horas: ");
			int horas = sc.nextInt();

			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			
			if(res == 's' || res == 'S')
			{
				System.out.print("Carga adicional: ");
				double cargaAdicional = sc.nextDouble();

				Empregado empregadoTercerizado = new EmpregadoTercerizado(nome, horas, valorHora, cargaAdicional);
				empregados.add(empregadoTercerizado);
			}
			else
			{
				empregados.add(new Empregado(nome, horas, valorHora));
			}
		}

		System.out.println("\nPagamentos:");

		for(Empregado empregado : empregados)
		{
			System.out.println(empregado);
		}

		sc.close();
	}
}