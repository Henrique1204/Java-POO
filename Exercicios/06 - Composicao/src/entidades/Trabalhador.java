package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import entidades.enums.TrabalhadorLevel;

public class Trabalhador
{
	private String nome;
	private TrabalhadorLevel level;
	private Double salarioBase;

	private Departamento departamento;
	private List<HorasContrato> contratos = new ArrayList<>();

	//Construtores
	public Trabalhador() {};

	public Trabalhador(String nome, TrabalhadorLevel level, Double salarioBase, Departamento departamento)
	{
		this.setNome(nome);
		this.setLevel(level);
		this.setSalarioBase(salarioBase);
		this.setDepartamento(departamento);
	}

	//Getters
	public String getNome()
	{
		return this.nome;
	}

	public TrabalhadorLevel getLevel()
	{
		return this.level;
	}

	public Double getSalarioBase()
	{
		return this.salarioBase;
	}

	public Departamento getDepartamento()
	{
		return this.departamento;
	}

	public List<HorasContrato> getContratos() {
		return this.contratos;
	}

	//Setters
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setLevel(TrabalhadorLevel level)
	{
		this.level = level;
	}

	public void setSalarioBase(Double salarioBase)
	{
		this.salarioBase = salarioBase;
	}

	public void setDepartamento(Departamento departamento)
	{
		this.departamento = departamento;
	}

	//Métodos Sobrescrescidos
	@Override
	public String toString()
	{
		return "Nome: " + this.getNome() + ".\n" + "Departamento: " + this.getDepartamento().getNome() + ".";
	}

	//Métodos comuns
	public void addContrato(HorasContrato contrato)
	{
		this.contratos.add(contrato);
	}

	public void removeContrato(HorasContrato contrato)
	{
		this.contratos.remove(contrato);
	}

	public double renda(Integer ano, Integer mes)
	{
		double soma = this.getSalarioBase();
		//Instanciando ocalendar
		Calendar cal = Calendar.getInstance();

		for(HorasContrato contrato : contratos)
		{
			//Definindo a data do calendar
			cal.setTime(contrato.getData());

			//Recebdno um valor especifico do calendar
			int contrato_ano = cal.get(Calendar.YEAR);
			int contrato_mes = 1 + cal.get(Calendar.MONTH);

			soma += ( contrato_ano == ano && contrato_mes == mes ) ? contrato.valorTotal() : 0 ;
		}

		return soma;
	}
}