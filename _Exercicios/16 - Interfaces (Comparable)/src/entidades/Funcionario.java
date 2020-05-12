package entidades;

//Para implementar a interface é preciso passar o tipo que vai ser comparado, no caso o próprio tipo
public class Funcionario implements Comparable<Funcionario>
{
	private String nome;
	private Double salario;

	//Construtores
	public Funcionario() {}

	public Funcionario(String nome, Double salario)
	{
		this.setNome(nome);
		this.setSalario(salario);
	}

	//Getters
	public String getNome()
	{
		return this.nome;
	}

	public Double getSalario()
	{
		return this.salario;
	}

	//Setters
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setSalario(Double salario)
	{
		this.salario = salario;
	}

	//Métodos da interface
	//ComparaTo compara os valores e retorna uma valor negativo se for menor, positio se for maior e 0 se for igual
	//O sinal de menos antes inverte a ordem crescente para decrescente
	@Override
	public int compareTo(Funcionario outro) {
		return -this.getSalario().compareTo(outro.getSalario());
	}
}