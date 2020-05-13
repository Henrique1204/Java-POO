package applicatiion;

import entidade.Cliente;

public class Program
{
	public static void main(String[] args)
	{
		Cliente c1 = new Cliente("Maria", "maria@gmail.com");
		Cliente c2 = new Cliente("Maria", "maria@gmail.com");

		String s1 = "Teste";
		String s2 = "Teste";

		System.out.println("Maria: " + c1.hashCode());
		System.out.println("Alex: " + c2.hashCode());
		System.out.println("São iguais: " + c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
	}
}