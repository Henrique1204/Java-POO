package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program
{
	public static void main(String[] args)
	{
		/*
		//Covariânça
		List<Integer> intLista = new ArrayList<>();

		intLista.add(10);
		intLista.add(5);

		List<? extends Number> lista = intLista;

		Number x = lista.get(0);

		System.out.println("RESULTADO COVARIÂNCIA:");
		System.out.println(x);

		//Contravariânça
		List<Object> objs = new ArrayList<>();
		objs.add("Maria");
		objs.add("Alex");

		List<? super Number> numero = objs;

		numero.add(10);
		numero.add(3.14);

		Number y = numero.get(0);
		*/

		List<Integer> ints = Arrays.asList(1,2,3,4);
		List<Double> doubles = Arrays.asList(3.14, 6.28);
		List<Object> obj = new ArrayList<>();

		copiar(ints, obj);
		System.out.println("Lista Integer: " + obj);

		copiar(doubles, obj);
		System.out.println("Lista Double: " + obj);
	}
									//Covariânça					//Contravariânça
	public static void copiar(List<? extends Number> origem, List<? super Number> destino )
	{
		for(Number n : origem)
		{
			destino.add(n);
		}
	}
}