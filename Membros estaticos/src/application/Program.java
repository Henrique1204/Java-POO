package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculadora;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digiete o valor do raio: ");
		double raio = sc.nextDouble();

		double c = Calculadora.circuferencia(raio);
		double v = Calculadora.volume(raio);

		System.out.printf("Circuferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculadora.PI);

		sc.close();
	}

}