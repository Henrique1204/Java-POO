package application;

import java.util.Locale;
import java.util.Scanner;
import entidades.Funcionario;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();

		System.out.print("Digite o nome do funcion�rio: ");
		funcionario.nome = sc.nextLine();

		System.out.print("Digite o sal�rio bruto do funcion�rio: ");
		funcionario.salarioBruto = sc.nextDouble();

		System.out.print("Digite o imposto sob o sal�rio: ");
		funcionario.imposto = sc.nextDouble();

		System.out.println(funcionario.toString());

		System.out.print("Digite a porcentagem de aumento do sal�rio: ");
		double porcentagemDeAumento = sc.nextDouble();

		funcionario.aumentarSalario(porcentagemDeAumento);

		sc.close();
	}
}