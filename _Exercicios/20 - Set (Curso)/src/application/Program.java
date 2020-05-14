package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Set<Integer> cursoA = new HashSet<>();
		Set<Integer> cursoB = new HashSet<>();
		Set<Integer> cursoC = new HashSet<>();

		System.out.print("Quantos alunos no curso A: ");
		int alunos = sc.nextInt();

		for(int i = 0; i < alunos; i++)
		{
			System.out.print("Código do aluno: ");
			int codigoAluno = sc.nextInt();

			cursoA.add(codigoAluno);
		}

		System.out.print("Quantos alunos no curso B: ");
		alunos = sc.nextInt();

		for(int i = 0; i < alunos; i++)
		{
			System.out.print("Código do aluno: ");
			int codigoAluno = sc.nextInt();

			cursoB.add(codigoAluno);
		}

		System.out.print("Quantos alunos no curso C: ");
		alunos = sc.nextInt();

		for(int i = 0; i < alunos; i++)
		{
			System.out.print("Código do aluno: ");
			int codigoAluno = sc.nextInt();

			cursoC.add(codigoAluno);
		}

		Set<Integer> totalAlunos = new HashSet<>(cursoA);
		totalAlunos.addAll(cursoB);
		totalAlunos.addAll(cursoC);

		System.out.println("Total de estudantes: " + totalAlunos.size());

		sc.close();
	}
}