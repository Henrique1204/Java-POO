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
		super();
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

	//Métodos comuns
	public void emprestar(double emprestimo)
	{
		if(emprestimo <= limiteEmprestimo)
		{
			this.setSaldo(this.getSaldo() + emprestimo - 10);
		}
	}
}
