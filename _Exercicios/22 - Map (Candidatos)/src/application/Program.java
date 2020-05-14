package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.entidades.Candidato;

public class Program
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o caminho: ");
		String caminho = sc.nextLine();

		try(BufferedReader br = new BufferedReader(new FileReader(caminho)))
		{
			Map<Candidato, Integer> candidatos = new HashMap<>();

			String linha = br.readLine();
	
			while(linha != null)
			{
				String[] dados = linha.split(",");
				
				Candidato candidato = new Candidato(dados[0], Integer.parseInt(dados[1]));

				if(candidatos.containsKey(candidato))
				{
					int votos = candidatos.get(candidato) + candidato.getVotos();
					candidatos.put(candidato, votos);
				}
				else
				{
					candidatos.put(candidato, candidato.getVotos());
				}

				linha = br.readLine();
			}

			for(Candidato key : candidatos.keySet())
			{
				System.out.println(key.getNome() + ": " + candidatos.get(key));
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}