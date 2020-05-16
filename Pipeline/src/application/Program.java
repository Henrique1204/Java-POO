package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program
{
	public static void main(String[] args)
	{
		List<Integer> lista = Arrays.asList(3,4,5,10,7);

		Stream<Integer> st1 = lista.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));

		int soma = lista.stream().reduce(0, (x,y) -> x + y);
		System.out.println("Soma: " + soma);

		List<Integer> novaLista = lista.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());

		System.out.println(Arrays.toString(novaLista.toArray()));
	}
}

//stream.filter -- Recebe um predicate que gera uma nova lista filtrada