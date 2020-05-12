package application;

import java.security.InvalidParameterException;
import java.util.Locale;
import java.util.Scanner;

import servicos.ServicoImposto;
import servicos.ServicoImpostoBrasil;
import servicos.ServicoImpostoUS;

public class Program
{
	public static void main(String[] args)
	{
		try
		{
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			System.out.print("Montante: ");
			double montante = sc.nextDouble();

			System.out.print("Meses: ");
			int meses = sc.nextInt();

			ServicoImposto impostoBR = new ServicoImpostoBrasil(2.0);
			double pagamento = impostoBR.calcularPagamento(montante, meses);

			System.out.println("\nPagamento depoois de " + meses + String.format(" meses: %.2f", pagamento));

			ServicoImposto impostoUS = new ServicoImpostoUS(1.0);
			pagamento = impostoUS.calcularPagamento(montante, meses);

			System.out.println("Pagamento depoois de " + meses + String.format(" meses: %.2f", pagamento));

			sc.close();
		}
		catch(InvalidParameterException e)
		{
			System.out.println(e.getMessage());
		}
	}
}