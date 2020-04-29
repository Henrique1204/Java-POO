package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reserva;

public class Program
{
	public static void main(String[] args) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Número do quarto: ");
		int numeroQuarto = sc.nextInt();

		System.out.print("Data do check-in (dd/mm/aaaa): ");
		Date checkIn = sdf.parse(sc.next());

		System.out.print("Data do check-out (dd/mm/aaaa): ");
		Date checkOut = sdf.parse(sc.next());

		if(!checkOut.after(checkIn))
		{
			System.out.println("Erro na reserva: a data de check-out é anterior a data de check-in.");
		}
		else
		{
			Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);

			System.out.print("\nData do check-in (dd/mm/aaaa): ");
			checkIn = sdf.parse(sc.next());

			System.out.print("Data do check-out (dd/mm/aaaa): ");
			checkOut = sdf.parse(sc.next());

			Date agora = new Date();
			if(checkIn.before(agora) || checkOut.before(agora))
			{
				System.out.println("Erro na reserva: as datas para atualização de reserva devem ser datas futuras.");
			}
			else
			{
				if(!checkOut.after(checkIn))
				{
					System.out.println("Erro na reserva: a data de check-out é anterior a data de check-in.");
				}
				else
				{
					reserva.atualizarDatas(checkIn, checkOut);
					System.out.println("Reserva: " + reserva);
				}
			}
		}

		sc.close();
	}
}