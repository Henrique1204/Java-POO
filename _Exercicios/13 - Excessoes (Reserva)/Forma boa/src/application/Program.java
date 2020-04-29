package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reserva;
import model.exceptions.DomainException;

public class Program
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Número do quarto: ");
			int numeroQuarto = sc.nextInt();

			System.out.print("Data do check-in (dd/mm/aaaa): ");
			Date checkIn = sdf.parse(sc.next());

			System.out.print("Data do check-out (dd/mm/aaaa): ");
			Date checkOut = sdf.parse(sc.next());

			Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);

			System.out.print("\nData do check-in (dd/mm/aaaa): ");
			checkIn = sdf.parse(sc.next());

			System.out.print("Data do check-out (dd/mm/aaaa): ");
			checkOut = sdf.parse(sc.next());

			reserva.atualizarDatas(checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
		}
		catch (ParseException e)
		{
			System.out.println("Formato de data inválido!");
		}
		catch (DomainException e)
		{
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e)
		{
			System.out.println("Erro fatal!");
		}

		sc.close();
	}
}