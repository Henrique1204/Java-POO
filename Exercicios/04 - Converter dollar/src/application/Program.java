package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculadora;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a cotação do dollar: ");
		double cotacao = sc.nextDouble();

		System.out.print("Digite a quantidade de dollar que você quer comprar: ");
		double quant = sc.nextDouble();

		Calculadora.converterDollar(cotacao, quant);

		sc.close();
	}
}