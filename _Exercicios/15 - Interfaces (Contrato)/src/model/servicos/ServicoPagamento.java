package model.servicos;

public interface ServicoPagamento
{
	public double calcularPagamentoLivre(double montante);
	public double calcularPagamento(double montante, int meses);
}
