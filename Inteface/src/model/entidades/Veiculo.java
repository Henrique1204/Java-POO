package model.entidades;

public final class Veiculo
{
	private String modelo;

	//Contrutores
	public Veiculo() {}

	public Veiculo(String modelo)
	{
		this.setModelo(modelo);
	}

	//Getters
	public String getModelo()
	{
		return this.modelo;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
}