package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.Funcionario;

public class Program
{
	public static void main(String[] args)
	{
		List<Funcionario> lista = new ArrayList<>();
		String caminho = "c:\\temp\\teste.txt";

		try(BufferedReader br = new BufferedReader(new FileReader(caminho)))
		{
			String funcionarioCsv = br.readLine();

			while(funcionarioCsv != null)
			{
				String[] valores = funcionarioCsv.split(",");

				lista.add( new Funcionario( valores[0],  Double.parseDouble(valores[1]) ) );
				funcionarioCsv  = br.readLine();
			}

			//Para funcionar você precisar que o tipo da lista seja uma classe com compareTo implementado
			Collections.sort(lista);

			for(Funcionario item : lista)
			{
				System.out.println(item.getNome() + String.format(", %.2f", item.getSalario()));
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}