package model.servicos;

public class ServicoTaxaBrasil implements ServicoTaxa
{
	public double taxa(double montante)
	{
		return (montante > 100) ? montante * 0.15 : montante * 0.20;
	}
}
