package entidades;

public final class PessoaFisica extends Pessoa
{
	private Double gastosSaude;

	//Construtores
	public PessoaFisica()
	{
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude)
	{
		super(nome, rendaAnual);
		this.setGastosSaude(gastosSaude);
	}

	//Getters
	public Double getGastosSaude()
	{
		return this.gastosSaude;
	}

	//Setters
	public void setGastosSaude(Double gastosSaude)
	{
		this.gastosSaude = gastosSaude;
	}

	//Métodos sobrescresvido
	@Override
	public final Double calcularImposto()
	{
		double rendaAnual = this.getRendaAnual() > 20000.00 ? this.getRendaAnual() * 0.25 : this.getRendaAnual() * 0.15 ;
		return rendaAnual - (this.getGastosSaude() * 0.5);
	}
}