package servicos;

public class ServicoImpostoBrasil implements ServicoImposto
{
	private Double taxa;

	//construtores
	public ServicoImpostoBrasil() {}

	public ServicoImpostoBrasil(Double taxa)
	{
		this.taxa = taxa;;
	}

	//M�todos imterface
	@Override
	public double getTaxa()
	{
		return this.taxa;
	}
}
