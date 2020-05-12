package model.entidades;

public class Fatura
{
	private Double pagamentoBasico;
	private Double taxa;

	//Construtores
	public Fatura() {}

	public Fatura(Double pagamentoBasico, Double taxa)
	{
		this.setPagamentoBasico(pagamentoBasico);
		this.setTaxa(taxa);
	}

	//Getters
	public Double getPagamentoBasico()
	{
		return this.pagamentoBasico;
	}

	public Double getTaxa()
	{
		return this.taxa;
	}

	//Setters
	public void setPagamentoBasico(Double pagamentoBasico)
	{
		this.pagamentoBasico = pagamentoBasico;
	}

	public void setTaxa(Double taxa)
	{
		this.taxa = taxa;
	}

	//Métodos implementados
	public Double getTotalPagamento()
	{
		return this.getPagamentoBasico() + this.getTaxa();
	}
}
