package entidades;

import java.util.Date;

public class HorasContrato
{
	private Date data;
	private Double valorPorHora;
	private Integer horas;

	//Contrutores
	public HorasContrato() {}

	public HorasContrato(Date data, Double valorPorHora, Integer horas)
	{
		this.setData(data);
		this.setValorPorHora(valorPorHora);
		this.setHoras(horas);
	}
	
	//Getters
	public Date getData()
	{
		return data;
	}

	public Double getValorPorHora()
	{
		return valorPorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	//Setters
	public void setData(Date data)
	{
		this.data = data;
	}

	public void setValorPorHora(Double valorPorHora)
	{
		this.valorPorHora = valorPorHora;
	}

	public void setHoras(Integer horas)
	{
		this.horas = horas;
	}

	//Métodos comuns
	public double valorTotal()
	{
		return this.getValorPorHora() * this.getHoras();
	}
}
