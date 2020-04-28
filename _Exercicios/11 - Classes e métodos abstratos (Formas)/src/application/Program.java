package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Cor;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Forma> formas = new ArrayList<>();

		System.out.print("Digite o número de formas: ");
		int n = sc.nextInt();

		for(int i = 0; i < n; i++)
		{
			System.out.println("\nDados da forma #" + (i + 1));

			System.out.print("Retângulo ou círculo (r/c): ");
			char res = sc.next().charAt(0);

			System.out.print("Cor (Preto/Azul/Vermelho): ");
			Cor cor = Cor.valueOf(sc.next().toUpperCase());

			switch(res)
			{
				case 'r':
				case 'R':
					System.out.print("Largura: ");
					double largura = sc.nextDouble();

					System.out.print("Altura: ");
					double altura = sc.nextDouble();

					formas.add(new Retangulo(cor, largura, altura));

					break;
				case 'c':
				case 'C':
					System.out.print("Raio: ");
					double raio = sc.nextDouble();

					formas.add(new Circulo(cor, raio));

					break;
				default:
					System.out.println("Respoosta inválida!");
					break;
			}
		}

		System.out.println("\nÁreas das formas:");

		for(Forma forma : formas)
		{
			System.out.println(String.format("%.2f", forma.area()));
		}

		sc.close();
	}
}