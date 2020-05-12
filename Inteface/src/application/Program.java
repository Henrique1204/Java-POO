package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entidades.AluguelCarro;
import model.entidades.Veiculo;
import model.servicos.ServicoAluguel;
import model.servicos.ServicoTaxaBrasil;

public class Program
{
	public static void main(String[] args) throws ParseException
	{
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados:");

		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();

		System.out.print("Chegada (DD/MM/AAAA HH:SS): ");
		Date chegada = sdf.parse(sc.nextLine());

		System.out.print("Saída (DD/MM/AAAA HH:SS): ");
		Date saida = sdf.parse(sc.nextLine());

		AluguelCarro aluguelCarro = new AluguelCarro(chegada, saida, new Veiculo(modelo));

		System.out.print("Valor por hora: ");
		double valorHora = sc.nextDouble();

		System.out.print("Valor por dia: ");
		double valorDia = sc.nextDouble();

		ServicoAluguel servicoAluguel = new ServicoAluguel(valorHora, valorDia, new ServicoTaxaBrasil());

		System.out.println("\nResumo:");
		servicoAluguel.processarFatura(aluguelCarro);

		sc.close();
	}
}