package entidades;

public class EmpregadoTercerizado extends Empregado
{
	private Double cargaAdicional;

	//Contrutores
	public EmpregadoTercerizado()
	{
		super();
	}

	public EmpregadoTercerizado(String nome, Integer horas, Double valorHora, Double cargaAdicional)
	{
		super(nome, horas, valorHora);
		this.setCargaAdicional(cargaAdicional);
	}

	//Getters
	public Double getCargaAdicional()
	{
		return this.cargaAdicional;
	}

	//Setters
	public void setCargaAdicional(Double cargaAdicional)
	{
		this.cargaAdicional = cargaAdicional;
	}

	//Métodos sobrescrevidos
	@Override
	public double pagar()
	{
		return super.pagar() + cargaAdicional * 1.1;
	}
}
