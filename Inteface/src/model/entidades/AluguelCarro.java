package model.entidades;

import java.util.Date;

public class AluguelCarro
{
	private Date chegada;
	private Date saida;
	private Veiculo veiculo;
	private Fatura fatura;

	//Construtores
	public AluguelCarro() {}

	public AluguelCarro(Date chegada, Date saida, Veiculo veiculo)
	{
		this.setChegada(chegada);
		this.setSaida(saida);
		this.setVeiculo(veiculo);
	}

	//Getters
	public Date getChegada()
	{
		return this.chegada;
	}

	public Date getSaida()
	{
		return this.saida;
	}

	public Veiculo getVeiculo()
	{
		return this.veiculo;
	}

	public Fatura getFatura()
	{
		return this.fatura;
	}

	//Setters
	public void setChegada(Date chegada)
	{
		this.chegada = chegada;
	}

	public void setSaida(Date saida)
	{
		this.saida = saida;
	}

	public void setVeiculo(Veiculo veiculo)
	{
		this.veiculo = veiculo;
	}

	public void setFatura(Fatura fatura)
	{
		this.fatura = fatura;
	}
}