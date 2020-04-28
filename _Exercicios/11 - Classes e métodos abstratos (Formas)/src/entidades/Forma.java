package entidades;

import entidades.enums.Cor;

public abstract class Forma
{
	private Cor cor;

	//Contrutores
	public Forma() {}

	public Forma(Cor cor)
	{
		this.setCor(cor);
	}

	//Getters
	public Cor getCor()
	{
		return this.cor;
	}

	//Setters
	public void setCor(Cor cor)
	{
		this.cor = cor;
	}

	//Métodos abstratos
	public abstract Double area();
}
