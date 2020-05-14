package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entidades.Acesso;

public class Program
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o caminho do arquivo: ");
		String caminho = sc.nextLine();

		try( BufferedReader br = new BufferedReader( new FileReader(caminho) ) )
		{
			Set<Acesso> set = new HashSet<>();

			String linha = br.readLine();

			while(linha != null)
			{
				String[] valores = linha.split(" ");
				set.add( new Acesso( valores[0], Date.from( Instant.parse(valores[1]) ) ) );
				linha = br.readLine();
			}

			System.out.println("Total usuários: " + set.size());
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}