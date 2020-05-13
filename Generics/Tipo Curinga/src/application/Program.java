package application;

import java.util.Arrays;
import java.util.List;

public class Program
{
	public static void main(String[] args)
	{
		List<Integer> inteiros = Arrays.asList(5,2,10);
		imprimirLista(inteiros);

		List<String> palavras = Arrays.asList("Paulo", "Henrique", "Silva", "Souza");
		imprimirLista(palavras);
	}

	public static void imprimirLista(List<?> lista)
	{
		for(Object item : lista)
		{
			System.out.println(item);
		}
	}
}