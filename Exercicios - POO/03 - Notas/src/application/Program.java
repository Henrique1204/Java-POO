package application;

import java.util.Scanner;
import entidades.Aluno;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();

		System.out.print("Digite a nota do primeiro trimestre: ");
		aluno._1trimestre = sc.nextInt();

		System.out.print("Digite a nota do segundo trimestre: ");
		aluno._2trimestre = sc.nextInt();

		System.out.print("Digite a nota do terceiro trimestre: ");
		aluno._3trimestre = sc.nextInt();

		aluno.calcularNotaFinal();

		sc.close();
	}
}