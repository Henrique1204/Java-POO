package entidades;

public class Funcionario {
	public String nome;
	public double salarioBruto, imposto;

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public void aumentarSalario(double valor) {
		double aumento = (salarioBruto / 100) * valor;
		salarioBruto += aumento;

		System.out.println("Dados Atualizados: " + nome + ", $ " + String.format("%.2f", salarioLiquido()));
	}

	public String toString() {
		return "Funcionário: " + nome + ", $ " + String.format("%.2f", salarioLiquido());
	}
}