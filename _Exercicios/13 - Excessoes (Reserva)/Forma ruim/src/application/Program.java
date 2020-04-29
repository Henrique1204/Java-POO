package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program
{
	public static void main(String[] args)
	{
		metodo1();
		System.out.println("Fim do program!");
	}

	public static void metodo1()
	{
		System.out.println("### M�todo1 Iniciou ###");
		metodo2();
		System.out.println("### M�todo1 Encrrou ###");
	}

	public static void metodo2()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("### M�todo2 Iniciou ###");
		try
		{
			String[] vetor = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vetor[posicao]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Posi��o inv�lida!");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e)
		{
			System.out.println("Valor inv�lido");
		}
		System.out.println("### M�todo2 encerrou ###");

		sc.close();
	}
}