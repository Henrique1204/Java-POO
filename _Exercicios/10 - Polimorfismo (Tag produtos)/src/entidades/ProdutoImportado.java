package entidades;

public final class ProdutoImportado extends Produto
{
	private Double taxaImportacao;

	//Construtores
	public ProdutoImportado()
	{
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaImportacao)
	{
		super(nome, preco);
		this.setTaxaImportacao(taxaImportacao);
	}

	//Getters
	public Double getTaxaImportacao()
	{
		return this.taxaImportacao;
	}

	//Setters
	public void setTaxaImportacao(Double taxaImportacao)
	{
		this.taxaImportacao = taxaImportacao;
	}

	//Métodos sobrescrevidos
	@Override
	public final String precoTag()
	{
		return this.getNome() + String.format(" R$ %.2f", this.precoTotal()) + " ( Taxa de importação: " + String.format("R$ %.2f )", this.getTaxaImportacao());
	}

	//Métodos comuns
	public Double precoTotal()
	{
		return this.getPreco() + this.getTaxaImportacao();
	}
}
