package servicos;

public class ServicoImpostoUS implements ServicoImposto
{
	private Double taxa;

	//construtores
	public ServicoImpostoUS() {}

	public ServicoImpostoUS(Double taxa)
	{
		this.taxa = taxa;
	}

	//M�todos imterface
	@Override
	public double getTaxa()
	{
		return this.taxa;
	}
}
