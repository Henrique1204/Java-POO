package model.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Contrato
{
	private String numeroContrato;
	private Date dataContrato;
	private Double valorContrato;

	private List<Prestacao> prestacoes = new ArrayList<>();

	//Construtores
	public Contrato() {}

	public Contrato(String numeroContrato, Date dataContrato, Double valorContrato)
	{
		this.setNumeroContrato(numeroContrato);
		this.setDataContrato(dataContrato);
		this.setValorContrato(valorContrato);
	}

	//Getters
	public String getNumeroContrato()
	{
		return this.numeroContrato;
	}

	public Date getDataContrato()
	{
		return this.dataContrato;
	}

	public Double getValorContrato()
	{
		return this.valorContrato;
	}

	public List<Prestacao> getPrestacoes()
	{
		return this.prestacoes;
	}

	//Setters
	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}

	//Manipular lista prestacoes
	public void addPrestacao(Prestacao prestacao)
	{
		this.prestacoes.add(prestacao);
	}

	public void removerPrestacao(Prestacao prestacao)
	{
		this.prestacoes.add(prestacao);
	}
}