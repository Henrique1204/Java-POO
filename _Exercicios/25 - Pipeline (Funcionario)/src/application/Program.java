package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entidades.Funcionario;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o caminho: ");
		String caminho = sc.nextLine();

		System.out.print("Entre com o salário: ");
		double salario = sc.nextDouble();

		try(BufferedReader br = new BufferedReader(new FileReader(caminho)))
		{
			List<Funcionario> lista = new ArrayList<>();
			String linha = br.readLine();

			while(linha != null)
			{
				String[] dados = linha.split(",");

				lista.add(new Funcionario(dados[0], dados[1], Double.parseDouble(dados[2])));

				linha = br.readLine();
			}

			Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			List<String> emails = lista.stream().filter(f -> f.getSalario() >= salario).map(f -> f.getEmail()).sorted(comp).collect(Collectors.toList());
			System.out.println("\nE-mail dos funcionários com salário maior que '2000.00':");
			emails.forEach(System.out::println);

			double soma = lista.parallelStream().filter(f -> f.getNome().toUpperCase().charAt(0) == 'M').map(f -> f.getSalario()).reduce(0.0, (x,y) -> x + y);
			System.out.printf("\nTotal da soma dos salários dos nome que começam com 'M': %.2f%n", soma);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}