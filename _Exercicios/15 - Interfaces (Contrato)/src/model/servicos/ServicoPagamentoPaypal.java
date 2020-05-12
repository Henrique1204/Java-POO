package model.servicos;

public class ServicoPagamentoPaypal implements ServicoPagamento
{
	private final static double JUROSLIVRE = 0.01;
	private final static double JUROSPAYPAL = 0.02;
	
	//Métodos da interface
	@Override
	public double calcularPagamentoLivre(double montante)
	{
		return montante * JUROSPAYPAL;
	}

	@Override
	public double calcularPagamento(double montante, int meses)
	{
		return montante * JUROSLIVRE * meses;
	}
}