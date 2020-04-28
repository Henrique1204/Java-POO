package entidades;

import entidades.enums.Cor;

public final class Circulo extends Forma
{
	private Double raio;

	//Construtores
	public Circulo()
	{
		super();
	}

	public Circulo(Cor cor, Double raio)
	{
		super(cor);
		this.setRaio(raio);
	}

	//Getters
	public Double getRaio()
	{
		return this.raio;
	}

	//Setters
	public void setRaio(Double raio)
	{
		this.raio = raio;
	}

	//Métods sobrescrevidos
	@Override
	public final Double area()
	{
		return Math.PI * raio * raio;
	}
}
