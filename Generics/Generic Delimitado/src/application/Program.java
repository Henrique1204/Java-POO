package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entidades.Produto;
import model.servico.ServicoCalcular;

public class Program
{
	public static void main(String[] args)
	{
		List<Produto> lista = new ArrayList<>();

		String caminho = "c:\\temp\\teste.txt";

		try(BufferedReader br = new BufferedReader(new FileReader(caminho)))
		{

			String linha = br.readLine();

			while(linha != null)
			{
				String[] valores = linha.split(",");

				lista.add( new Produto( valores[0], Double.parseDouble(valores[1] ) ) );
				linha = br.readLine();
			}

			Produto x = ServicoCalcular.maior(lista);
			System.out.println("Maior: " + x);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}