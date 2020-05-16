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

import model.entidades.Produto;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o caminho do arquivo: ");
		String caminho = sc.nextLine();

		try(BufferedReader br = new BufferedReader(new FileReader(caminho)))
		{
			List<Produto> lista = new ArrayList<>();

			String linha = br.readLine();

			while(linha != null)
			{
				String[] dados = linha.split(",");

				lista.add(new Produto(dados[0], Double.parseDouble(dados[1])));

				linha = br.readLine();
			}

			Double media = lista.stream().map(p -> p.getPreco()).reduce(0.0, (x,y) -> x + y) / lista.size();
			System.out.printf("Preço médio: %.2f%n", media);

			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			List<String> nomes = lista.stream().filter(p -> p.getPreco() < media).map(p -> p.getNome()).sorted(comp.reversed()).collect(Collectors.toList());
			nomes.forEach(System.out::println);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}