package model.entidades;

import java.util.Date;

public class Acesso
{
	private String usuario;
	private Date horario;

	//Construtores
	public Acesso() {}

	public Acesso(String usuario, Date horaroio)
	{
		this.setUsuario(usuario);
		this.setHorario(horaroio);
	}

	//Getters
	public String getUsuario()
	{
		return this.usuario;
	}

	public Date getHorario()
	{
		return this.horario;
	}

	//Setters
	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}

	public void setHorario(Date horario)
	{
		this.horario = horario;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Acesso other = (Acesso) obj;

		if (usuario == null)
		{
			if (other.usuario != null)
				return false;

		}
		else if (!usuario.equals(other.usuario))
			return false;

		return true;
	}	
}
