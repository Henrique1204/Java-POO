package util;

public class Calculadora {
	public static double calcularImposto(double valor) {
		return valor / 100 * 6;
	}

	public static void converterDollar(double cotacao, double quant) {
		double precoDollar = cotacao * quant  + calcularImposto(cotacao * quant);
		System.out.println("Você deverá pagar: $ " + String.format("%.2f", precoDollar) + " considerando os juros.");
	}
}