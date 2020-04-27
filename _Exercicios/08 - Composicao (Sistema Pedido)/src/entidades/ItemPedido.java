package entidades;

public class ItemPedido
{
	private Produto produto;
	private Integer quantidade;
	private Double preco;

	//Construtores
	public ItemPedido() {}

	public ItemPedido(Produto produto, Integer quantidade)
	{
		this.setProduto(produto);
		this.setQuantidade(quantidade);
	}

	//Getters
	public Produto getProduto()
	{
		return this.produto;
	}

	public Integer getQuantidade()
	{
		return this.quantidade;
	}

	public Double getPreco()
	{
		return this.preco;
	}

	//Setters
	public void setProduto(Produto produto)
	{
		this.produto = produto;
		this.setPreco(produto.getPreco());
	}

	public void setQuantidade(Integer quantidade)
	{
		this.quantidade = quantidade;
	}

	private void setPreco(Double preco)
	{
		this.preco = preco;
	}

	//Métodos comuns
	public Double subTotal()
	{
		return this.getQuantidade() * this.getPreco();
	}

	//Métodos sobrescrevidos
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(this.getProduto().toString());
		sb.append(", Quantidade: " + this.getQuantidade() + String.format(", Subtotal: R$ %.2f", this.subTotal()) );

		return sb.toString();
	}
}
