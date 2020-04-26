package entidades;

public class Aluno {
	public String nome;
	public int _1trimestre, _2trimestre, _3trimestre;

	public void calcularNotaFinal() {
		int notaFinal = _1trimestre + _2trimestre +_3trimestre;

		if(notaFinal > 60)
		{
			System.out.println("Nota final: " + notaFinal);
			System.out.print("Aprovado!");
		}
		else
		{
			System.out.println("Nota final: " + notaFinal);
			System.out.println("Reprovado!");
			System.out.print("Quantos pontos faltou: " + (60 - notaFinal));
		}
	}
}
