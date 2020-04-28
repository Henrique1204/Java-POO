package entidades;

public final class PessoaJuridica extends Pessoa
{
	private Integer numeroFuncionarios;

	//Contrutores
	public PessoaJuridica()
	{
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios)
	{
		super(nome, rendaAnual);
		this.setNumeroFuncionarios(numeroFuncionarios);
	}

	//Getters
	public Integer getNumeroFuncionarios()
	{
		return this.numeroFuncionarios;
	}

	//Setters
	public void setNumeroFuncionarios(Integer numeroFuncionarios)
	{
		this.numeroFuncionarios = numeroFuncionarios;
	}

	//Métodos sobrescrevidos
	@Override
	public final Double calcularImposto()
	{
		return this.getNumeroFuncionarios() > 10 ? this.getRendaAnual() * 0.14 : this.getRendaAnual() * 0.16;
	}
}
