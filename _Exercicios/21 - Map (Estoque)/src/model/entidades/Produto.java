package model.entidades;

public class Produto
{
	private String nome;
	private Double preco;

	//Construtores
	public Produto() {}

	public Produto(String nome, Double preco)
	{
		this.setNome(nome);
		this.setPreco(preco);
	}

	//Getters
	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	//Métodos sobrescrevidos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Produto other = (Produto) obj;

		if (nome == null)
		{
			if (other.nome != null)
				return false;

		}
		else if (!nome.equals(other.nome))
			return false;

		if (preco == null)
		{
			if (other.preco != null)
				return false;

		}
		else if (!preco.equals(other.preco))
			return false;

		return true;
	}
}