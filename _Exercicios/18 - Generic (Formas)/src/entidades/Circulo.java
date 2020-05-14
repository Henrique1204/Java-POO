package entidades;

public class Circulo implements Forma
{
	private Double raio;

	//Contrutores
	public Circulo() {}

	public Circulo(Double raio)
	{
		this.setRaio(raio);
	}

	//Getters
	public Double getRaio() {
		return raio;
	}

	//Setters
	public void setRaio(Double raio) {
		this.raio = raio;
	}

	//Métodos sobrescrevidos
	@Override
	public double area()
	{
		return Math.PI * raio * raio;
	}
}