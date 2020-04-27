package entidades;

public class ContaPoupanca extends Conta
{
	private Double taxaJuro;

	//Construtores
	public ContaPoupanca()
	{
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuro) {
		super(numero, titular, saldo);
		this.setTaxaJuro(taxaJuro);
	}

	//Getters
	public Double getTaxaJuro() {
		return taxaJuro;
	}

	//Setters
	public void setTaxaJuro(Double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}

	//Métodos comuns
	public void atualizarSaldo()
	{
		this.setSaldo( this.getSaldo() + saldo * taxaJuro );
	}
}
