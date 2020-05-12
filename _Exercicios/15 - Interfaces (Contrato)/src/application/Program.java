package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entidades.Contrato;
import model.entidades.Prestacao;
import model.servicos.ServicoContrato;
import model.servicos.ServicoPagamentoPaypal;

public class Program
{
	public static void main(String[] args) throws ParseException
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados de contrato");

		System.out.print("Número contrato: ");
		String numeroContrato = sc.next();

		System.out.print("Data (DD/MM/AAAA): ");
		Date dataContrato = new SimpleDateFormat("dd/MM/yyyy").parse(sc.next());

		System.out.print("Valor do contrato: ");
		double valorContrato = sc.nextDouble();

		Contrato contrato = new Contrato(numeroContrato, dataContrato, valorContrato);

		System.out.print("Número de parcelas: ");
		int numeroParcelas = sc.nextInt();

		ServicoContrato servicoContrato = new ServicoContrato(new ServicoPagamentoPaypal());

		servicoContrato.processarContrato(contrato, numeroParcelas);

		System.out.println("\nPRESTAÇÕES");

		for(Prestacao prestacao : contrato.getPrestacoes())
		{
			System.out.println(prestacao);
		}

		sc.close();
	}
}