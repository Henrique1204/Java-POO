package application;

import java.util.ArrayList;
import java.util.List;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;

public class Program
{
	public static void main(String[] args)
	{
		List<Forma> formas = new ArrayList<>();

		formas.add(new Retangulo(3.0, 2.0));
		formas.add(new Circulo(2.0));

		System.out.printf("Área total: %.2f%n", calcularTAreaTotal(formas));

		List<Circulo> circulos = new ArrayList<>();

		circulos.add(new Circulo(3.0));
		circulos.add(new Circulo(2.0));

		System.out.printf("Área total dos circulos: %.2f%n", calcularTAreaTotal(circulos));
	}

	public static double calcularTAreaTotal(List<? extends Forma> lista)
	{
		if(lista.isEmpty())
		{
			throw new IllegalStateException("A lista nao pode ser vazia");
		}

		double soma = 0.0;

		for(Forma item : lista)
		{
			soma += item.area();
		}

		return soma;
	}
}