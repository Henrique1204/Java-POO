package entidades;

import entidades.enums.Cor;

public final class Retangulo extends Forma
{
	private Double largura;
	private Double altura;

	//Contrutores
	public Retangulo()
	{
		super();
	}

	public Retangulo(Cor cor, Double largura, Double altura)
	{
		super(cor);
		this.setLargura(largura);
		this.setAltura(altura);
	}

	//Getters
	public Double getLargura()
	{
		return this.largura;
	}

	public Double getAltura()
	{
		return this.altura;
	}

	//Setters
	public void setLargura(Double largura)
	{
		this.largura = largura;
	}

	public void setAltura(Double altura)
	{
		this.altura = altura;
	}

	//Métodos sobrescrevidos
	@Override
	public final Double area()
	{
		return largura * altura;
	}
}
