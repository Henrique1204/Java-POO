package application;

import java.util.Map;
import java.util.TreeMap;

public class Program
{
	public static void main(String[] args)
	{
		Map<String, String> cookies = new TreeMap<>();

		cookies.put("nomeUser", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("fone", "12345678");

		cookies.remove("email");
		cookies.put("fone", "87654321");

		System.out.println("Contains 'fone' key: " + cookies.containsKey("fone"));
		System.out.println("Numero telefone: " + cookies.get("fone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());

		System.out.println("TODOS OS COOKIES");
		for(String key : cookies.keySet())
		{
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}