package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program
{
	public static void main(String[] args)
	{
		List<Integer> lista = Arrays.asList(3,4,5,10,7);

		Stream<Integer> st1 = lista.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));

		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));

		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));

		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] { p[1] , p[0] + p[1] } ).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(20).toArray()));
	}
}

//stream.toArray() -- Converte em vetor
//Strem.of() -- Permite adicionar elementos diretamente na stream
//Stream.iterate() -- Recebe um valor de inicio e uma expressão lambda que define como será interado novos valores
//stream.limit() -- Recebe um valor que definie o limite de valores dentro da stream retornando uma nova stream