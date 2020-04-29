package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva
{
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;

	//Contrutores
	public Reserva() {}

	public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut)
	{
		this.setNumeroQuarto(numeroQuarto);
		this.setCheckIn(checkIn);
		this.setCheckOut(checkOut);
	}

	//Getters
	public Integer getNumeroQuarto()
	{
		return this.numeroQuarto;
	}

	public Date getCheckIn()
	{
		return this.checkIn;
	}

	public Date getCheckOut()
	{
		return this.checkOut;
	}

	//Setters
	public void setNumeroQuarto(Integer numeroQuarto)
	{
		this.numeroQuarto = numeroQuarto;
	}

	public void setCheckIn(Date checkIn)
	{
		this.checkIn = checkIn;
	}

	public void setCheckOut(Date checkOut)
	{
		this.checkOut = checkOut;
	}

	//Métodos sobrescresvidoos
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append( "Quarto " + this.getNumeroQuarto() );
		sb.append( ", Check-in: " + sdf.format(this.getCheckIn()) );
		sb.append( ", Check-out: " + sdf.format(this.getCheckOut()) );
		sb.append( ", " + this.calcularDuracao() + " noites." );

		return sb.toString();
	}

	//Métodos comuns
	public long calcularDuracao()
	{
		long dif = this.getCheckOut().getTime() - this.getCheckIn().getTime();
		return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
	}

	public void atualizarDatas(Date checkIn, Date checkOut)
	{
		this.setCheckIn(checkIn);
		this.setCheckOut(checkOut);
	}
}
