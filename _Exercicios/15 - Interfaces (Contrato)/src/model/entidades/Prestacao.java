package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Prestacao
{
	private Date dataVencimento;
	private Double montante;

	//Construtores
	public Prestacao() {}

	public Prestacao(Date dataVencimento, Double montante)
	{
		this.setDataVencimento(dataVencimento);
		this.setMontante(montante);
	}

	//Getters
	public Date getDataVencimento() {
		return this.dataVencimento;
	}

	public Double getMontante() {
		return this.montante;
	}

	//Setters
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public void setMontante(Double montante) {
		this.montante = montante;
	}

	//Métodos sobrescrevidos
	@Override
	public String toString()
	{
		return new SimpleDateFormat("dd/MM/yyyy").format(this.getDataVencimento()) + String.format(" - %.2f", this.getMontante());
	}
}