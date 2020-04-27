package entidades;

public class ContaNegocio extends Conta
{
	private Double limiteEmprestimo;

	public ContaNegocio()
	{
		super();
	}

	public ContaNegocio(Integer numero, String titular, Double saldo, Double limiteEmprestimo)
	{
		super(numero, titular, saldo);
		this.setLimiteEmprestimo(limiteEmprestimo);
	}

	//Getters
	public Double getLimiteEmprestimo()
	{
		return this.limiteEmprestimo;
	}

	//Setters
	public void setLimiteEmprestimo(Double limiteEmprestimo)
	{
		this.limiteEmprestimo = limiteEmprestimo;
	}

	//Métodos sobrescrevidos
	@Override
	public void sacar(double valor)
	{
		super.sacar(valor);
		this.setSaldo(this.getSaldo() - 2);
	}

	//Métodos comuns
	public void emprestar(double emprestimo)
	{
		if(emprestimo <= limiteEmprestimo)
		{
			this.setSaldo(this.getSaldo() + emprestimo - 10);
		}
	}
}
