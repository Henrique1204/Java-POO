package util;

public class Calculadora {
	public static final double PI = 3.14159;
	
	public static double circuferencia(double valor) {
		return 2 * valor * PI;
	}

	public static double volume(double valor) {
		return 4 * PI * valor * valor * valor / 3;
	}
}