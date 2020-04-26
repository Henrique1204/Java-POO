package entidade;

public class Retangulo {
	public double altura, largura;

	public void area() {
		System.out.println("Area: " + String.format("%.2f", altura * largura));
	}

	public void perimetro() {
		System.out.println("Perimetro: " + String.format("%.2f", altura * 2 + largura * 2));
	}

	public void diagonal() {
		double ca = Math.pow(altura, 2);
		double co = Math.pow(largura, 2);
		double h = Math.sqrt(ca + co);

		System.out.print("Diagonal: " + String.format("%.2f", h));
	}
}
