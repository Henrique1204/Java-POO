package entidades;

public class Comentario
{
	private String texto;

	//Construtores
	public Comentario() {}

	public Comentario(String texto)
	{
		this.setTexto(texto);
	}

	//Getter e Setter
	public String getTexto()
	{
		return this.texto;
	}

	public void setTexto(String texto)
	{
		this.texto = texto;
	}
}
