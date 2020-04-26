package application;

import java.util.Locale;
import java.util.Scanner;
import entidade.Retangulo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();

		System.out.print("Digite a altura do retângulo: ");
		retangulo.altura = sc.nextDouble();

		System.out.print("Digite a largur do retângulo: ");
		retangulo.largura = sc.nextDouble();

		retangulo.area();
		retangulo.perimetro();
		retangulo.diagonal();

		sc.close();
	}
}