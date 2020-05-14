package entidades;

public class Retangulo implements Forma
{
	private Double largura, altura;

	//Construtores
	public Retangulo() {}

	public Retangulo(Double largura, Double altura)
	{
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
	public double area()
	{
		return this.getLargura() * this.getAltura();
	}
}